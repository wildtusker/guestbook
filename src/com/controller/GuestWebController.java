package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Login;
import com.model.Post;
import com.model.User;
import com.services.UserService;

import org.springframework.ui.ModelMap;

@Controller
public class GuestWebController{
 
	 @Autowired
	  UserService userService;
	 
	 
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());

	    return mav;
	  }

   @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
   public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
   @ModelAttribute("login") Login login) {
     ModelAndView mav = null;
     User user = userService.validateUser(login);
     if (null != user) {
    	 mav = new ModelAndView("welcome");
    	 mav.addObject("firstname", user.getFirstname());
    	 mav.addObject("post", new Post());
     } else {
    	 mav = new ModelAndView("login");
    	 mav.addObject("message", "Username or Password is wrong!!");
     }
     return mav;
   }
   
   @RequestMapping(value = "/postProcess", method = RequestMethod.POST)
   public ModelAndView postProcess(HttpServletRequest request, HttpServletResponse response,
   @ModelAttribute("post") Post post) {
     ModelAndView mav = null;
     
     if (null != post) {
    	 mav = new ModelAndView("post");
    	 mav.addObject("results", "Post is submitted");
     } else {
    	 mav = new ModelAndView("post");
    	 mav.addObject("message", "Message not posted ");
     }
     return mav;
   }
   
}