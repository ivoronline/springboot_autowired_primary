package com.ivoronline.springboot_autowired_primary.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImplementation2 implements MyServiceInterface {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello 2";
  }

}
