package Miscellenous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/date-calculator.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(1000);
//august 4
		driver.findElement(By.xpath("//a[@id='today_ID_Link']//img[@title='Calendar']")).click();

		while (!driver.findElement(By.id("today_Current_ID")).getText().contains("August")) {
			driver.findElement(By.cssSelector("td[id='today_Next_ID'] img")).click();
		}

		// ctrl+a , CTRL+SHIFT+F

		List<WebElement> dates = driver.findElements(By.className("calendarDateInput"));
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("calendarDateInput")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("calendarDateInput")).get(i).getText();
			if (text.equalsIgnoreCase("4")) {
				driver.findElements(By.className("calendarDateInput")).get(i).click();
				break;
			}

		}
	}

}