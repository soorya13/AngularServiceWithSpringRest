package contents;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import contents.WebMvcConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] { "/"};
	}

}