package com.amituofo.microservices.limitsservice;

import com.amituofo.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsConfigurationController {

  @Autowired
  private Configuration _configuration;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfigurations() {
    return new LimitConfiguration(_configuration.getMaximum(), _configuration.getMinimum());
  }
}
