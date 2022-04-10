package com.github.ismail2ov.stubrunner.configuration;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

import org.springframework.cloud.contract.stubrunner.HttpServerStubConfiguration;
import org.springframework.cloud.contract.stubrunner.provider.wiremock.WireMockHttpServerStubConfigurer;

public class WireMockConfigurer extends WireMockHttpServerStubConfigurer {

	@Override
	public WireMockConfiguration configure(WireMockConfiguration httpStubConfiguration,
			HttpServerStubConfiguration httpServerStubConfiguration) {
		httpStubConfiguration.stubCorsEnabled(true);
		return super.configure(httpStubConfiguration, httpServerStubConfiguration);
	}

}
