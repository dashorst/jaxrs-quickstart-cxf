import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.martijndashorst.quickstarts.cxf.HelloResource;

public class Start {
	public static void main(String[] args) throws Exception {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(HelloResource.class);
		sf.setAddress("http://localhost:8080/");
		sf.create();
	}
}
