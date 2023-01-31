package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaiController {
	
	@RequestMapping(value = "/endpoint1" ,method =  RequestMethod.GET)
	public String testAPI()
	{
		return "1st Endpoint is Hitting";
	}

	
	@RequestMapping(value = "/endpoint2" ,method =  RequestMethod.GET)
	public String testAPI()
	{
		return "2nd Endpoint is Hitting";
	}

	
	
	@RequestMapping(value = "/endpoint3" ,method =  RequestMethod.GET)
	public String testAPI()
	{
		return "3rd Endpoint is Hitting";
	}

	
	@RequestMapping(value = "/endpoint4" ,method =  RequestMethod.GET)
	public String testAPI()
	{
		return "4th Endpoint is Hitting";
	}

	
	@RequestMapping(value = "/endpoint5" ,method =  RequestMethod.GET)
	public String testAPI()
	{
		return "5th Endpoint is Hitting";
	}

}
