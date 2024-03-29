package com.example.quanlykho.view;// Generated by Selenium IDE
import org.junit.jupiter.api.*;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSessionCart {
  private WebDriver driver;

  @BeforeEach
  public void setUp() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/maccuacu/Downloads/chromedriver_mac/chromedriver");
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
    driver.get("http://localhost:9091/");
    Thread.sleep(5000);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testSessionCart01() {
    // Test name: TestSessionCart01
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  | 
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | css=.bi-cart |  | 
    driver.findElement(By.cssSelector(".bi-cart")).click();
    // 4 | click | css=html |  | 
    driver.findElement(By.cssSelector("html")).click();
  }
  @Test
  public void testSessionCart02() {
    // Test name: TestSessionCart02
    // Step # | name | target | value | comment
    // 1 | open | / |  |
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  |
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | linkText=Logout |  |
    driver.findElement(By.linkText("Logout")).click();
    // 4 | click | id=form2Example18 |  |
    driver.findElement(By.id("form2Example18")).click();
    // 5 | type | id=form2Example18 | admin@gmail.com |
    driver.findElement(By.id("form2Example18")).sendKeys("admin@gmail.com");
    // 6 | click | id=form2Example28 |  |
    driver.findElement(By.id("form2Example28")).click();
    // 7 | type | id=form2Example28 | admin |
    driver.findElement(By.id("form2Example28")).sendKeys("admin");
    // 8 | click | css=.btn |  |
    driver.findElement(By.cssSelector(".btn")).click();
    // 9 | click | css=.nav-item:nth-child(2) |  |
    driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();
    // 10 | click | css=.bi-cart |  |
    driver.findElement(By.cssSelector(".bi-cart")).click();
  }

}
