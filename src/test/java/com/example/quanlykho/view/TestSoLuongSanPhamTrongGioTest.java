package com.example.quanlykho.view;
import org.junit.jupiter.api.*;
import org.junit.After;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSoLuongSanPhamTrongGioTest {
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
  public void testSoLuongSanPhamTrongGio() {

    driver.manage().window().setSize(new Dimension(1680, 982));
    driver.findElement(By.cssSelector(".bi-cart > path")).click();
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    driver.findElement(By.cssSelector(".row:nth-child(3) > .d-flex")).click();
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    driver.findElement(By.cssSelector(".row:nth-child(7) #form1")).click();
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ripple-surface"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    driver.findElement(By.cssSelector(".btn-dark")).click();
    driver.findElement(By.cssSelector(".btn")).click();
  }
}
