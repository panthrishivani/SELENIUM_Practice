import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(int i=0;i<values.size();i++) {
//			System.out.println(Integer.parseInt(values.get(i).getText()));
			 sum = sum + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		System.out.println(Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()));
		 int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		 Assert.assertEquals(total, sum);
		 System.out.println("teststst");
	}
	
}
		
		

	



