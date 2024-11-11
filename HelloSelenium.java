package com.selenium.learn; // Your package structure may be different or if using default package remove this.
 
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class HelloSelenium {
WebDriver driver;
String url = "https://www.google.com/";
 
@Before
public void setUp() {
//Set the key/value property according to the browser you are using.
System.setProperty("webdriver.chrome.driver","/home/ruthra/Selenium_Setup/chromedriver");
 
//Open browser instance
driver = new ChromeDriver();
 
//Open the AUT
driver.get(url);
}
 
@Test
public void test() throws InterruptedException {
//Fetch the page title
String pageTitle = driver.getTitle();
System.out.println("Page title: " + pageTitle);
 
//Hey Google
driver.findElement(By.name("q")).sendKeys("Hey World");
Thread.sleep(3000);
driver.findElement(By.name("btnK")).click();
Thread.sleep(5000);
 
}
 
@After
public void tearDown() {
//Close the browser
driver.close();
}
}