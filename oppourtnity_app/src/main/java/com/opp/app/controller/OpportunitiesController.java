package com.opp.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opp.app.service.OpportunitiesService;
import com.opp.openapi.api.OpportunitiesApi;
import com.opp.openapi.api.OpportunitiesApiController;
import com.opp.openapi.model.Opportunity;
import com.opp.openapi.model.OpportunityInput;

import ch.qos.logback.classic.Logger;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class OpportunitiesController implements OpportunitiesApi {
	
	 Logger logger = (Logger) LoggerFactory.getLogger(OpportunitiesApiController.class);
	
	@ Autowired
	private OpportunitiesService service;
	
	public ResponseEntity<List<Opportunity>> opportunitiesGet() {
		System.out.println("api controller -----------opportunitiesGet");
		List<Opportunity> opportunities = service.getOpportuinities();
		if (opportunities != null) {
			logger.info("Data fetch successfull..");
			return ResponseEntity.ok(service.getOpportuinities());
		} else {
			logger.info("Issue in data fetching");
			return null;
		}
	}
	
	public ResponseEntity<Opportunity> opportunitiesPost(
			@Parameter(name = "OpportunityInput", description = "", required = true) @Valid @RequestBody OpportunityInput opportunityInput) {
		
		System.out.println("Post----  ");
		Opportunity opportunity  = service.opportunitiesPost(opportunityInput);
		if(opportunity != null) {
			logger.info("Data stored in database");
			return ResponseEntity.ok(opportunity);
		} else {
			logger.info("Issue in data save");
			return (ResponseEntity<Opportunity>) ResponseEntity.noContent();
		}
	}
	
	public ResponseEntity<Void> opportunitiesOpportunityIdDelete(
			@Parameter(name = "opportunityId", description = "ID of the opportunity to delete", required = true, in = ParameterIn.PATH) @PathVariable("opportunityId") String opportunityId) {
		service.deleteOppourtinity(opportunityId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	public ResponseEntity<Opportunity> opportunitiesOpportunityIdGet(
			@Parameter(name = "opportunityId", description = "ID of the opportunity to get", required = true, in = ParameterIn.PATH) @PathVariable("opportunityId") String opportunityId) {
		
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	public ResponseEntity<Opportunity> opportunitiesOpportunityIdPut(
			@Parameter(name = "opportunityId", description = "ID of the opportunity to update", required = true, in = ParameterIn.PATH) @PathVariable("opportunityId") String opportunityId,
			@Parameter(name = "OpportunityInput", description = "", required = true) @Valid @RequestBody OpportunityInput opportunityInput) {
		
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	

}
