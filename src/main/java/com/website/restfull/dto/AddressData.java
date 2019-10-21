package com.website.restfull.dto;

import java.util.Optional;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddressData {
	@Getter
	@Setter
	private Optional<String> inputId;
	@Getter
	@Setter
	private Optional<String> organization;
	@Getter
	@Setter
	private Optional<String> address1;
	@Getter
	@Setter
	private Optional<String> address2;
	@Getter
	@Setter
	private Optional<String> locality;
	@Getter
	@Setter
	private Optional<String> administrativeArea;
	@Getter
	@Setter
	private Optional<String> country;
	@Getter
	@Setter
	private Optional<String> postalCode;
	@Getter
	@Setter
	private Optional<String> geoCode;

	public Optional<String> getInputId() {
		return inputId;
	}

	public void setInputId(Optional<String> inputId) {
		this.inputId = inputId;
	}

	public Optional<String> getOrganization() {
		return organization;
	}

	public void setOrganization(Optional<String> organization) {
		this.organization = organization;
	}

	public Optional<String> getAddress1() {
		return address1;
	}

	public void setAddress1(Optional<String> address1) {
		this.address1 = address1;
	}

	public Optional<String> getAddress2() {
		return address2;
	}

	public void setAddress2(Optional<String> address2) {
		this.address2 = address2;
	}

	public Optional<String> getLocality() {
		return locality;
	}

	public void setLocality(Optional<String> locality) {
		this.locality = locality;
	}

	public Optional<String> getAdministrativeArea() {
		return administrativeArea;
	}

	public void setAdministrativeArea(Optional<String> administrativeArea) {
		this.administrativeArea = administrativeArea;
	}

	public Optional<String> getCountry() {
		return country;
	}

	public void setCountry(Optional<String> country) {
		this.country = country;
	}

	public Optional<String> getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Optional<String> postalCode) {
		this.postalCode = postalCode;
	}

	public Optional<String> getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(Optional<String> geoCode) {
		this.geoCode = geoCode;
	}

}
