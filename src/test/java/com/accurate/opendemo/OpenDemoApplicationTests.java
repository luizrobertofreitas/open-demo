package com.accurate.opendemo;

import static org.assertj.core.api.Assertions.assertThat;

import com.accurate.opendemo.resources.ConfigurationResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenDemoApplicationTests {

	@Autowired
	private ConfigurationResource configurationResource;

	@Test
	public void contextLoads() {
		assertThat(configurationResource).isNotNull();
	}
}
