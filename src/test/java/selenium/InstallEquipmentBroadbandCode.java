package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InstallEquipmentBroadbandCode {
	//装机宽带编码
	@Test(groups="InstallEquipmentBroadbandCode")
	public void broadbandCode() throws IOException{
		Share sha = Share.getInstance();
		try {
			//进入装机宽带编码
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(4) > section > p > span");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");			
			sha.thread(1200);
			//添加装机宽带编码按钮、上级地区
			sha.xpathClick("/html/body/section/section[1]/button[3]");			
			sha.thread(17000);						
			sha.xpathClick("/html/body/section/section[4]/section/section[1]/section/input");	
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[1]/section/section/section/section/section/section/section[1]/section/section[1]/span/span[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[2]/span");
			sha.thread(1200);
			//输入地区编码、地区名称
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[2]/input", "8650099");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[3]/input", "新疆");
			sha.thread(1200);
			//物流编码
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/section/input");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/section/section/section/section/section/section/section[2]/section/section[1]/span/span[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/span");
			sha.thread(1200);
			//保存、取消、删除、取消删除
			sha.xpathClick("/html/body/section/section[4]/section/section[5]/button[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[5]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[6]/button[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[1]");			
			//输入查询、选择省份
			sha.thread(2000);
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "8650000");			
			sha.thread(1200);
			sha.pullDown("/html/body/section/section[1]/section[2]/section/section/select", "广东");
			//搜索、重置、断言
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			Assert.assertEquals("+添加装机宽带编码", sha.xpathGetText("/html/body/section/section[1]/button[3]"));
			System.out.println("添加装机宽带编码测试通过!");
			sha.thread(2000);
			sha.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			sha.ScreenShot();
			e.printStackTrace();
		}
	}
}
