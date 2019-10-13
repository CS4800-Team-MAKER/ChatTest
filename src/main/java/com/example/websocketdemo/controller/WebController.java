package com.example.websocketdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	@RequestMapping(value = "/meetups", method = RequestMethod.GET)
	public String meetups() {
	    return "meetups.html";
	}
	
	@RequestMapping(value = "/agriculture", method = RequestMethod.GET)
	public String agriculture() {
	    return "agriculture";
	}
	
	@RequestMapping(value = "/business", method = RequestMethod.GET)
	public String business() {
	    return "business";
	}
	
	@RequestMapping(value = "/education", method = RequestMethod.GET)
	public String education() {
	    return "education";
	}
	
	@RequestMapping(value = "/engineering", method = RequestMethod.GET)
	public String engineering() {
	    return "engineering";
	}
	
	@RequestMapping(value = "/environmentaldesign", method = RequestMethod.GET)
	public String environmentaldesign() {
	    return "environmentaldesign";
	}
	
	@RequestMapping(value = "/hospitality", method = RequestMethod.GET)
	public String hospitality() {
	    return "hospitality";
	}
	
	@RequestMapping(value = "/lettersArtsSocialSciences", method = RequestMethod.GET)
	public String lettersArtsSocialSciences() {
	    return "lettersArtsSocialSciences";
	}
	
	@RequestMapping(value = "/science", method = RequestMethod.GET)
	public String science() {
	    return "science";
	}
}
