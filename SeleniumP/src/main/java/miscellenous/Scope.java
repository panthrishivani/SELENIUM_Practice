package Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
//		WebDriver footersection =new driver();
//		LIMIT WEBDRIVER SCOPE
//		never use elements
		WebElement Footersection=driver.findElement(By.id("gf-BIG"));
		System.out.println(Footersection.findElements(By.tagName("a")).size());
		WebElement FirstColumn =Footersection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(FirstColumn.findElements(By.tagName("a")).size());
		for(int i=1;i<FirstColumn.findElements(By.tagName("a")).size();i++) {
			String clickon = Keys.chord(Keys.CONTROL,Keys.ENTER);
			FirstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickon);
			Thread.sleep(5000);
		}
			 Set<String> test=driver.getWindowHandles();
			 Iterator <String> it= test.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
