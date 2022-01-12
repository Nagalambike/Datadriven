///PROGRAM TO HANDLE MODAL DIALOG BOX IN ORANGEHRM APP//////////////////////////////////////////////////////////////

package Orange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupshandle {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	//click on time
	driver.findElement(By.id("menu_time_viewTimeModule")).click();
	Actions a=new Actions(driver);
	
	//click on view

	driver.findElement(By.xpath("//a[@id='viewSubmitted'][1]")).click();
	//click on addtimesheet
	driver.findElement(By.id("btnAddTimesheet")).click();
	Thread.sleep(3000);
	
	///HANDLE MODAL BOX
	   driver.findElement(By.id("addTimesheetBtn")).click();
	   
}
}
