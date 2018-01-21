package com.aspire.sci;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.aspire.automation.web.util.annotation.EnableAspirePageScan;




@SpringBootApplication 
@ComponentScan(basePackages= {"com.aspire"})
@EnableAspirePageScan({"com.aspire"} )
public class AspireAutomationSciApplication {


	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AspireAutomationSciApplication.class);
		app.setWebEnvironment(true); 
		
		
		 ConfigurableApplicationContext ctx = app.run(args);

	}
	

}
