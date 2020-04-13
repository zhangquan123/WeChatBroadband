package selenium;


import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	//找到浏览器
	@BeforeSuite
	public void OpenBrowser(){
			//System.setProperty("webdriver.firefox.bin", "C://Program Files//firefox53//firefox.exe");
			//System.setProperty("webdriver.geckodriver.driver", "F://geckodriver//geckodriver.exe");			
			System.setProperty("webdriver.chrome.bin", "C://Users//Administrator//AppData//Local//Google//Chrome//Application//chrome.exe");					
	}	

	//实现登录
	@Test(groups="Login")
	public void login() throws InterruptedException, IOException{
		Share sha = Share.getInstance();
		try {				
			
			sha.inputUrl("http://elifepay-web-dashboard-1256068900.cos.ap-chengdu.myqcloud.com/login.html");			
			sha.maxSize();
			sha.xpathSendKeys("/html/body/section/section[1]/section/section/section/section[1]/input", "18520042490");
			sha.thread(800);
			sha.xpathSendKeys("/html/body/section/section[1]/section/section/section/section[2]/input", "Zq940826");
			sha.thread(800);
			sha.selectorClick("body > section > section.login-bg.full-width.no-min.full-height > section > section > section > section.login-content-line-pd.pd-t10 > button");
			sha.implicitlyWait(10);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("======exception reason=======" + e);			
			sha.ScreenShot();
			e.printStackTrace();
		}
	}
	
	/*//测试登陆
	public static void main(String[] args) {		
		Share sha = Share.getInstance();		
		sha.inputUrl("https://www.baidu.com/");
	}*/
}
