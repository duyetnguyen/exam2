package com.exam2.virus.controllers;

import com.exam2.virus.Models.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @Autowired
  VirusRepo virusRepo;
  @RequestMapping("/")

  public ModelAndView doHome()
  {
      ModelAndView mv = new ModelAndView("index");
      mv.addObject("virus",virusRepo.findAll());

      return mv;
  }

}
