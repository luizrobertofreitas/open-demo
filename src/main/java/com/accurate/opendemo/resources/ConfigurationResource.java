package com.accurate.opendemo.resources;

import com.accurate.opendemo.services.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationResource {

  @Autowired
  private ConfigurationService configurationService;

  @GetMapping("/env/name")
  public String getName() {
    return configurationService.getApplicationName();
  }
}

