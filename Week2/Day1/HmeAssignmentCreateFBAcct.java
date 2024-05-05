package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HmeAssignmentCreateFBAcct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver createfbacct = new ChromeDriver();
		createfbacct.get("https://www.facebook.com/");
		createfbacct.manage().window().maximize();
		createfbacct.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		createfbacct.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
		createfbacct.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arnold");
		createfbacct.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bruce");

		createfbacct.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("anand.vv@gmail.com");

		createfbacct.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("anand.vv@gmail.com");

		createfbacct.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Welcome@123");

		WebElement DaySelect = createfbacct.findElement(By.xpath("//select[@id='day']"));
		Select Day = new Select(DaySelect);
		Day.selectByValue("8");

WebElement SelectMonth=createfbacct.findElement(By.xpath("//select[@id='month']"));
Select Month = new Select(SelectMonth);
Month.selectByVisibleText("Apr");

WebElement SelectYear= createfbacct.findElement(By.xpath("//select[@id='year']"));
Select Year=new Select(SelectYear);
Year.selectByValue("1985");

createfbacct.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

	createfbacct.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	// createfbacct.close();
	 
	}

}
