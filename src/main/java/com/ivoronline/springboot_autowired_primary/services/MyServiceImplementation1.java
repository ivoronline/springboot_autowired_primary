package com.ivoronline.springboot_autowired_primary.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyServiceImplementation1 implements MyServiceInterface {

  public String sayHello() {
    return "Hello";
  }

}
