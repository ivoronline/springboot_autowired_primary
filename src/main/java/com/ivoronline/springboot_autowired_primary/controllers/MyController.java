package com.ivoronline.springboot_autowired_primary.controllers;

import com.ivoronline.springboot_autowired_primary.services.MyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired
  MyServiceInterface myService;

  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String result = myService.sayHello();
    return result;
  }

}
