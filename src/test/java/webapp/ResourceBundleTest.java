package webapp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceBundleTest {

	static Log log =LogFactory.getLog(ResourceBundleTest.class);
	
	
	@Test
	public void test1() {
	
		ResourceBundleMessageSource ms =new  ResourceBundleMessageSource();
		
		
		ms.setBasename("message");
		
		
		String msg = ms.getMessage("required", null,null);
		log.info(msg);
	
	}
	
	
	@Test
	public void test2() {
		ReloadableResourceBundleMessageSource ms =new  ReloadableResourceBundleMessageSource();
		
		
		ms.setBasename("classpath:/message");
		ms.setCacheSeconds(0);
		
		String msg = ms.getMessage("required", null,null);
		log.info(msg);	
	
	}

}
