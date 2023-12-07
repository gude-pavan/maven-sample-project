package StepDefenitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pagefactory.HRY_alerts_page_PF;
import Pagefactory.HYRtutorials_Iframes_PF;
import Pagefactory.SL_Loginpage_PF;
import Pagefactory.SL_Products_page_PF;
import io.cucumber.java.Scenario;


public class browsersetup {
		public WebDriver driver;
		public SL_Loginpage_PF login;
		public SL_Products_page_PF products;
		public HYRtutorials_Iframes_PF hyriframe;
		public HRY_alerts_page_PF Hyralertspage;
		

		public HRY_alerts_page_PF getHyralertspage() {
			return Hyralertspage;
		}

		public HYRtutorials_Iframes_PF getHyriframe() {
			return hyriframe;
		}

		public SL_Loginpage_PF getLogin() {
			return login;
		}

		public SL_Products_page_PF getProducts() {
			return products;
		}

		public WebDriver getDriver() {
			return driver;
		}

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}

		public void initializebrowser(WebDriver driver) {
			login = new SL_Loginpage_PF(driver);
			products = new SL_Products_page_PF(driver);
			hyriframe = new HYRtutorials_Iframes_PF(driver);
			Hyralertspage = new HRY_alerts_page_PF(driver);
	
}
		public void closebrowser(Scenario scenario) {
			
			String Scenarioname = scenario.getName();
			
			if(scenario.isFailed()) {
				TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
				byte[] scrshot = takesscreenshot.getScreenshotAs(OutputType.BYTES);
				scenario.attach(scrshot,"image/png","Failed screenshot of "+ Scenarioname);
			}
			
			driver.close();
			driver.quit();
			System.out.println("===Browser closed with Hooks file===");
		}
	
}

