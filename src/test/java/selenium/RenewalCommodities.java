package selenium;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RenewalCommodities {

	@Test(groups="RenewalCommodities")
	public void RenewalOfCommodities() throws IOException{
		//续约商品列表
		Share sha = Share.getInstance();
		try {
			//进入续约商品列表功能								
			sha.selectorClick("#menuFoxIn > section:nth-child(2) > section.sub-menu.pd-l15.pd-r10 > section > section:nth-child(2) > section > p > span");
			sha.enterIframe("/html/body/section/section[4]/section/iframe");			
			sha.thread(1000);
			//列表导入按钮，下载文件
			sha.xpathClick("/html/body/section/section[1]/section[2]/button[1]");
			sha.thread(1000);
			sha.xpathLinkTextClick("续约销售品导入模板.xls");
			sha.thread(1500);
			//上传导入文件			
			sha.thread(1000);
			sha.uploadFile("/html/body/section/section[2]/section/section/section/form/input", "C://Users//Administrator//Desktop//QMMgrBackup_MisDel//续约销售品导入模板.xlsx");
			sha.thread(2000);
			//输入、搜索、查看
			sha.xpathSendKeys("/html/body/section/section[1]/section[1]/input", "GDSXP20191208232399");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[1]/section[2]/button[2]");
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[2]/table/tbody/tr[1]/td[7]/button[2]");
			//查看页面数据与列表主页数据对比(速率、销售品nbr)、查看返回			
			String tt1 = sha.xpathGetText("/html/body/section/section[2]/section[4]/section[2]");	
			String ff1 = sha.xpathGetText("/html/body/section/section[2]/section[7]/section[2]");
			sha.thread(1500);
			sha.xpathClick("/html/body/section/section[1]/button");			
			String tt2 = sha.xpathGetText("/html/body/section/section[2]/table/tbody/tr/td[3]");	
			String ff2 = sha.xpathGetText("/html/body/section/section[2]/table/tbody/tr/td[2]");
			if(tt1.equals(tt2)&&ff1.equals(ff2)){
				System.out.println("查看页面与列表页面数据一致！");
			}else{
				System.out.println("查看页面与列表页面数据不一致");
			}
			sha.thread(1000);
			//编辑、取消编辑、			
			/*sha.xpathClick("/html/body/section/section[2]/table/tbody/tr/td[7]/button[1]");
			sha.thread(1500);			
			sha.selectorClick("body > section > section.mask.full-width.fix.full-height.lt0.psd-layer > section > section.form-inline.text-center > button.btn.btn-primary");
			sha.thread(1200);*/
			//重置、分页
			sha.xpathClick("/html/body/section/section[1]/section[2]/button[3]");	
			sha.thread(1200);
			sha.xpathClick("/html/body/section/section[3]/section/ul/li[8]");
			sha.thread(1000);
			sha.xpathClick("/html/body/section/section[3]/section/ul/li[8]");
			//续约商品列表断言
			Assert.assertEquals("销售品NBR",sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[2]"));
			Assert.assertEquals("价格(元)", sha.xpathGetText("/html/body/section/section[2]/table/thead/tr/th[4]"));
			System.err.println("续约商品列表测试通过！");
			sha.quitIframe();
			sha.thread(1500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======exception reason=======" + e);
			sha.ScreenShot();
			e.printStackTrace();
		}
	} 

}
