package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
       WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9638833251");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Shreelakshmi0303");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div/div[2]")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[2]/span/div/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[3]/span/div/a")).click();	
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[1]/div/a/div[1]/div[2]/div/div/div/div/span/span")).click();
		Thread.sleep(5000);
		WebElement searchBox =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/label"));
		Thread.sleep(5000);
		searchBox.click();
		searchBox.sendKeys("paras pachore");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/div[2]/span/span/div/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div/div[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/div[1]/span/span/div/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]")).click();
		

	}

}
