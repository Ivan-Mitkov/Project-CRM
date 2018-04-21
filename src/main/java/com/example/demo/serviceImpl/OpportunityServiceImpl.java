package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converters.opportunityConverters.OpportunityToOpportunityViewModel;
import com.example.demo.entities.Opportunity;
import com.example.demo.repositories.OpportunityRepository;
import com.example.demo.services.OpportunityService;
import com.example.demo.viewmodel.OpportunityViewModel;
@Service
@Transactional
public class OpportunityServiceImpl implements OpportunityService {
	
	private final OpportunityRepository repository;
	private final OpportunityToOpportunityViewModel opportunityToOpportunityViewModel;
	
	
	@Autowired
	public OpportunityServiceImpl(OpportunityRepository repository,
			OpportunityToOpportunityViewModel opportunityToOpportunityViewModel) {
		this.repository = repository;
		this.opportunityToOpportunityViewModel = opportunityToOpportunityViewModel;
	}



	@Override
	public List<OpportunityViewModel> findAllOpportunitiesOfAnAccount(Long idDB) {
		List<Opportunity> opportunity=repository.findAllByAccountId(idDB);
		List<OpportunityViewModel>opportunityViews=new ArrayList<>();
		opportunityViews=opportunity.stream()
				.map((Opportunity a)->opportunityToOpportunityViewModel.convert(a))
				.collect(Collectors.toList());
		return opportunityViews;
	}
	

}
