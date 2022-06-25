package com.example.healthSafetySmartApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HealthSafetySmartAppApplicationTests {

	/**
	 * This is a basic test to test if Spring's ApplicationContext is loaded.
	 * @param context
	 */
	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}

}