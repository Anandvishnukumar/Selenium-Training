package Week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTrainNumber {

	public static void main(String[] args) {

		ChromeDriver chh = new ChromeDriver();
		chh.manage().window().maximize();
		chh.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chh.get("https://erail.in/");

		WebElement fromstation = chh.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("MAS", Keys.ENTER);

		WebElement tostation = chh.findElement(By.id("txtStationTo"));
		tostation.clear();
		tostation.sendKeys("TVC", Keys.ENTER);

		chh.findElement(By.id("chkSelectDateOnly")).click();

		List<WebElement> namm = chh.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]"));
		System.out.println("TT " + namm.size());

		for (int i = 0; i < namm.size(); i++) {
			String text = namm.get(i).getText();
			System.out.println(text);
		}

	}

}