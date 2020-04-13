package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RoleList {
	//角色列表
	@Test(groups="RoleList")
	public void rolelist() throws IOException{
		Share s = Share.getInstance();
		try {
			//进入角色列表	
			s.implicitlyWait(4);
			s.selectorClick("#menuFoxIn > section:nth-child(8) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(3) > section > p > span");					
		
			s.enterIframe("/html/body/section/section[4]/section/iframe");			
			s.thread(1500);
			//更改权限、取消、输入、搜索、重置										
			s.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[4]/button[2]");							
			s.thread(1000);				
			s.xpathClick("/html/body/section/section[5]/section/section[3]/button[1]");
			s.thread(1000);			
			s.xpathSendKeys("/html/body/section/section[1]/section/input", "系统管理员");
			s.thread(1000);			
			s.xpathClick("/html/body/section/section[1]/button[1]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/button[2]");		
			Assert.assertEquals("角色名", s.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[1]"));
			System.out.println("角色名测试通过!");
			s.thread(2000);
			s.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
