package com.accurate.opendemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationResource {

  @Value("${application.name}")
  private String applicationName;

  @GetMapping("/env/name")
  public String getName() {
    return applicationName;
  }
}

