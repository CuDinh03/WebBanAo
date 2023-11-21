package com.example.quanlykho.view;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestSoLuongSanPhamTrongGioTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testSoLuongSanPhamTrongGio() {
    // Test name: TestSoLuongSanPhamTrongGio
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  | 
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | css=.bi-cart > path |  | 
    driver.findElement(By.cssSelector(".bi-cart > path")).click();
    // 4 | click | css=.ripple-surface > .fas |  | 
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    // 5 | click | css=.row:nth-child(3) > .d-flex |  | 
    driver.findElement(By.cssSelector(".row:nth-child(3) > .d-flex")).click();
    // 6 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    // 7 | click | css=.ripple-surface > .fas |  | 
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    // 8 | click | css=.ripple-surface > .fas |  | 
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    // 9 | click | css=.ripple-surface > .fas |  | 
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
    // 10 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    // 11 | click | css=.row:nth-child(7) #form1 |  | 
    driver.findElement(By.cssSelector(".row:nth-child(7) #form1")).click();
    // 12 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    // 13 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    // 14 | doubleClick | css=.ripple-surface |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".ripple-surface"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 15 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
    // 16 | click | css=.btn-dark |  | 
    driver.findElement(By.cssSelector(".btn-dark")).click();
    // 17 | click | css=.btn |  | 
    driver.findElement(By.cssSelector(".btn")).click();
  }
}
