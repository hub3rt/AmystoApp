package com.amysto.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}
}
