import com.ly.dao.UserDao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class SpringTest {
    @Test
    public void Test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = (UserDao) context.getBean("User1");
        user.save();
        context.close();
    }

}
