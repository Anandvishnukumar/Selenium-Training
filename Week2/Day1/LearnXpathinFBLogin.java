package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathinFBLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver learnXPathFB=new ChromeDriver();
		
		learnXPathFB.manage().window().maximize();
		learnXPathFB.get("https://www.facebook.com/");
		
		learnXPathFB.findElement(By.xpath("//input[@name='email']")).sendKeys("anandvishnukumar@gmail.com");
		learnXPathFB.findElement(By.xpath("//input[@name='pass']")).sendKeys("password00998877");
		
		
		learnXPathFB.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(10000);
		
		learnXPathFB.close();

	}

}
