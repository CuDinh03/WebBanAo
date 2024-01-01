package com.example.quanlykho.view;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCartTest {
  private WebDriver driver;

  @BeforeEach
  public void setUp() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/maccuacu/Downloads/chromedriver_mac/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().setSize(new Dimension(1680, 982));
    driver.get("http://localhost:9091/");
    Thread.sleep(5000);
  }


  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testAddToCart01() {
    driver.get("http://localhost:9091/");

    driver.manage().window().setSize(new Dimension(1680, 982));

    driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();

    driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();

    driver.findElement(By.cssSelector("p:nth-child(3)")).click();

    String currentUrl = driver.getCurrentUrl();

    assertEquals("http://localhost:9091/shoppingcart.jsp", currentUrl);

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
  @Test
  public void testAddToCart03() {
    // Test name: TestAddToCart03
    // Step # | name | target | value | comment
    // 1 | open | / |  |
    driver.get("http://localhost:9091/");
    // 2 | setWindowSize | 1680x982 |  |
    driver.manage().window().setSize(new Dimension(1680, 982));
    // 3 | click | css=.nav-item:nth-child(2) |  |
    driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();
    // 4 | click | linkText=Thêm vào giỏ hàng |  |
    driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();
    // 5 | click | linkText=Quay lại shop |  |
    driver.findElement(By.linkText("Quay lại shop")).click();
    // 6 | click | linkText=Thêm vào giỏ hàng |  |
    driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();
    // 7 | click | css=.ripple-surface > .fas |  |
    driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
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
