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

import io.swagger.annotations.*;

@RestController
@RequestMapping(value = "/website")
@Api(value = "API to Retreive Website Info by GraphQl Services", description = "This API provides the capability to perform CRUD operation in a Websites "
		+ "database maintained in h2 database", produces = "application/json")
public class WebsiteRestController {

	@Autowired
	private IWebsiteService service;

	@ApiOperation(value = "Create a new Website", consumes = "application/json")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "ID", required = false, dataType = "Integer", paramType = "body"),
			@ApiImplicitParam(name = "name", value = "Name of Website", required = true, dataType = "String", paramType = "body"),
			@ApiImplicitParam(name = "url", value = "Url of Website", required = true, dataType = "String", paramType = "body") })
	@PostMapping("/saveWeb")
	public ResponseEntity<String> saveWebsite(@RequestBody WebsiteVo websiteVo) {
		service.saveWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully saved", HttpStatus.OK);
	}

	@ApiOperation(value = "Retreive list of Websites", produces = "application/json")
	@GetMapping("/getWebSiteList")
	public ResponseEntity<List<WebsiteVo>> getWebsiteList() {
		return new ResponseEntity<List<WebsiteVo>>(service.getWebsiteList(), HttpStatus.OK);
	}

	@ApiOperation(value = "Retreive Websites  by id", produces = "application/json")
	@GetMapping("/getWebSiteBy/{id}")
	public ResponseEntity<WebsiteVo> getWebsite(@PathVariable Integer id) {
		return new ResponseEntity<WebsiteVo>(service.getWebsiteById(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Editing existing Website", consumes = "application/json")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "Integer", paramType = "body"),
			@ApiImplicitParam(name = "name", value = "Name of Website", required = true, dataType = "String", paramType = "body"),
			@ApiImplicitParam(name = "url", value = "Url of Website", required = true, dataType = "String", paramType = "body") })
	@PutMapping("/updateWebsite")
	public ResponseEntity<String> updateWebsite(@RequestBody WebsiteVo websiteVo) {
		service.updateWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully updated", HttpStatus.OK);
	}

	@ApiOperation(value = "Delete a Website Object from Database", consumes = "application/json")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "Website ID to delete", required = true, paramType = "body") })
	@DeleteMapping("/deleteWebsite")
	public ResponseEntity<String> deleteWebsite(@RequestBody WebsiteVo websiteVo) {
		service.deleteWebsite(websiteVo);
		return new ResponseEntity<String>("New website successfully deleted", HttpStatus.OK);
	}

}
