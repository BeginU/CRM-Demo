package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author  lmm 
 * @date 2018-2-6 下午1:25:35 
 */
@RestController
public class HelloWorldController {

	@RequestMapping(value="/a",method= RequestMethod.GET)
	public String HelloWorld(){
		return "helloWorld";
	}
}
