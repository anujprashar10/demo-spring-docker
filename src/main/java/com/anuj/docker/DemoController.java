package com.anuj.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(path = "/msg", method = RequestMethod.GET)
	public String getRandomMsg() {
		
		return "Hello Docker!";
	}
}
