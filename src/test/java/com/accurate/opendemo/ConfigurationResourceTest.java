package com.accurate.opendemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ConfigurationResourceTest {

  @LocalServerPort
  private Integer port;

  @Autowired
  private TestRestTemplate testRestTemplate;

  @Test
  public void applicationNameSuccess() {
    assertThat(this.testRestTemplate.getForObject("http://localhost:"+port+"/env/name", String.class))
        .contains("Open Demo");
  }
}
