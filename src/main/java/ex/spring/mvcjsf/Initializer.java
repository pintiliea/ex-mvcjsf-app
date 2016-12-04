package ex.spring.mvcjsf;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Initializer implements WebApplicationInitializer {

	Logger logger = LoggerFactory.getLogger(Initializer.class);

	@Override
	public void onStartup(ServletContext srvltCtxt) {

		logger.info(String.format("onStartup(%s)", srvltCtxt));

		AnnotationConfigWebApplicationContext webAppCtxt = new AnnotationConfigWebApplicationContext();
		srvltCtxt.addListener(new ContextLoaderListener(webAppCtxt));
	}

}