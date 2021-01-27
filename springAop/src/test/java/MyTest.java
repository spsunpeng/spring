import com.mashibing.proxy.CalculatorProxy;
import com.mashibing.service.Calculator;
import org.junit.Test;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:55
 */
public class MyTest {

    @Test
    public void test1() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy.getCalculator(new Calculator());
        System.out.println(calculator.add(1, 2));
    }
}
