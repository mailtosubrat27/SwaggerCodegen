package com.opp.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opp.app.model.Opportunity;
import com.opp.app.repository.OppourtinityRepo;
import com.opp.openapi.model.OpportunityInput;

@Service
public class OpportunitiesService {
	
	@Autowired
	private OppourtinityRepo repository;

	public List<com.opp.openapi.model.Opportunity> getOpportuinities() {
	List<Opportunity> allOpp = (List<Opportunity>) repository.findAll();
		System.out.println("FindAlll :"+ allOpp.size());
		return allOpp.stream()
		.map(this::getGenOppourtinity)
		.collect(Collectors.toList());
		
	}

	public com.opp.openapi.model.Opportunity opportunitiesPost(OpportunityInput opportunityInput) {
		Opportunity oo = getApiOpportunity(opportunityInput);
		return getGenOppourtinity(repository.save(oo));
		
	}

	public void deleteOppourtinity(String opportunityId) {
		
		repository.deleteById(null);
		
	}
	
	private Opportunity getApiOpportunity(OpportunityInput opportunityInput) {
		Opportunity oo = new Opportunity();
//		oo.setId(1L);
		oo.setName(opportunityInput.getName());
		oo.setStatus(opportunityInput.getStatus());
		oo.setDescription(opportunityInput.getDescription());
		oo.setCustomerId(opportunityInput.getCustomerId());
		
		return oo;
	}
	
	private com.opp.openapi.model.Opportunity getGenOppourtinity(Opportunity opportunity) {
		com.opp.openapi.model.Opportunity genOpp = new com.opp.openapi.model.Opportunity();
		genOpp.setName(opportunity.getName());
		genOpp.setStatus(opportunity.getStatus());
		genOpp.setDescription(opportunity.getDescription());
		genOpp.setCustomerId(opportunity.getCustomerId());
		return genOpp;
	}

	

}
