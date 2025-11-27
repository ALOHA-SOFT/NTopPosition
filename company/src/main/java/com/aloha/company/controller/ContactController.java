package com.aloha.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/contact")
public class ContactController {

  @GetMapping("/{path}")
  public String index(@PathVariable("path") String path) {
    
      return "page/contact/" + path;
  }
  
}
