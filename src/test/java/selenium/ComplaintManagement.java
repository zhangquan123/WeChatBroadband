package selenium;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplaintManagement {
	//客诉管理
	@Test(groups="ComplaintManagement")
	public void complaintMang() throws IOException{
		Share sha = Share.getInstance();
		try {			
			
			//sha.actionsCss("#menuFoxIn > section:nth-child(3) > section > p > span");			
			/*sha.xpathClick("/html/body/section/section[2/]/section/section/section[3]/section/p/span");*/
			sha.selectorClick("#menuFoxIn > section:nth-child(3) > section > p > span");
			//sha.classClick("left pointer");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");	
			sha.thread(2000);			
			//添加客诉、客户姓名、客户电话、客诉内容
			sha.xpathClick("/html/body/section/section[1]/section[4]/button[4]");
			sha.thread(1500);
			sha.xpathSendKeys("/html/body/section/section[2]/input", "自动化测试");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[3]/input", "18520042490");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/textarea", "投诉你！就是要投诉你！");
			//客诉订单号、记录人、订单类型
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[5]/input", "测试订单号");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[6]/input", "测试");
			sha.thread(1200);			
			//sha.xpathClick("/html/body/section/section[7]/section/section[1]/label/text()");		
			sha.selectorClick("body > section > section:nth-child(7) > section > section.radio.mg-r10 > label");
			sha.thread(1200);
			//客诉时间、选择日期、设置时间
			sha.xpathClick("/html/body/section/section[8]/section[1]/div[1]/input");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[8]/section[1]/div[2]/table/tr[2]/td/table/tr[6]/td[3]");		
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[8]/section[2]/section/input");
			sha.thread(1200);			
			//保存、返回、关键字输入、搜索、重置
			//sha.xpathClick("/html/body/section/section[9]/button[2]");
			sha.xpathClick("/html/body/section/section[1]/button");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "自动化测试");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[4]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[4]/button[2]");
			sha.thread(1200);
			//订单类型、查询、导出
			sha.pullDown("/html/body/section/section[1]/section[3]/select", "新装");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[4]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[4]/button[3]");
			sha.thread(1500);
			//编辑、取消
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[9]/button");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[9]/button[1]");
			Assert.assertEquals("客诉内容", sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[2]"));
			Assert.assertEquals("客户姓名",sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[1]"));
			System.out.println("客诉管理测试通过!");
			sha.thread(2500);
			sha.implicitlyWait(5000);
			sha.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			sha.ScreenShot();
			e.printStackTrace();
		}
	}
}
