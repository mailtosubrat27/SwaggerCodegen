package com.opp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opp.app.model.Opportunity;

@Repository
public interface OppourtinityRepo extends JpaRepository<Opportunity, Long> {

}
