package com.accurate.opendemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

  @Value("${application.name}")
  private String applicationName;

  public String getApplicationName() {
    return applicationName;
  }
}
