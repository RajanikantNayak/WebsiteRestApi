package com.website.restfull.service;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.smartystreets.api.ClientBuilder;
import com.smartystreets.api.StaticCredentials;
import com.smartystreets.api.exceptions.SmartyException;
import com.smartystreets.api.international_street.Candidate;
import com.smartystreets.api.international_street.Client;
import com.smartystreets.api.international_street.Lookup;
import com.website.restfull.dto.AddressData;
import com.website.restfull.exception.WebsiteException;

@Service
public class StreetValidation {
	
	@Autowired
	Environment env;

	public String validateStreetAddress(AddressData addressData) {
		try {

			StaticCredentials credentials = new StaticCredentials(addressData.getInputId().orElse(null),
					env.getProperty("auth.token"));
			com.smartystreets.api.international_street.Client client = new ClientBuilder(credentials)
					.buildInternationalStreetApiClient();

			lookup(client, addressData);
			return "Success";
		} catch (Exception ee) {
			throw new WebsiteException("99", "Validating Address from Ext api error", ee.getMessage());
		}

	}

	private void lookup(Client client, AddressData addressData) throws Exception {
		Lookup lookups = new Lookup("Rua Padre Antonio D'Angelo 121 Casa Verde, Sao Paulo", "Brazil");
		lookups.setInputId(addressData.getInputId().orElse(null));
		lookups.setOrganization(addressData.getOrganization().orElse(null));
		lookups.setAddress1(addressData.getAddress1().orElse(null));
		lookups.setAddress2(addressData.getAddress2().orElse(null));
		lookups.setLocality(addressData.getLocality().orElse(null));
		lookups.setAdministrativeArea(addressData.getAdministrativeArea().orElse(null));
		lookups.setCountry(addressData.getCountry().orElse(null));
		lookups.setPostalCode(addressData.getPostalCode().orElse(null));
		lookups.setGeocode(Boolean.parseBoolean(addressData.getGeoCode().orElse(null)));

		Candidate[] candidates = null;
		try {
			candidates = client.send(lookups);
		} catch (IOException | SmartyException e) {
			// TODO Auto-generated catch block
			throw new Exception(e.getMessage());
		}
		Candidate firstCandidate = candidates[0];

		System.out.println("Address is " + firstCandidate.getAnalysis().getVerificationStatus());
		System.out.println("Address precision: " + firstCandidate.getAnalysis().getAddressPrecision() + "\n");

		System.out.println("First Line: " + firstCandidate.getAddress1());
		System.out.println("Second Line: " + firstCandidate.getAddress2());
		System.out.println("Third Line: " + firstCandidate.getAddress3());
		System.out.println("Fourth Line: " + firstCandidate.getAddress4());
		System.out.println("Latitude: " + firstCandidate.getMetadata().getLatitude());
		System.out.println("Longitude: " + firstCandidate.getMetadata().getLongitude());

	}

}
