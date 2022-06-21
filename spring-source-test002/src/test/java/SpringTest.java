import com.whx.config.JavaConfig;
import com.whx.model.ProxyModel;
import com.whx.model.User;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.support.AbstractRefreshableWebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = JavaConfig.class)
public class SpringTest {


	private final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

	@Test
	public void test01(){
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		this.beanFactory.registerScope("request", new RequestScope());
		this.beanFactory.preInstantiateSingletons();


//		context.getBeanFactory().registerScope(WebApplicationContext.SCOPE_REQUEST, new RequestScope());
		ProxyModel proxyModel = (ProxyModel) context.getBean("proxyModel");
		String name = proxyModel.getName();
		System.out.println(user.toString());
	}

}
