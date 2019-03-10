package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PackageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome Buji");
		return mv;
	}

	@RequestMapping(value = { "/test" })
	public ModelAndView param(@RequestParam(value = "greeting", required = false) String greeting) {
		if (greeting == null) {
			greeting = "Default";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	/*
	@RequestMapping(value ="/test/{greeting}")
	public ModelAndView param(@PathVariable("greeting") String greeting) {
		if (greeting == null) {
			greeting = "Default";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
}
