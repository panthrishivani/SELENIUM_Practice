package Section11;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class Calender {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
//=================================  ab theek kaam krega.   meri class h . issue aayega to btana
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.path2usa.com/travel-companions");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//April 23
driver.findElement(By.id("form-field-travel_comp_date")).click();
Thread.sleep(1000);

//JavaScriptExecutor js = (JavaScriptExecutor)driver

while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}


List<WebElement> dates= driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
int count=driver.findElements(By.className("day")).size();

for(int i=0;i<count;i++)
{
String text=driver.findElements(By.className("day")).get(i).getText();
if(text.equalsIgnoreCase("21"))
{
driver.findElements(By.className("day")).get(i).click();
break;
}

}
}

}