package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPointFramework\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com");
		
		String s = driver.getTitle();
		System.out.println(s);
		
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		
		if(s.equals("Rediff.coms: Online Shopping, Rediffmail, Latest India News, Business, Bollywood, Sports, Stock, Live Cricket Score, Money, Movie Reviews")){
			System.out.println("Title is correct!");
		}
		else{
			System.out.println("Title is not correct!");
		}
		
		InvokeBrowser I = new InvokeBrowser();
		I.tearDown();

	}

	public void tearDown(){
		driver.quit();
	}
}
