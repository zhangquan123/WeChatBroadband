package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BroadbandNewClothesOrder {
	//宽带新装订单
	@Test(groups="BroadbandNewClothesOrder")
	public void broadbandOrder() throws IOException{
		Share sha = Share.getInstance();
		try {
			//进入宽带新装订单
			sha.selectorClick("#menuFoxIn > section:nth-child(4) > section.clearfix.menu.pd10.mg-t10 > p > span.left.pointer");
			sha.thread(1200);								
			sha.selectorClick("#menuFoxIn > section:nth-child(4) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(1) > section > p > span");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");
			//选择成交时间(5.1-6.30)、查询
			sha.xpathClick("/html/body/section/section[1]/section/section[4]/section/div[1]/input");
			sha.thread(2000);
			for(int i=0;i<10;i++){
				sha.xpathClick("/html/body/section/section[1]/section/section[4]/section/div[2]/table/tr[1]/th[1]/img");
				sha.thread(700);
			}
			sha.xpathClick("/html/body/section/section[1]/section/section[4]/section/div[2]/table/tr[2]/td[1]/table/tr[2]/td[4]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section/section[4]/section/div[2]/table/tr[2]/td[3]/table/tr[7]/td[1]");
			sha.xpathClick("/html/body/section/section[1]/section/section[6]/button[3]");
			sha.thread(1200);
			//关键字搜索、省份、订单状态
			sha.xpathSendKeys("/html/body/section/section[1]/section/section[1]/section/input", "50Mbps随选宽带");
			sha.thread(1200);
			sha.pullDown("/html/body/section/section[1]/section/section[2]/section/section[1]/select", "湖北省");
			sha.thread(1200);
			sha.pullDown("/html/body/section/section[1]/section/section[3]/select", "交易完成");
			sha.thread(1200);
			//搜索、导出、修改状态、取消
			sha.xpathClick("/html/body/section/section[1]/section/section[6]/button[3]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section/section[6]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr/td[13]/button[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[2]/button[1]");
			sha.thread(2500);
			Assert.assertEquals("宽带名称",sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[1]"));		
			Assert.assertEquals("成交时间",sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[12]"));			
			Assert.assertEquals("所属地市",sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[5]"));
			System.out.println("宽带新装订单测试通过！");
			sha.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			sha.ScreenShot();
			e.printStackTrace();
		}
	}
}
