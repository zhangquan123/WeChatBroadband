package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OffShelfProductList {
	//已下架商品列表
	@Test(groups="OffShelfProductList")
	public void OSfProductList() throws IOException{
		Share s  = Share.getInstance();
		try {
			//进入已下架商品列表		
							
			s.selectorClick("#menuFoxIn > section:nth-child(5) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(2) > section > p > span");
			s.enterIframe("/html/body/section/section[4]/section/iframe");
			//编辑、下一步、上一步、下一步、保存
			s.xpathClick("/html/body/section/section[3]/table/tbody/tr[1]/td[8]/button[2]");
			s.thread(2000);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[13]/button");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[5]/button[1]");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[13]/button");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[5]/button[2]");			
			//宽带名称、省份、搜索、重置
			s.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "大风歌");
			s.thread(1200);
			s.pullDown("/html/body/section/section[1]/section[2]/section/select", "宁夏回族自治区");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[2]/button[1]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[2]/button[2]");
			//删除、确定删除、上架、取消上架、上架断言
			s.xpathClick("/html/body/section/section[3]/table/tbody/tr[1]/td[8]/button[3]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[2]");
			s.thread(1000);									
			s.xpathClick("/html/body/section/section[3]/table/tbody/tr[1]/td[8]/button[1]");
			s.thread(1000);						
			s.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[1]");			
			s.thread(2000);
			Assert.assertEquals("上架",s.xpathGetText("/html/body/section/section[3]/table/tbody/tr[1]/td[8]/button[1]"));
			System.out.println("已下架产品测试通过！");
			s.quitIframe();		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
