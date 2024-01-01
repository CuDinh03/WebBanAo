package com.example.quanlykho.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maccuacu/Downloads/chromedriver_mac/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:9091/LoginServlet");
        Thread.sleep(5000);
    }

    @Test
    public void testLoginSuccessToAdminView() {

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String currentUrl = driver.getCurrentUrl();

        assertEquals("http://localhost:9091/ShowProductsServlet", currentUrl);
    }

    @Test
    public void testLoginSuccessToGuestView() {

        driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String currentUrl = driver.getCurrentUrl();

        assertEquals("http://localhost:9091/BroadServlet", currentUrl);
    }
    @Test
    public void testLoginSuccessToGuestView02() {

        driver.findElement(By.name("username")).sendKeys("n@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String currentUrl = driver.getCurrentUrl();

        assertEquals("http://localhost:9091/LoginServlet", currentUrl);
    }

    @Test
    public void testLoginSuccessToGuestView03() {

        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String currentUrl = driver.getCurrentUrl();

        assertEquals("http://localhost:9091/LoginServlet", currentUrl);
    }
    @Test
    public void testDangKy() throws InterruptedException {
        // Test name: TestDangKy
        // Step # | name | target | value | comment
        // 1 | open | / |  |
        driver.get("http://localhost:9091/");
        // 2 | setWindowSize | 1680x982 |  |
        driver.manage().window().setSize(new Dimension(1680, 982));
        // 3 | click | linkText=Đăng ký |  |
        driver.findElement(By.linkText("Đăng ký")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("form3Example1c")).sendKeys("cu1");
        // 9 | click | id=form3Example3c |  |
        driver.findElement(By.id("form3Example3c")).click();
        // 10 | click | id=form3Example3c |  |
        driver.findElement(By.id("form3Example3c")).click();
        // 11 | doubleClick | id=form3Example3c |  |
        {
            WebElement element = driver.findElement(By.id("form3Example3c"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        // 12 | type | id=form3Example3c | cudinh |
        driver.findElement(By.id("form3Example3c")).sendKeys("cudinh12");
        // 13 | type | id=form3Example4c | 123456 |
        driver.findElement(By.id("form3Example4c")).sendKeys("123456");
        // 14 | click | id=form3Example4cd |  |
        driver.findElement(By.id("form3Example4cd")).click();
        // 15 | type | id=form3Example4cd | 123456 |
        driver.findElement(By.id("form3Example4cd")).sendKeys("123456");
        // 16 | click | css=.btn |  |
        driver.findElement(By.cssSelector(".btn")).click();
        // 17 | type | id=form2Example18 | admin |
        driver.findElement(By.id("form2Example18")).sendKeys("admin");
        // 18 | type | id=form2Example28 | admin |
        driver.findElement(By.id("form2Example28")).sendKeys("admin");
        // 19 | click | id=form2Example18 |  |
        driver.findElement(By.id("form2Example18")).click();
        // 20 | type | id=form2Example18 | cudinh |
        driver.findElement(By.id("form2Example18")).sendKeys("cudinh");
        // 21 | type | id=form2Example28 | 123456 |
        driver.findElement(By.id("form2Example28")).sendKeys("123456");
        // 22 | click | css=.btn |  |
        driver.findElement(By.cssSelector(".btn")).click();
        // 23 | click | css=.nav-item:nth-child(2) |  |
        driver.findElement(By.cssSelector(".nav-item:nth-child(2)")).click();
        // 24 | click | linkText=Thêm vào giỏ hàng |  |
        driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();
        // 25 | click | css=.fa-plus |  |
        driver.findElement(By.cssSelector(".fa-plus")).click();
        // 26 | click | linkText=Quay lại shop |  |
        driver.findElement(By.linkText("Quay lại shop")).click();
        // 27 | click | css=.col-lg-4:nth-child(2) .store-overlay |  |
        driver.findElement(By.cssSelector(".col-lg-4:nth-child(2) .store-overlay")).click();
        // 28 | click | css=.col-lg-4:nth-child(2) .store-overlay |  |
        driver.findElement(By.cssSelector(".col-lg-4:nth-child(2) .store-overlay")).click();
        // 29 | click | linkText=Thêm vào giỏ hàng |  |
        driver.findElement(By.linkText("Thêm vào giỏ hàng")).click();
        // 30 | click | css=.ripple-surface > .fas |  |
        driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
        // 31 | click | css=.ripple-surface > .fas |  |
        driver.findElement(By.cssSelector(".ripple-surface > .fas")).click();
        // 32 | click | css=.btn-dark |  |
        driver.findElement(By.cssSelector(".btn-dark")).click();
        // 33 | click | css=.btn |  |
        driver.findElement(By.cssSelector(".btn")).click();
        // 34 | click | linkText=Logout |  |
        driver.findElement(By.linkText("Logout")).click();
        // 35 | type | id=form2Example18 | cudinh |
        driver.findElement(By.id("form2Example18")).sendKeys("cudinh");
        // 36 | type | id=form2Example28 | 123456 |
        driver.findElement(By.id("form2Example28")).sendKeys("123456");
        // 37 | click | id=form2Example18 |  |
        driver.findElement(By.id("form2Example18")).click();
        // 38 | click | id=form2Example18 |  |
        driver.findElement(By.id("form2Example18")).click();
        // 39 | doubleClick | id=form2Example18 |  |
        {
            WebElement element = driver.findElement(By.id("form2Example18"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        // 40 | type | id=form2Example18 | admin |
        driver.findElement(By.id("form2Example18")).sendKeys("admin");
        // 41 | type | id=form2Example28 | admin |
        driver.findElement(By.id("form2Example28")).sendKeys("admin");
        // 42 | mouseOver | css=.btn |  |
        {
            WebElement element = driver.findElement(By.cssSelector(".btn"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 43 | click | css=.btn |  |
        driver.findElement(By.cssSelector(".btn")).click();
        // 44 | mouseOut | css=.btn |  |
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        // 45 | click | linkText=Tuỳ chọn |  |
        driver.findElement(By.linkText("Tuỳ chọn")).click();
        // 46 | click | linkText=Lịch sử mua |  |
        driver.findElement(By.linkText("Lịch sử mua")).click();
        // 47 | click | css=.border-top:nth-child(21) > .p-2:nth-child(1) |  |
        driver.findElement(By.cssSelector(".border-top:nth-child(21) > .p-2:nth-child(1)")).click();
        // 48 | click | css=.border-top:nth-child(22) span |  |
        driver.findElement(By.cssSelector(".border-top:nth-child(22) span")).click();
        // 49 | click | css=.card |  |
        driver.findElement(By.cssSelector(".card")).click();
    }

}
