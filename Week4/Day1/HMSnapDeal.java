package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.api.trace.Span;

public class HMSnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
	

		ChromeDriver snap = new ChromeDriver();
		snap.get("https://www.snapdeal.com/");
		snap.manage().window().maximize();
		snap.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement Mensfashionelement = snap.findElement(By.xpath("(//span[@class='catText'])[1]"));

Actions builder=new Actions(snap);
builder.moveToElement(Mensfashionelement).perform();

WebElement sportsshoeselement = snap.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
builder.click(sportsshoeselement).perform();


WebElement sportsshoecountelemet = snap.findElement(By.xpath("(//li[@class='child-cat-list cat-list ']//div[@class='child-cat-count '])[1]"));
String sportsshoecount = sportsshoecountelemet.getText();
System.out.println("The Mens Sports Shoe Count is "+ sportsshoecount);

snap.findElement(By.xpath("//div[text()='Training Shoes']")).click();




snap.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();

WebElement prricelowtohighelement = snap.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]"));

builder.moveToElement(prricelowtohighelement).perform();
builder.click(prricelowtohighelement).perform();
Thread.sleep(3000);


List<WebElement> pricelistele=snap.findElements(By.xpath("//span[@class='lfloat product-price']"));
List<Integer> pricelist = new ArrayList<Integer>();



System.out.println("productsPrice size " + pricelistele.size());

for (int i = 0; i < pricelistele.size(); i++) {
	String str = pricelistele.get(i).getText().replace("Rs. ", "").replace(",", "");
	int value = Integer.parseInt(str);
	pricelist.add(value);
}

System.out.println("The Price List " + pricelist);

WebElement frompriceelement = snap.findElement(By.xpath("//input[@name='fromVal']"));
frompriceelement.clear();
frompriceelement.sendKeys("500");

WebElement topriceelement = snap.findElement(By.xpath("//input[@name='toVal']"));
topriceelement.clear();
topriceelement.sendKeys("700");

snap.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
Thread.sleep(3000);
snap.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::label)[2]")).click();

List<WebElement> fileterlistele= snap.findElements(By.xpath("//div[@class='navFiltersPill']"));

System.out.println("No of Filters Applied " + fileterlistele.size());
Thread.sleep(3000);
WebElement firstresultele = snap.findElement(By.xpath("(//div[contains(@class,'col-xs-6 ')])[3]"));

Actions quickview=new Actions(snap);
quickview.moveToElement(firstresultele).perform();

snap.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();

WebElement discpercentageelement = snap.findElement(By.xpath("//span[@class='percent-desc ']"));
String DiscPercentage = discpercentageelement.getText();
System.out.println("The Discount percentage is : "+DiscPercentage);

WebElement ActualPriceElement = snap.findElement(By.xpath("//span[@class='strikee ']"));
String ActualPrice = ActualPriceElement.getText();
ActualPrice.replace(",", "");
System.out.println("The MRP is : " +ActualPrice);

WebElement OfferPriceElement = snap.findElement(By.xpath("//span[@class='payBlkBig']"));
String OfferPrice = OfferPriceElement.getText();
System.out.println("The Offer Price is : " +OfferPrice);


snap.findElement(By.xpath("//div[contains(@class ,'close close')]/i")).click();
snap.close();
	}

}