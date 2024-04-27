package Week1.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver testcreateacct = new ChromeDriver();
		
		testcreateacct.get("http://leaftaps.com/opentaps/");
		testcreateacct.manage().window().maximize();
		
		testcreateacct.findElement(By.id("username")).sendKeys("Demosalesmanager");
		testcreateacct.findElement(By.id("password")).sendKeys("crmsfa");
		testcreateacct.findElement(By.className("decorativeSubmit")).click();
		testcreateacct.findElement(By.partialLinkText("CRM")).click();
		
		testcreateacct.findElement(By.linkText("Accounts")).click();
		
		
		testcreateacct.findElement(By.linkText("Create Account")).click();
		testcreateacct.findElement(By.id("accountName")).sendKeys("Account NameTest");	
		
		testcreateacct.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		testcreateacct.findElement(By.id("numberEmployees")).sendKeys("150");
		
		testcreateacct.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		
		
		testcreateacct.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		System.out.println("The Title is " + testcreateacct.getTitle());
		testcreateacct.close();
		
	}

}
