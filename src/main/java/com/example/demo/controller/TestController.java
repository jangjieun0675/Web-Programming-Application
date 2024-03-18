package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
  
  @GetMapping
  public String testController(){
    return "Hello World!";
  }

  @GetMapping("/testGetMapping")
  public String testControllerWithPath(){
    return "Hello World! testGetMapping";
  }

  @GetMapping("/getMyName")
  public String myName(){
    return "장지은";
  }

  @GetMapping("/{id}")
  public String testControllerWithPathVariable(@PathVariable(required = false) int id) {
    return "Hello World! ID " + id;
  }

  @GetMapping("/testRequestParam")
  public String testControllerRequestParam(@RequestParam(required = false) int id){
    return "Hello World! ID " + id;
  } 
}
