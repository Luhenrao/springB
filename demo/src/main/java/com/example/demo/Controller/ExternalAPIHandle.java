package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ExternalAPIService;

@RestController
@RequestMapping("api/v1l")
public class ExternalAPIHandle {

  @Autowired
  private ExternalAPIService externalAPIService;

  @GetMapping
  public String getAllData(){
    return externalAPIService.getAllData();
  }
  
}
