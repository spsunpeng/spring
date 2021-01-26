import com.mashibing.bean.Person;
import com.mashibing.controller.PersonController;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunpeng
 * @Date 2021-01-26 15:20
 */
public class MyTest {

    @Autowired
    private PersonController personController1; //启动类中@Autowired无效

    @Test
    public void testPerson(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("person", Person.class);
        System.out.println(person1==person2);

        PersonController personController = context.getBean("personController", PersonController.class);
        personController.save();


    }




}

