package Week3.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListClassAssingment {

	public static void main(String[] args) {

		ChromeDriver createfbacct = new ChromeDriver();
		createfbacct.get("https://www.facebook.com/");
		createfbacct.manage().window().maximize();
		createfbacct.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		List<WebElement> links = createfbacct.findElements(By.tagName("a"));	
		int linkcount =links.size();
		
		System.out.println("Total Number of Tags " + linkcount) ;
		
		for (WebElement i : links) {
			
			String txt= i.getText();
			
			System.out.println(txt);
			
			
			
		}
	}

}
