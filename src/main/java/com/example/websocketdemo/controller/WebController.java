package com.example.websocketdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class WebController {
	@RequestMapping(value = "/meetups", method = RequestMethod.GET)
	public String meetups() {
	    return "meetups";
	}
}
