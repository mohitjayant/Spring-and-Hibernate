package com.moxito.IOC_DI_Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.moxito.IOC_DI_Annotations") //with manually defined java beans
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for our swim coach and Inject dependencies

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
