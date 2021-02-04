import com.mashibing.proxy.CalculatorProxy;
import com.mashibing.service.Calculator;
import com.mashibing.service.MyCalculator;
import com.mashibing.service.MyCalculatorImpl;
import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:55
 */
public class MyTest {

    @Test
    public void test1() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy.getCalculator(new MyCalculatorImpl());
        //calculator.add(1, 2);
        calculator.div(1,0);
        System.out.println(calculator.getClass());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculator = context.getBean( Calculator.class);
        calculator.add(1,2);
        //calculator.div(1,0);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //jdk
        Calculator calculator = context.getBean( Calculator.class);
        calculator.add(1,2);
        System.out.println(calculator); //com.mashibing.service.MyCalculatorImpl@783a467b
        System.out.println(calculator.getClass()); //class com.sun.proxy.$Proxy18

        //CGLIB
        MyCalculator bean = context.getBean(MyCalculator.class);
        bean.add(1, 2);
        System.out.println(bean); //com.mashibing.service.MyCalculator@7db12bb6
        System.out.println(bean.getClass()); //class com.mashibing.service.MyCalculator$$EnhancerBySpringCGLIB$$6dad0c00


        //1.接口用jdk，类用CGLIB：bean.getClass()不一样
        //2.这里的bean（bean->bean,toString()-> 默认Class的全限定名）和bean.getClass()不一样
        //3.System.out.println(bean); 还会调用方法After...
    }
}
