package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class HmeAssignmentDeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver testdeletelead = new ChromeDriver();
		testdeletelead.get("http://leaftaps.com/opentaps/");
		testdeletelead.manage().window().maximize();

		testdeletelead.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		testdeletelead.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		testdeletelead.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		testdeletelead.findElement(By.partialLinkText("CRM")).click();
		testdeletelead.findElement(By.partialLinkText("Leads")).click();
		testdeletelead.findElement(By.linkText("Find Leads")).click();
		testdeletelead.findElement(By.linkText("Phone")).click();
        testdeletelead.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9895400511");
		testdeletelead.findElement(By.linkText("Find Leads")).click();
		//testdeletelead.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();

		//testdeletelead

		testdeletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		testdeletelead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//WebElement GetFirsttext = testdeletelead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		// Texxt = GetFirsttext.getText();
		//testdeletelead.
		
		//System.out.println("The first Id of listed data is:"+Texxt);
		
		
		//String firstId = testdeletelead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		//System.out.println("The first Id of listed data is:"+firstId);
		
		//WebElement Firstidd=testdeletelead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		
		//Firstidd.getText();
		//System.out.println("The first Id of listed data is:"+Firstidd);	
				
	}

}
