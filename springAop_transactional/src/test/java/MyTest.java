import com.alibaba.druid.pool.DruidDataSource;
import com.mashibing.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunpeng
 * @Date 2021-02-04 14:13
 */
public class MyTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void test0() {
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("lisi", 1);
    }

    @Test
    public void test1() throws SQLException {
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void test2(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }






}
