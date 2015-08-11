package de.codecentric.soap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import de.codecentric.soap.backend.WeatherBackend;
import de.codecentric.soap.controller.WeatherServiceController;
import de.codecentric.soap.controller.WeatherServiceControllerImpl;

@Configuration
@Profile("standard")
public class ApplicationConfiguration {

	@Bean
	public WeatherServiceController weatherServiceController() {
		return new WeatherServiceControllerImpl();
	}
	
	@Bean
	public WeatherBackend weatherRepository() {
		return new WeatherBackend();
	}
}
