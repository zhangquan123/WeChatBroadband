package wechatbroadband;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.TestNG;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * jenkins启动TestNG.xml
     * @throws InterruptedException 
     */
	
	public static void main(String[] args) throws InterruptedException {
		TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();      
        suites.add("C:\\Users\\Administrator\\Desktop\\WeChatBroadband\\src\\test\\java\\TestNG.xml");
        //suites.add(".\\test-output\\testng-failed.xml");
        testNG.setTestSuites(suites);
        testNG.run();

        /*// 等待执行结束，然后去执行失败用例
        TestNG testNG1 = new TestNG();
        List<String> suites1 = new ArrayList<String>();
        Thread.sleep(5000);
        suites1.add(".\\test-output\\testng-failed.xml");
        testNG1.setTestSuites(suites1);
        testNG1.run();*/
	}
	
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	
       
    }
}
