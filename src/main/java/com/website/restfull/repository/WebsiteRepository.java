package com.website.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.restfull.Model.Website;

@Repository
public interface WebsiteRepository extends JpaRepository<Website, Integer>{

}
