package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OvertimeOrders {
	//超时订单
	@Test(groups="OvertimeOrders")
	public void OvertiOrders() throws IOException{
		Share s = Share.getInstance();
		try {			
			s.selectorClick("#menuFoxIn > section:nth-child(4) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(3) > section > p > span");
			s.enterIframe("/html/body/section/section[4]/section/iframe");			
			s.thread(2000);
			//下一页 s.xpathClick("/html/body/section/section[1]/section[3]/section/ul/li[8]");				
			Assert.assertEquals("下单时间", s.xpathGetText("/html/body/section/section[1]/section[3]/table/thead/tr/th[1]"));			
			Assert.assertEquals("微信订单号", s.xpathGetText("/html/body/section/section[1]/section[3]/table/thead/tr/th[2]"));
			s.thread(2000);		
			System.out.println("超时订单测试通过！"); 
			s.quitIframe();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
