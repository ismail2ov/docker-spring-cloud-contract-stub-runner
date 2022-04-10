package com.github.ismail2ov.stubrunner;

import com.github.ismail2ov.stubrunner.configuration.WireMockConfigurer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class StubRunnerApplicationTests {

	@MockBean
	WireMockConfigurer wireMockConfigurer;

	@Test
	void contextLoads() {
	}

}
