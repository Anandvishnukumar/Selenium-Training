package Week1.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver testcreatelead = new ChromeDriver();
		testcreatelead.get("http://leaftaps.com/opentaps/");
		testcreatelead.manage().window().maximize();
		testcreatelead.findElement(By.id("username")).sendKeys("Demosalesmanager");
		testcreatelead.findElement(By.id("password")).sendKeys("crmsfa");
		testcreatelead.findElement(By.className("decorativeSubmit")).click();
		testcreatelead.findElement(By.partialLinkText("CRM")).click();
		testcreatelead.findElement(By.partialLinkText("Leads")).click();
		testcreatelead.findElement(By.linkText("Create Lead")).click();
		testcreatelead.findElement(By.id("createLeadForm_companyName")).sendKeys("Company Name");
		testcreatelead.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		testcreatelead.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		testcreatelead.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		testcreatelead.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		System.out.println("Title is " + testcreatelead.getTitle());
		testcreatelead.close();
	}

}
