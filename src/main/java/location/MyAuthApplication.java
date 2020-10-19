package location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import location.repositories.UserRepository;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= UserRepository.class)

public class MyAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAuthApplication.class, args);
	}
	
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
	    CommonsRequestLoggingFilter requestLoggingFilter = new CommonsRequestLoggingFilter();
	    requestLoggingFilter.setIncludeClientInfo(true);
	    requestLoggingFilter.setIncludeHeaders(true);
	    requestLoggingFilter.setIncludeQueryString(true);
	    requestLoggingFilter.setIncludePayload(true);
	    requestLoggingFilter.setAfterMessagePrefix("REQUEST DATA : ");
	    requestLoggingFilter.setMaxPayloadLength(900000);
	    
	    return requestLoggingFilter;
	}

}
