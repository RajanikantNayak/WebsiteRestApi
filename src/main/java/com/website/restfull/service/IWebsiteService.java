package com.website.restfull.service;

import java.util.List;

import com.website.restfull.dto.WebsiteVo;

public interface IWebsiteService {
	
	List<WebsiteVo> getWebsiteList();
	WebsiteVo getWebsiteById(Integer id);
	void saveWebsite(WebsiteVo vo);
	void updateWebsite(WebsiteVo vo);
	void deleteWebsite(WebsiteVo vo);

}
