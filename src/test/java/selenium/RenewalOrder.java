package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RenewalOrder {
	//续约订单
	@Test(groups="RenewalOrder")
	public void ReneOrder() throws IOException{
		Share s = Share.getInstance();
		try {							
			s.selectorClick("#menuFoxIn > section:nth-child(4) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(2) > section > p > span");
			s.enterIframe("/html/body/section/section[4]/section/iframe");
			s.thread(1200);
			//关键字查询、省份、订单状态、搜索、重置
			s.thread(1200);
			s.xpathSendKeys("/html/body/section/section[1]/section/section[1]/section/input", "50M宽带-4K超高清ITV（1800元/3年）（单宽续电视宽带机顶盒自购）");
			s.thread(1200);
			s.pullDown("/html/body/section/section[1]/section/section[2]/section/section/select", "湖南省");
			s.thread(1200);
			//s.pullDown("/html/body/section/section[1]/section/section[3]/select", "已支付,系统审核中");	
			s.xpathClick("/html/body/section/section[1]/section/section[3]/select");
			s.xpathClick("/html/body/section/section[1]/section/section[3]/select/option[3]");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section/section[6]/button[3]");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section/section[6]/button[4]");
			s.thread(1200);
			//查看详情、返回、修改状态、取消
			s.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[13]/button[1]");
			s.thread(3000);
			s.xpathClick("/html/body/section/section[1]/button");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[13]/button[2]");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[4]/section/section[2]/button[1]");
			Assert.assertEquals("宽带名称", s.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[1]"));
			Assert.assertEquals("价格（元）",s.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[6]"));
			s.thread(2000);			
			System.out.println("续约订单测试通过!");
			s.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			e.printStackTrace();
			s.ScreenShot();
		}
	}
}
