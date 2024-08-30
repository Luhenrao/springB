package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ExternalAPIService {

  private final String url = "api.myanimelist.net/v2";
  
  @Autowired
  private RestTemplate restTemplate;

  public String getAllData(){
    return restTemplate.getForObject(this.url, String.class);
  }
}
