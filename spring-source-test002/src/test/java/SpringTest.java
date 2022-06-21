import com.whx.config.JavaConfig;
import com.whx.model.ProxyModel;
import com.whx.model.User;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.support.AbstractRefreshableWebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = JavaConfig.class)
public class SpringTest {

	@Test
	public void test01(){
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		ProxyModel proxyModel = (ProxyModel) context.getBean("proxyModel");
		String name = proxyModel.getName();
		System.out.println(user.toString());
	}

}
