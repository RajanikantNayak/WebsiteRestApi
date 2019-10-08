/*package com.website.restfull.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.website.restfull.Model.Website;
import com.website.restfull.service.WebsiteGraphService;

@Component
public class WebsiteMutation implements GraphQLMutationResolver {
	
	@Autowired
	private WebsiteGraphService graphService;
	
	public Website createWebsite(final String name, final String url) {
		return this.graphService.createWebsite(name, url);
	}

}
*/