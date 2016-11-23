package com.amysto.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
    	return "map";
    }
}