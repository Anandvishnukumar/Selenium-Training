package Week3.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HMListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		// Print the count of the items found.
		WebElement findElement = driver.findElement(By.xpath("//div[@class='length']/strong"));
		String totalItemsFound = findElement.getText();
		System.out.println("Men 'Fashion Bags' items found = " + totalItemsFound);

		List<WebElement> findMenBrandsElements = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Men bags brand list count = " + findMenBrandsElements.size());
		for (WebElement webElement : findMenBrandsElements) {
			System.out.println(webElement.getText());
		}

		System.out
				.println("******************************************************************************************");

		List<WebElement> findMenBrandsBagsElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Men bags name list count = " + findMenBrandsBagsElements.size());
		for (WebElement webElement : findMenBrandsBagsElements) {
			System.out.println(webElement.getText());
		}
	}
}