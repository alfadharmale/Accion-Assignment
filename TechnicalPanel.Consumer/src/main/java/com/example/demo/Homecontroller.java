package com.example.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import ch.qos.logback.classic.BasicConfigurator;
@CrossOrigin(origins="*")
@RestController
public class Homecontroller {
	@Autowired
	RestTemplate rt;
	static Logger log=Logger.getLogger(Homecontroller.class);
	
	  @RequestMapping(value="/getlist",produces="application/json") public List
	  getList() { //org.apache.log4j.BasicConfigurator.configure();
	 log.info("alfa"); String url="http://zuelserver/producer/findall"; List
	 l=rt.getForObject(url,List.class); return l; }
	 
	@RequestMapping(value="savePanel", method=RequestMethod.POST,consumes= "application/json")
	public TechnicalPanel savedata(@RequestBody TechnicalPanel e) {
		
		String url = "http://zuelserver/producer/save";
		TechnicalPanel em = rt.postForObject(url, e, TechnicalPanel.class);
		return em;		
	}
	
	
	@RequestMapping(value="TechPanel", method=RequestMethod.PUT) 
	public TechnicalPanel update(@RequestBody TechnicalPanel e) {
		String url ="http://zuelserver/producer/updateData"; 
		rt.put(url, e,TechnicalPanel.class);
				 
	  
	return e;}
	  
	  
	  
	 
	@RequestMapping(value="deletePanel/{detailtechstrack}", 
			  produces="application/json") public List delete(@PathVariable
			  (name="detailtechstrack") int detailtechstrack) {
			 
			 
			  String url = "http://zuelserver/producer/delete/"+detailtechstrack+"";
			  List<TechnicalPanel> el = rt.getForObject(url, List.class);
			  System.out.println(el); return el; }
			 
}
