package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TechnicalPanel;
import com.example.demo.service.PanelService;

@CrossOrigin(origins = "*")
@RestController
public class HomController {

	@Autowired
	PanelService si;

	@RequestMapping(value = "save")
	public void register(@RequestBody TechnicalPanel p) {

		si.register(p);
	}

	@RequestMapping(value = "updateData")
	public TechnicalPanel update(@RequestBody TechnicalPanel pan) {
		si.register(pan);
		return pan;

	}

	@RequestMapping(value = "delete/{detailtechstrack}")
	public List<TechnicalPanel> delete(@PathVariable(name = "detailtechstrack") int detailtechstrack) {

		si.delete(detailtechstrack);

		List<TechnicalPanel> el = si.findall();
		System.out.println(el);
		return el;

	}

	// ----------------------------------------------------delete-----------------------------------

	@RequestMapping(value = "/findall")
	public List<TechnicalPanel> getData() {

		List<TechnicalPanel> el = si.findall();
		System.out.println("list is");
		System.out.println(el);
		return el;

	}

	/*
	 * @RequestMapping(value = "findByName/{Panelname}") public TechnicalPanel
	 * getPanel(@PathVariable(name = "Panelname") int detailtechstrack) {
	 * TechnicalPanel pa = si.findByDetailtechstrack(detailtechstrack); return pa; }
	 */

}
