package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HmeAssignmentEditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver testeditlead = new ChromeDriver();
		testeditlead.get("http://leaftaps.com/opentaps/");
		testeditlead.manage().window().maximize();

		testeditlead.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		testeditlead.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		testeditlead.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		testeditlead.findElement(By.partialLinkText("CRM")).click();
		testeditlead.findElement(By.partialLinkText("Leads")).click();
		testeditlead.findElement(By.linkText("Create Lead")).click();
		testeditlead.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])")).sendKeys("Test Comp");
		testeditlead.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])")).sendKeys("Arnold");
		testeditlead.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])")).sendKeys("one");
		testeditlead.findElement(By.id("createLeadForm_departmentName")).sendKeys("test Depp");
		testeditlead.findElement(By.id("createLeadForm_description"))
				.sendKeys("Selenium has been one of the most effective testing tools for many reasons.");

		WebElement SelectState = testeditlead
				.findElement(By.xpath("(//select[@id='createLeadForm_generalStateProvinceGeoId'])"));
		Select State = new Select(SelectState);
		State.selectByVisibleText("New York");
		testeditlead.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("anandgg@cc.com");
		testeditlead.findElement(By.xpath("(//input[@name='submitButton'])")).click();

		testeditlead.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();

		WebElement DeleteDesc = testeditlead.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		DeleteDesc.clear();

		testeditlead.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("update the new field");

		testeditlead.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		System.out.println("The Title of the page is "+testeditlead.getTitle());

		testeditlead.close();

	}

}
