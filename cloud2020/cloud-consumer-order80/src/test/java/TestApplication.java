import com.atguigu.springcloud.OrderMain80;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
* @program: cloud2020
* @description: 单元测试类
* @author: jzm
* @create: 2020-10-29 09:34
**/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderMain80.class)
@WebAppConfiguration
public class TestApplication {
    
    @Test
    public void test1(){
        for (int i = 0; i < 10; i++) {
            
        }
    }

}






