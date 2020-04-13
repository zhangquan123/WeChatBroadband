package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstPage {
	@Test(groups="FirstPage")
	public void shouye() throws IOException{
		Share sha = Share.getInstance();		
		try {
			sha.enterIframe("/html/body/section/section[4]/section/iframe");	
			sha.thread(1500);
			sha.scolleButton();
			sha.thread(1800);
			//成交订单走势图 选择日期
			sha.xpathClick("/html/body/section/section[1]/section[3]/section/div[1]/input");
			for(int i=0;i<10;i++){								
				sha.xpathClick("/html/body/section/section[1]/section[3]/section/div[2]/table/tr[1]/th[1]/img");
				sha.thread(500);
			}
			sha.xpathClick("/html/body/section/section[1]/section[3]/section/div[2]/table/tr[2]/td[1]/table/tr[2]/td[4]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[3]/section/div[2]/table/tr[2]/td[3]/table/tr[7]/td[1]");
			sha.thread(800);
			sha.xpathClick("/html/body/section/section[1]/section[3]/section/div[2]/table/tr[2]/td[3]/table/tr[7]/td[1]");
			Assert.assertEquals("今日成交", sha.xpathGetText("/html/body/section/section[1]/section[2]/section[1]/p"));
			Assert.assertEquals("系统审核中订单", sha.xpathGetText("/html/body/section/section[1]/section[2]/section[2]/p"));
			System.out.println("首页数据测试通过!");		
			sha.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);			
			sha.ScreenShot();
			e.printStackTrace();
		}
		
	}
	
	
}
