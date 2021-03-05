import com.mashibing.bean.Person;
import com.mashibing.bean.Student;
import com.mashibing.bean.User;
import com.mashibing.controller.PersonController;
import com.mashibing.service.BaseService;
import com.mashibing.service.StudentService;
import com.mashibing.service.TeacherService;
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

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void testUser(){
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testPerson(){
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("person", Person.class);
        System.out.println(person1==person2);

        PersonController personController = context.getBean("personController", PersonController.class);
        personController.save();
    }

    @Test
    public void test2(){
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();

        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.save();
    }

}

