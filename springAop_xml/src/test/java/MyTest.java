
import com.mashibing.service.Calculator;
import com.mashibing.service.MyCalculator;
import com.mashibing.service.MyCalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:55
 */
public class MyTest {


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Calculator calculator = context.getBean( Calculator.class);
        calculator.add(1,2);
        //calculator.div(1,0);
    }
}
