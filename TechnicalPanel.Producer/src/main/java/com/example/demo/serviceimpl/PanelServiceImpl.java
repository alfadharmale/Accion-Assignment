package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Daoi;
import com.example.demo.model.TechnicalPanel;
import com.example.demo.service.PanelService;
@Service
public class PanelServiceImpl implements PanelService {
	@Autowired
	Daoi di;

	@Override
	public void register(TechnicalPanel t) {
	di.save(t);
		
	}

	

	

	@Override
	public List<TechnicalPanel> findall() {
		List<TechnicalPanel>l= (List<TechnicalPanel>) di.findAll();
		
		return l;
	}

	



	



	public void delete(int detailtechstrack) {
		  di.deleteById(detailtechstrack);;

	}
	


	
 
	 public void update(TechnicalPanel panel,int detailtechstrack) {
		  di.save(panel);
		 
		 }



	/*
	 * @Override public void update(int detailtechstrack) {
	 * di.update(detailtechstrack);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Override public TechnicalPanel findByDetailtechstrack(int detailtechstrack)
	 * { TechnicalPanel panel=di.findByDetailtechstrack(detailtechstrack); return
	 * panel; }
	 */






}


