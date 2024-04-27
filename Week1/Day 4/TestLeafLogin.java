package Week1.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver chromebr=new ChromeDriver();
chromebr.manage().window().maximize();
chromebr.get("http://leaftaps.com/opentaps/control/main");
chromebr.findElement(By.id("username")).sendKeys("Demosalesmanager");
chromebr.findElement(By.id("password")).sendKeys("crmsfa");
chromebr.findElement(By.className("decorativeSubmit")).click();
chromebr.findElement(By.partialLinkText("CRM")).click();
Thread.sleep(6000);
chromebr.findElement(By.className("linktext")).click();
Thread.sleep(4000);
chromebr.close();
		
	}

}
