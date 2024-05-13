package Week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMWindowHandling {

	public static void main(String[] args) {

		ChromeDriver winhan = new ChromeDriver();
		winhan.get("http://leaftaps.com/opentaps/control/login");
		winhan.manage().window().maximize();
		winhan.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		winhan.findElement(By.id("username")).sendKeys("demosalesmanager");
		winhan.findElement(By.id("password")).sendKeys("crmsfa");
		winhan.findElement(By.className("decorativeSubmit")).click();
		winhan.findElement(By.linkText("CRM/SFA")).click();
		winhan.findElement(By.linkText("Contacts")).click();
		winhan.findElement(By.linkText("Merge Contacts")).click();
		winhan.findElement(By.xpath("(//table[@class='twoColumnForm']//tr/td[2]/a)[1]")).click();

		String parentwindow = winhan.getWindowHandle();
		String parwindtit = winhan.getTitle();
		System.out.println("parent window title :" + winhan.getTitle());

		winhan.getWindowHandles();
		System.out.println("child window : " + winhan.getTitle());

		Set<String> childwindow = winhan.getWindowHandles();
		System.out.println("No od windows opened " + childwindow.size());
		List<String> childwin = new ArrayList<String>(childwindow);

		winhan.switchTo().window(childwin.get(1));

		String chiwintit = winhan.getTitle();
		System.out.println(chiwintit);
		winhan.manage().window().maximize();

		winhan.findElement(By.xpath("(//div[@class='x-grid3-row   ']/table//td/div/a)[1]")).click();
		
		winhan.switchTo().window(parentwindow);
		System.out.println("parent window title :" + winhan.getTitle());

		
		winhan.findElement(By.xpath("(//table[@class='twoColumnForm']//tr/td[2]/a)[2]")).click();
		
		Set<String> childwindow2 = winhan.getWindowHandles();
		System.out.println("No od windows opened " + childwindow2.size());
		List<String> childwin2 = new ArrayList<String>(childwindow2);

		winhan.switchTo().window(childwin2.get(1));

		System.out.println(chiwintit);
		//winhan.manage().window().maximize();
		
		
		winhan.findElement(By.xpath("(//div[@class='x-grid3-row    x-grid3-row-alt']/table//td/div/a)[1]")).click();
		winhan.switchTo().window(parentwindow);
winhan.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
Alert alertmessage = winhan.switchTo().alert();
alertmessage.accept();

System.out.println("after merge : "+winhan.getTitle());


	}
}