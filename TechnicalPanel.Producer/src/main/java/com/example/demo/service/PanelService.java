package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TechnicalPanel;

public interface PanelService {

	public void register(TechnicalPanel t);

	//public void update(int detailtechstrack);

	public void delete(int detailtechstrack);

	public List<TechnicalPanel> findall();

	//public TechnicalPanel findByDetailtechstrack(int detailtechstrack);
}
