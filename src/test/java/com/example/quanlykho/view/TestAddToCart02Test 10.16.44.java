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
public class TestAddToCart02Test {
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
  public void testAddToCart02() {
    // Test name: TestAddToCart02
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  | 
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | linkText=Đăng nhập |  | 
    driver.findElement(By.linkText("Đăng nhập")).click();
    // 4 | click | id=form2Example18 |  | 
    driver.findElement(By.id("form2Example18")).click();
    // 5 | type | id=form2Example18 | admin@gmail.com | 
    driver.findElement(By.id("form2Example18")).sendKeys("admin@gmail.com");
    // 6 | click | id=form2Example28 |  | 
    driver.findElement(By.id("form2Example28")).click();
    // 7 | type | id=form2Example28 | admin | 
    driver.findElement(By.id("form2Example28")).sendKeys("admin");
    // 8 | sendKeys | id=form2Example28 | ${KEY_ENTER} | 
    driver.findElement(By.id("form2Example28")).sendKeys(Keys.ENTER);
    // 9 | click | css=.nav-item:nth-child(2) |  | 
    driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();
    // 10 | click | linkText=Thêm vào giỏ hàng |  | 
    driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();
    // 11 | click | css=.ripple-surface |  | 
    driver.findElement(By.cssSelector(".ripple-surface")).click();
  }
}
