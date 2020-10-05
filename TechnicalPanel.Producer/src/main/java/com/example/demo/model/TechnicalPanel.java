package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TechnicalPanel {
	

	@Id
	private int detailtechstrack;
	private String panelname;
	private String techstream;
	
	private String firstlevel;
	private String secondlevel;
	private String managerial;
	public String getPanelname() {
		return panelname;
	}
	public void setPanelname(String panelname) {
		this.panelname = panelname;
	}
	
	public int getDetailtechstrack() {
		return detailtechstrack;
	}
	public void setDetailtechstrack(int detailtechstrack) {
		this.detailtechstrack = detailtechstrack;
	}
	public String getTechstream() {
		return techstream;
	}
	public void setTechstream(String techstream) {
		this.techstream = techstream;
	}
	public String getFirstlevel() {
		return firstlevel;
	}
	public void setFirstlevel(String firstlevel) {
		this.firstlevel = firstlevel;
	}
	public String getSecondlevel() {
		return secondlevel;
	}
	public void setSecondlevel(String secondlevel) {
		this.secondlevel = secondlevel;
	}
	public String getManagerial() {
		return managerial;
	}
	public void setManagerial(String managerial) {
		this.managerial = managerial;
	}
		
	
	
}