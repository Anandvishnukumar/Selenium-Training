package Week1.Day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.facebook.com");
		chrome.manage().window().maximize();
		chrome.close();
	}

}
