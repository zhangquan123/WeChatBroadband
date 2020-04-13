package selenium;

import java.io.IOException;
import org.testng.annotations.Test;

public class LogisticsCode {
	//物流编码
	@Test(groups="LogisticsCode")
	public void LogistiCode() throws InterruptedException, IOException{
		Share sha  =  Share.getInstance();
		try {
			//进入物流编码
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(3) > section > p > span");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");
			sha.thread(1000);
			//添加物流编码、选择上级地区、选择城市
			sha.xpathClick("/html/body/section/section[1]/button[3]");
			sha.implicitlyWait(10);
			sha.thread(8000);
			sha.xpathClick("/html/body/section/section[4]/section/section[1]/section/input");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[1]/section/section/section/section/section/section/section[1]/section/section[1]/span/span[2]");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[4]/section/section[2]/span");
			//地区编码、地区名称、保存
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[2]/input", "002024001099");
			sha.thread(1000);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[3]/input", "郊区");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/button[2]");
			sha.thread(1500);
			//输入编码、省份、搜索、重置
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "002024001099");
			sha.thread(1200);
			sha.pullDown("/html/body/section/section[1]/section[2]/section/section/select", "北京");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			//编辑、取消、删除、取消删除
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[6]/button[1]");
			sha.thread(10000);
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/button[1]");			
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[6]/button[2]");			
			sha.thread(1200);							
			sha.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[1]");			
			//查看分页   断言物流编码功能
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[3]/section/ul/li[8]");
			String codeName = sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[5]"); 
			if(codeName.equals("物流编码名称")){
				System.out.println("物流编码测试通过!");
			}else{
				System.out.println("物流编码测试失败!");
			}
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
