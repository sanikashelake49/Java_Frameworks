package com.learning.myfirstapp.rest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.myfirstapp.bean.Country_Capital_Bean;

@RestController
@RequestMapping("country")
public class CountryRestController {
	
	//define an end point
	@RequestMapping(value="capital",method=RequestMethod.GET)
	//@GetMapping("capital")
	public List<Country_Capital_Bean> getCtryCap(){
		return Arrays.asList(new Country_Capital_Bean("India","New Delhi"),
				             new Country_Capital_Bean("USA","Washington DC"),
				             new Country_Capital_Bean("JAPAN","Tokyo")
				
				);
	}

}
