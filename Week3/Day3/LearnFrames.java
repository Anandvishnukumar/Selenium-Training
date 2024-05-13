package Week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) {

		ChromeDriver Frames = new ChromeDriver();
		Frames.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Frames.manage().window().maximize();
		Frames.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement framefind = Frames.findElement(By.xpath("//iframe[@id='iframeResult']"));
		Frames.switchTo().frame(framefind);
		Frames.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertmessage = Frames.switchTo().alert();
		alertmessage.accept();

		WebElement findElement = Frames.findElement(By.xpath("//p[@id='demo']"));
		String text = findElement.getText();
		System.out.println(text);

		Frames.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertmessage1 = Frames.switchTo().alert();
		alertmessage1.dismiss();

		WebElement findElement1 = Frames.findElement(By.xpath("//p[@id='demo']"));
		String text1 = findElement1.getText();
		System.out.println(text1);
	}
}
