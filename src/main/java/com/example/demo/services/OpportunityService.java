package com.example.demo.services;

import java.util.List;

import com.example.demo.viewmodel.OpportunityViewModel;

public interface OpportunityService {

	List<OpportunityViewModel> findAllOpportunitiesOfAnAccount(Long idDB);

}
