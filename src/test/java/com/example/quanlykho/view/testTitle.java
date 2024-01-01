package com.example.quanlykho.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class testTitle {
  private WebDriver driver;

  @BeforeEach
  public void setUp() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/maccuacu/Downloads/chromedriver_mac/chromedriver");
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
    driver.get("http://localhost:9091/");
    Thread.sleep(5000);
  }

  @AfterEach
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void testTitle01() {
    String expectedTitle = "BoyPho store";
    driver.get("http://localhost:9091/LoginServlet");
    String actualTitle = driver.getTitle();

    if (actualTitle.equals(expectedTitle)) {
      System.out.println("  passed");
    } else {
      System.out.println("  failed");
    }
  }
}
