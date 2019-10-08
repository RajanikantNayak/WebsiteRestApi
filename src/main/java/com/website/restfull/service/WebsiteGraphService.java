/*package com.website.restfull.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.website.restfull.Model.Website;
import com.website.restfull.repository.WebsiteRepository;

@Service
public class WebsiteGraphService {
	
	private final WebsiteRepository repository;

	public WebsiteGraphService(final WebsiteRepository repository) {
		this.repository = repository;
	}
	
	@Transactional
	public Website createWebsite(final String name, final String url) {
		final Website website = new Website();
		website.setName(name);
		website.setUrl(url);
		return this.repository.save(website);
	}
	
	@Transactional
	public List<Website> getWebsites(final int count) {
		return this.repository.findAll().stream().limit(count).collect(Collectors.toList());
	}
	
	@Transactional
	public Optional<Website> getWebsite(final int id) {
		return this.repository.findById(id);
		
	}

}
*/