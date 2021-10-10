package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse4{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
	WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));	
	WebElement des = driver.findElement(By.xpath("//*[@id='droppable']"));	
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).perform();
		
	}
}
