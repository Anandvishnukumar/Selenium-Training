package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssesementDropDownElements {

	public static void main(String[] args) throws InterruptedException {

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

		WebElement Sourceselect = testcreatelead.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select Source = new Select(Sourceselect);
		Source.selectByIndex(1);

		WebElement Industryselect = testcreatelead.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select Industry = new Select(Industryselect);
		Industry.selectByValue("IND_SOFTWARE");

		WebElement Ownerselect = testcreatelead.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Owner = new Select(Ownerselect);
		Owner.selectByVisibleText("S-Corporation");

		testcreatelead.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		System.out.println("Title is " + testcreatelead.getTitle());
		testcreatelead.close();

		
	}

}
