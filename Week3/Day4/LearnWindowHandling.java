package Week3.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver windowhand= new ChromeDriver();
		windowhand.get("https://www.irctc.co.in/nget/train-search");
		windowhand.manage().window().maximize();
		System.out.println("The Title of parent window is "+windowhand.getTitle());
		
		windowhand.findElement(By.xpath("//li[@id='flight']//span[1]")).click();
		
		Set<String> windowHandles = windowhand.getWindowHandles();
		
		System.out.println("Total no of windows opened "+ windowHandles.size());

		
		List<String> windowHandles1=new ArrayList<String>(windowHandles);
		windowhand.switchTo().window(windowHandles1.get(1));
	System.out.println("The Title of Child window is " +windowhand.getTitle());
	
	windowhand.close();
	windowhand.switchTo().window(windowHandles1.get(0));
	windowhand.findElement(By.xpath("//li[@id='flight']//span[1]")).click();
	windowhand.quit();


	}

}
