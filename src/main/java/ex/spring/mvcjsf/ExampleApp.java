package ex.spring.mvcjsf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExampleApp extends SpringBootServletInitializer {

	public static void main(String[] args) {

		logger.info("Running MAIN");

		SpringApplication.run(ExampleApp.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(ExampleApp.class);
	}

	// @Override
	// public void onStartup(ServletContext srvltCtxt) throws ServletException {
	//
	// logger.info(String.format("onStartup(%s)", srvltCtxt));
	//
	// AnnotationConfigWebApplicationContext webAppCtxt = new
	// AnnotationConfigWebApplicationContext();
	// srvltCtxt.addListener(new ContextLoaderListener(webAppCtxt));
	// }

	private static final transient Logger logger = LoggerFactory.getLogger(ExampleApp.class);
}
