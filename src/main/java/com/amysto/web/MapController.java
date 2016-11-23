package com.amysto.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/map")
public class MapController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
    	return "map";
    }
}