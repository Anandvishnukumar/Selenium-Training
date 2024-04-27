package Week1.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver fblogin=new ChromeDriver();
		fblogin.manage().window().maximize();
		fblogin.get("https://www.facebook.com/");
		fblogin.findElement(By.id("email")).sendKeys("anandvishnukumar@gmail.com");
		fblogin.findElement(By.id("pass")).sendKeys("*************");
		fblogin.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		System.out.println("Title is " + fblogin.getTitle());
fblogin.close();
}
}
