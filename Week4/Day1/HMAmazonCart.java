package week4.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMAmazonCart {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		ChromeDriver cart=new ChromeDriver();
		cart.get("https://www.amazon.in");
		cart.manage().window().maximize();
		cart.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		cart.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 13c 5g",Keys.ENTER);
		WebElement priceelement = cart.findElement(By.className("a-price-whole"));
		String firstprice = priceelement.getText();
		System.out.println("The Base price is : " +firstprice);
		
		
		int baseprice = Integer.parseInt(firstprice.replaceAll(",", ""));

		//System.out.println("The Base Price is : "+baseprice);
		
		priceelement.click();
		Thread.sleep(5000);
		
		WebElement starelement = cart.findElement(By.xpath("(//span[@class='a-declarative']//a/span[@class='a-size-base a-color-base'])[1]"));
	    String revval = starelement.getText();
	System.out.println("The Customer review value is " +revval);
	
//	
//	cart.findElement(By.id("magnifierLens")).click();
//	
//	File source = cart.getScreenshotAs(OutputType.FILE);
//	File destination = new File("./snapshot/2.jpg");
//	FileUtils.copyFile(source, destination);

//	Thread.sleep(3000);
//	
//	WebElement prodpriele = cart.findElement(By.xpath("(//div[@class='imgTagWrapper']//img)[1]"));
//	String prdname = prodpriele.getText();
//	System.out.println("the product name : "+ prdname);
	
	
	WebElement prodtitleEle = cart.findElement(By.xpath("//div[@id='titleSection']//span"));
	String prodtitlestring = prodtitleEle.getText();
	System.out.println("The Product title is : "+prodtitlestring);
	
	cart.findElement(By.xpath("(//span[@id='submit.add-to-cart']//input)[2]")).click();
	Thread.sleep(5000);
	
	

	
	WebElement cartpriceelement = cart.findElement(By.xpath("//div[@id='attach-added-to-cart-message']//span[@id='attach-accessory-cart-subtotal']"));
	String cartprice = cartpriceelement.getText();
	System.out.println("The Cart Parice " + cartprice);
	
	int cartprice1 = Integer.parseInt(firstprice.replaceAll(",", ""));

	//System.out.println("The Cart Price : " + cartprice1);

	
	
	if (baseprice==cartprice1) {
		System.out.println("-----------------------" );
		System.out.println();

		System.out.println("The Base price is : " +baseprice);
		System.out.println("The Cartt Parice " + cartprice1);
		
		System.out.println("The Price is matching" );
		
	} else {

		System.out.println("-----------------------" );
		System.out.println();

		System.out.println("The Base price is : " +baseprice);
		System.out.println("The Cartt Parice " + cartprice1);
		
		System.out.println("The Price is not matching" );

	}
	
	
	 cart.close();

	}

}
