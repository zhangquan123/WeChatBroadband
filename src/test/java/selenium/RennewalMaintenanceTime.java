package selenium;

import java.io.IOException;

import org.testng.annotations.Test;

public class RennewalMaintenanceTime {
	//续约维护时间
	@Test(groups="RennewalMaintenanceTime")
	public void MaintenanceTime() throws IOException{
		Share sha = Share.getInstance();
		try {			
			//进入续约维护时间
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(5) > section > p > span");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");			
			sha.thread(2000);
			//输入身份或城市、查询、重置
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "江苏省");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[1]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/button[2]");
			sha.thread(1200);
			//添加维护时间设置、省份、地区
			sha.xpathClick("/html/body/section/section[1]/button[3]");
			sha.thread(1000);
			sha.pullDown("/html/body/section/section[2]/select", "广东省");
			sha.thread(1200);
			sha.selectorClick("#companySelect");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[3]/section/section/section/section/section/section[2]/section[3]/section/section[1]/span/span");
			sha.xpathClick("/html/body/section/section[1]/section/span[1]");
			//查询条件 、每月维护时间
			sha.selectorClick("body > section > section:nth-child(4) > section > section:nth-child(2)");
			sha.thread(1000);
			sha.selectorClick("body > section > section:nth-child(5) > section > section.radio.mg-r10 > label");
			sha.thread(1000);
			//每月   续约套餐生效时间   取消
			sha.pullDown("/html/body/section/section[6]/select[1]", "15号");
			sha.thread(1000);
			sha.pullDown("/html/body/section/section[6]/select[2]", "20号");
			sha.thread(1000);
			sha.pullDown("/html/body/section/section[7]/select", "当日");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[8]/button[1]");
			String ss=sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[3]");	
			//省份数据判断
			String sf = sha.xpathGetText("/html/body/section/section[3]/section/section/span[1]");			
			String sub = (String) sf.subSequence(2, 4);
			int ma = Integer.valueOf(sub);			
			if("23".equals(ma)){
				System.out.println("省份数据判断成功！");
			}
			//System.out.println(ss);
			if(ss.equals("每月维护时间")){
				System.out.println("续约维护时间设置测试通过！");
			}else{
				System.out.println("续约维护时间设置断言失败！");
			}					
			sha.quitIframe();
			sha.thread(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			sha.ScreenShot();
			e.printStackTrace();			
		}
	}
}
