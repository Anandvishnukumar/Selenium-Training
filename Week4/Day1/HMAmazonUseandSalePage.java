package week4.day1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HMAmazonUseandSalePage {

	public static void main(String[] args) throws InterruptedException, IOException {


		ChromeDriver useandsale=new ChromeDriver();
		useandsale.get("https://www.amazon.in");
		useandsale.manage().window().maximize();
		useandsale.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement usesaleele = useandsale.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	    
	    Actions act=new Actions(useandsale);
	    
	    act.scrollToElement(usesaleele).perform();
	    String text = usesaleele.getText();
	    System.out.println(text);
	    
	    File source = useandsale.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/1.jpg");
		FileUtils.copyFile(source, destination);

		Thread.sleep(3000);
		useandsale.close();
		
	}

}
