package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BroadbandProductList {
	//宽带产品列表
	@Test(groups="BroadbandProductList")
	public void BPList() throws IOException{
		Share s = Share.getInstance();
		try {
			//进入宽带产品列表
			s.selectorClick("#menuFoxIn > section:nth-child(5) > section > p > span.left.pointer");
			s.thread(1000);							
			s.selectorClick("#menuFoxIn > section:nth-child(5) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(1) > section > p > span");
			s.enterIframe("/html/body/section/section[4]/section/iframe");
			s.implicitlyWait(2);			
			s.thread(1200);
			//发布商品、使用范围、宽带名称
			s.xpathClick("/html/body/section/section[2]/button[1]");
			s.thread(1200);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[1]/section/input");							
			s.thread(1500);							
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[1]/section/section/section/section/section/section/section[3]/section/section[1]/span/section");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[1]/span[1]");
			s.thread(1200);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[2]/input", "测试宽带!");
			s.thread(1000);
			//销售品id、原价、现价
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[3]/input", "7777777");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[4]/input[1]", "99");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[4]/input[2]", "99");
			s.thread(1000);
			//额外费用、费用名称、费用价格、确定
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[5]/button");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[14]/section/section[1]/input", "手续费");
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[14]/section/section[2]/input", "1");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[14]/section/section[3]/button");
			//速率、宽带类型、下一步
			s.thread(1000);
			s.xpathSendKeys("/html/body/section/section[1]/section[2]/section[2]/section[7]/input", "20");
			s.thread(1000);
			s.pullDown("/html/body/section/section[1]/section[2]/section[2]/section[9]/select", "融合");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[13]/button");
			s.thread(1000);
			//上传图片、图文详情、资费说明				
			WebElement adFileUpload = s.Driver.findElement(By.id("upImg"));				
			String filePath = "C://Users//Administrator//Desktop//QMMgrBackup_MisDel//电信.jpg";			
			adFileUpload.sendKeys(filePath);			
			//s.uploadFile("/html/body/section/section[1]/section[2]/section[2]/section[1]/section/section/form", "C://Users//Administrator//Desktop//导入图片//电信.jpg");
			s.thread(2500);
			/*s.idSendkey("text-elem8820241762205006","微信宽带中心后台管理系统图文详情");
			s.thread(1000);
			s.idSendkey("text-elem5507240533567654", "我们的微信宽带很便宜的");
			s.thread(1000);*/
			//保存并发布   
			s.xpathClick("/html/body/section/section[1]/section[2]/section[2]/section[5]/button[2]");
			s.thread(1000);			
			//输入、省份、搜索、重置
			s.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "广东江门宽带");
			s.thread(1000);
			s.pullDown("/html/body/section/section[1]/section[2]/section/select", "广东省");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[2]/button[4]");
			s.thread(1000);
			s.xpathClick("/html/body/section/section[2]/button[5]");			
			//设置推荐、下架、确定下架
			s.xpathClick("/html/body/section/section[3]/table/tbody/tr[1]/td[1]/div");
			s.thread(1000);			
			s.xpathClick("/html/body/section/section[2]/button[2]");
			s.thread(1000);	
			s.xpathClick("/html/body/section/section[3]/table/tbody/tr[1]/td[9]/button");
			s.thread(1000);	
			s.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[2]");
			s.thread(2000);		
			Assert.assertEquals("发布商品", s.xpathGetText("/html/body/section/section[2]/button[1]"));
			System.out.println("宽带产品列表测试通过!");
			s.quitIframe();
		} catch (Exception e) {
			// TODO: handle exception			
			System.out.println("======exception reason=======" + e);
			s.ScreenShot();
			e.printStackTrace();
		}
	}
}
