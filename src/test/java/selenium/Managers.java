package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Managers {
	//管理员列表
	@Test(groups="Managers")	
	public void manager () throws IOException{
		Share s = Share.getInstance();
		try {
			//进入管理员列表
			s.selectorClick("#menuFoxIn > section:nth-child(8) > section.clearfix.menu.pd10.mg-t10 > p > span.left.pointer");
			s.thread(1000);
			s.selectorClick("#menuFoxIn > section:nth-child(8) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(2) > section > p > span");
			s.enterIframe("/html/body/section/section[4]/section/iframe");
			s.thread(1500);
			//添加管理员、姓名、账号、密码
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[1]/button[3]");
			s.xpathSendKeys("/html/body/section/section[2]/section[1]/input", "zhangquan");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[2]/section[2]/input","15527121211");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[2]/section[3]/input", "Zq940826");
			s.thread(1000);
			//系统管理员、保存
			s.xpathClick("/html/body/section/section[2]/section[4]/section/section[5]/label");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[2]/section[5]/button[2]");						  
			s.thread(1000);			
			//禁用、确定禁用、启用、确定启用
			s.xpathClick("/html/body/section/section[1]/section[2]/table/tbody/tr[1]/td[6]/button[2]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[4]/section/section/section[2]/button[2]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/table/tbody/tr[1]/td[6]/button[2]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[4]/section/section/section[2]/button[2]");
			s.thread(1000);
			//删除、确定删除	、更改角色、取消更改角色		
			s.xpathClick("/html/body/section/section[1]/section[2]/table/tbody/tr[1]/td[6]/button[1]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[4]/section/section/section[2]/button[2]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/table/tbody/tr[1]/td[6]/button[3]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[4]/section/section[2]/button[1]");
			//查询、状态、搜索、重置
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[1]/section[1]/input", "Swift");
			s.thread(1000);
			s.pullDown("/html/body/section/section[1]/section[1]/section[2]/select", "使用中");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[1]/button[1]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[1]/button[2]");
			Assert.assertEquals("账号", s.xpathGetText("/html/body/section/section[1]/section[2]/table/thead/tr/th[2]"));
			Assert.assertEquals("角色", s.xpathGetText("/html/body/section/section[1]/section[2]/table/thead/tr/th[3]"));
			System.out.println("管理员列表测试通过!");
			s.quitIframe();			
			s.thread(2500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
