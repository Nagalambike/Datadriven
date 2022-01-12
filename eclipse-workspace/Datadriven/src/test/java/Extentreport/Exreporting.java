///EXTENT REPORT///
//ADD DEPENDENCY//
//





package Extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exreporting {

	public static void main(String[] args) {
		ExtentHtmlReporter Htmlreport=new ExtentHtmlReporter("extentreports.html");//give name to file
//create extentreporter ================
		ExtentReports extent=new ExtentReports();
//aattach reporter============
			extent.attachReporter(Htmlreport);
///create toggle for the given test,adds all log events under it			
			ExtentTest test1=extent.createTest("Google search test one","this is test to validate google search finctionality");
			
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			//log(status,details)
			test1.log(Status.INFO, "starting test case");
			driver.get("https://google.com");
			test1.pass("navigated to google page");
			
			WebElement web= driver.findElement(By.name("q"));
			web.sendKeys("automation");
			test1.pass("entered text");
			web.sendKeys(Keys.ENTER); 		
			 test1.pass("press keyboard enter key");
		 
			 driver.close();
			 driver.quit();//close browser
			 
			 test1.info("test completed");
			 extent.flush();//report will be created and data will be added
			 					
	}


}
