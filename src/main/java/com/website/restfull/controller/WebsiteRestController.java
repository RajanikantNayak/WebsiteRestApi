package com.website.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.website.restfull.dto.WebsiteVo;
import com.website.restfull.service.IWebsiteService;

@RestController
@RequestMapping(value = "/website")
public class WebsiteRestController {
	
	@Autowired
	private IWebsiteService service;
	
	@PostMapping("/saveWeb")
	public ResponseEntity<String> saveWebsite(@RequestBody WebsiteVo websiteVo) {
		service.saveWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully saved", HttpStatus.OK);
	}
	
	@GetMapping("/getWebSiteList")
	public ResponseEntity<List<WebsiteVo>> getWebsiteList() {
		return new ResponseEntity<List<WebsiteVo>>(service.getWebsiteList(), HttpStatus.OK);
	}
	
	@GetMapping("/getWebSiteBy/{id}")
	public ResponseEntity<WebsiteVo> getWebsite(@PathVariable Integer id) {
		return new ResponseEntity<WebsiteVo>(service.getWebsiteById(id), HttpStatus.OK);
	}
	
	@PutMapping("/updateWebsite")
	public ResponseEntity<String> updateWebsite(@RequestBody WebsiteVo websiteVo) {
		service.updateWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully updated", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteWebsite")
	public ResponseEntity<String> deleteWebsite(@RequestBody WebsiteVo websiteVo) {
		service.deleteWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully deleted", HttpStatus.OK);
	}

}
