package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalSettings {
	//个人设置
	@Test(groups="PersonalSettings")
	public void PerSeting() throws IOException{
		Share s = Share.getInstance();
		try {
			//旧密码、新密码、退出登录
			s.selectorClick("#menuFoxIn > section:nth-child(8) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(5) > section > p > span");
			String tt = s.xpathGetText("/html/body/section/section[1]/section[2]/section[1]/p[2]").substring(3,14);		
					
			s.enterIframe("/html/body/section/section[4]/section/iframe");			
			s.xpathSendKeys("/html/body/section/section[2]/input", "Zq940826");
			s.thread(1200);
			s.xpathSendKeys("/html/body/section/section[3]/input", "ZAQ12346");	
			//右上角账号和管理员账号数据比对
			String ss = s.xpathGetText("/html/body/section/section[1]/input");			
			if(ss.equals(tt)){
				System.out.println("账号数据一致!");
			}else{
				System.out.println("账号数据不一致!");
			}
			Assert.assertEquals("新密码：", s.xpathGetText("/html/body/section/section[3]/section"));
			System.out.println("个人设置测试通过");
			s.thread(1200);			
			s.xpathClick("/html/body/section/section[4]/button[2]");				
			s.quitIframe();
			s.thread(2000);
			//关闭浏览器
			s.closeBroswer();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
