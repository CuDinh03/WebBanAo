// Generated by Selenium IDE
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
public class TestRemoveCart01Test {
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
  public void testRemoveCart01() {
    // Test name: TestRemoveCart01
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  | 
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | css=.nav-item:nth-child(2) |  | 
    driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();
    // 4 | click | css=.bi-cart > path |  | 
    driver.findElement(By.cssSelector(".bi-cart > path")).click();
    // 5 | click | name=updateQuantity |  | 
    driver.findElement(By.name("updateQuantity")).click();
    // 6 | click | name=updateQuantity |  | 
    driver.findElement(By.name("updateQuantity")).click();
    // 7 | click | css=.btn-dark |  | 
    driver.findElement(By.cssSelector(".btn-dark")).click();
    // 8 | click | linkText=Huỷ thanh toán quay trở lại trang chủ |  | 
    driver.findElement(By.linkText("Huỷ thanh toán quay trở lại trang chủ")).click();
    // 9 | click | css=.bi-cart |  | 
    driver.findElement(By.cssSelector(".bi-cart")).click();
    // 10 | click | css=.btn-dark |  | 
    driver.findElement(By.cssSelector(".btn-dark")).click();
    // 11 | click | linkText=Huỷ thanh toán quay trở lại trang chủ |  | 
    driver.findElement(By.linkText("Huỷ thanh toán quay trở lại trang chủ")).click();
  }
}
