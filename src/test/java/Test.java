import com.alibaba.druid.pool.DruidDataSource;
import com.mashibing.bean.Person;
import com.mashibing.factory.PersonFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author sunpeng
 * @Date 2021-01-19 17:36
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        //基本
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        //构造器
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        //复杂参数
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);

        //静态工厂
        Person personF1 = context.getBean("personF1", Person.class);
        System.out.println(personF1);
        //工厂方法
        Person personF2 = context.getBean("personF2", Person.class);
        System.out.println(personF2);
        Person personF3 = context.getBean("personF2", Person.class);
        System.out.println(personF3);
        System.out.print("工厂方法：");
        System.out.println(personF2 == personF3);
        //FactoryBean
        Person personFactoryBean = context.getBean("personFactoryBean", Person.class);
        System.out.println(personFactoryBean);

        //外部类和文件
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());

        //SpEL
        Person person002 = context.getBean("person002", Person.class);
        System.out.println(person002);



    }
}
