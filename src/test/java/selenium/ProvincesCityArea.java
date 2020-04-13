package selenium;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProvincesCityArea {
	@Test(groups="ProvincesCityArea")
	public void ss() throws InterruptedException, IOException{
		//省市区列表
		Share sha = Share.getInstance();
		try {
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.clearfix.menu.pd10.mg-t10 > p > span.left.pointer");
			sha.thread(1000);
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(1) > section > p > span");
			sha.thread(1000);
			//进入省市区列表功能
			sha.enterIframe("/html/body/section/section[4]/section/iframe");
			//添加城市、上级机构、地区编码、地区名称			
			sha.xpathClick("/html/body/section/section[1]/button[3]");
			sha.thread(500);
			sha.pullDown("/html/body/section/section[4]/section/section[1]/select", "广东省");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[2]/input", "987654");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[3]/input", "湖北湖北");
			//保存,编辑城市编码  城市名称
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/button[2]");
			sha.thread(1500);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[5]/button[1]");
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[2]/input", "9876543");			
			sha.thread(1200);
			sha.xpathSendKeys("/html/body/section/section[4]/section/section[3]/input", "湖北广州");
			sha.thread(1200);
			//确认修改、删除、确定删除
			sha.xpathClick("/html/body/section/section[4]/section/section[4]/button[2]");
			sha.thread(1500);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[5]/button[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[6]/section/section/section[2]/button[2]");
			//输入编码、搜索、重置
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "8230200");
			sha.thread(2000);
			sha.xpathClick("/html/body/section/section[1]/button[1]");			
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			sha.thread(1200);
			//超长搜索、重置、分页
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "00000000000000000000000000000000000000000000");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[3]/section/ul/li[8]");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[3]/section/ul/li[8]");
			sha.thread(1000);
			//选择省份、搜索、重置
			sha.pullDown("/html/body/section/section[1]/section[2]/section/section/select", "广东省");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			//城市断言		
			String city = sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[3]");
			if(city.equals("城市")){
				System.out.println("省市区列表测试通过!");
			}else{
				System.out.println("省市区列表测试失败");
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
