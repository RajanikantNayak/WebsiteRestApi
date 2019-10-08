/*package com.website.restfull.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.website.restfull.Model.Website;
import com.website.restfull.service.WebsiteGraphService;

@Component
public class WebsiteQuery implements GraphQLQueryResolver {
	
	@Autowired
	private WebsiteGraphService graphService;
	
	public List<Website> getWebsites(final int count){
		return this.graphService.getWebsites(count);
	}
	
	public Optional<Website> getWebsite(final int id){
		return this.graphService.getWebsite(id);
	}

}
*/