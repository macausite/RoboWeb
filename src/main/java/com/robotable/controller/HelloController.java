package com.robotable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value={"/hello","/"})
public class HelloController{
 
   @RequestMapping(method = RequestMethod.GET)
  /* public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "hello";
   }
*/
   
   public ModelAndView printHello()
   {
	   String message="Hello Spring MVC Framework!";
	   return new ModelAndView("hello", "message", message);
	   
   }
}