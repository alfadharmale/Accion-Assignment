package com.example.demo.dao;


import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;


public interface Daoi extends CrudRepository<TechnicalPanel, Integer> {

	public void save(int detailtechstrack);

	/*
	 * public void deleteByDetailtechstrack(int detailtechstrack);
	 * 
	 * public void update(int detailtechstrack);
	 * 
	 * public TechnicalPanel findByDetailtechstrack(int Detailtechstrack);
	 */
	

	

}