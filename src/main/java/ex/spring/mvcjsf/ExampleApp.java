package ex.spring.mvcjsf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApp {

	private static final transient Logger logger = LoggerFactory.getLogger(ExampleApp.class);

	public static void main(String[] args) {

		logger.info("Running MAIN");

		SpringApplication.run(ExampleApp.class, args);
	}
}
