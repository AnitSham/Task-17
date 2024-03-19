package com.guvi.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealTask17 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.snapdeal.com/");
		WebElement movcur = driver.findElement(By.xpath("//div/span[contains(@class,'accountUserName ')]"));
		Actions action = new Actions(driver);
		action.moveToElement(movcur).build().perform();
		action.clickAndHold(movcur).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("anianit29@gmail.com");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		driver.findElement(By.id("j_number")).sendKeys("9345363554");
		driver.findElement(By.xpath("//div/input[@id='j_name']")).sendKeys("Anitha");
		driver.findElement(By.xpath("//div/input[@name='j_dob']")).click();
		driver.findElement(By.xpath("//td[text()='29']")).click();
		driver.findElement(By.cssSelector("input#j_password")).sendKeys("AnSh@21");
		driver.findElement(By.id("userSignup")).click();
		driver.findElement(By.linkText("Continue to Login")).click();
		driver.findElement(By.xpath("//input[@id='j_password_login_uc']")).sendKeys("AnSh@21");
		driver.findElement(By.id("submitLoginUC")).click();

	}
}
