package com.example.quanlykho.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class ProductFormTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maccuacu/Downloads/chromedriver_mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1680, 982));
        driver.get("http://localhost:9091/ShowProductsServlet");
        Thread.sleep(5000);
    }

    @Test
    public void testProductFormFields() {
        driver.findElement(By.id("addBtn")).click();

        WebElement productCodeField = driver.findElement(By.name("prCode"));
        assertNotNull(productCodeField);
        assertTrue(productCodeField.getAttribute("required") != null);

        WebElement productNameField = driver.findElement(By.name("prName"));
        assertNotNull(productNameField);
        assertTrue(productNameField.getAttribute("required") != null);

        WebElement productPriceField = driver.findElement(By.name("prPrice"));
        assertNotNull(productPriceField);
        assertTrue(productPriceField.getAttribute("required") != null);

        WebElement productQuantityField = driver.findElement(By.name("prQuantity"));
        assertNotNull(productQuantityField);
        assertTrue(productQuantityField.getAttribute("required") != null);

        WebElement productImgField = driver.findElement(By.name("prImg"));
        assertNotNull(productImgField);

        WebElement productDateInputField = driver.findElement(By.name("prDateInput"));
        assertNotNull(productDateInputField);
        assertTrue(productDateInputField.getAttribute("required") != null);

        WebElement productDetailField = driver.findElement(By.name("prDetail"));
        assertNotNull(productDetailField);
        assertTrue(productDetailField.getAttribute("required") != null);

    }
    @Test
    public void testAddProduct() throws InterruptedException {
        driver.findElement(By.id("addBtn")).click();

        WebElement productCodeField = driver.findElement(By.name("prCode"));
        Thread.sleep(2000);

        assertNotNull(productCodeField);
        Thread.sleep(2000);

        productCodeField.sendKeys("ABC123");
        Thread.sleep(2000);


        WebElement productNameField = driver.findElement(By.name("prName"));        Thread.sleep(2000);

        assertNotNull(productNameField);        Thread.sleep(2000);

        productNameField.sendKeys("Product Name");        Thread.sleep(2000);


        WebElement productPriceField = driver.findElement(By.name("prPrice"));        Thread.sleep(2000);

        assertNotNull(productPriceField);        Thread.sleep(2000);

        productPriceField.sendKeys("1000");        Thread.sleep(2000);


        WebElement productQuantityField = driver.findElement(By.name("prQuantity"));        Thread.sleep(2000);

        assertNotNull(productQuantityField);        Thread.sleep(2000);

        productQuantityField.sendKeys("10");        Thread.sleep(2000);


        WebElement productImgField = driver.findElement(By.name("prImg"));        Thread.sleep(2000);

        assertNotNull(productImgField);        Thread.sleep(2000);

        productImgField.sendKeys("example.jpg");        Thread.sleep(2000);


        WebElement productDateInputField = driver.findElement(By.name("prDateInput"));        Thread.sleep(2000);

        assertNotNull(productDateInputField);        Thread.sleep(2000);

        productDateInputField.sendKeys("30");        Thread.sleep(2000);

        productDateInputField.sendKeys("11");        Thread.sleep(2000);

        productDateInputField.sendKeys("2023");        Thread.sleep(2000);


        WebElement productDetailField = driver.findElement(By.name("prDetail"));        Thread.sleep(2000);

        assertNotNull(productDetailField);        Thread.sleep(2000);

        productDetailField.sendKeys("Sample product details");        Thread.sleep(2000);


        WebElement addProductButton = driver.findElement(By.id("addProductBtn"));        Thread.sleep(2000);

        assertNotNull(addProductButton);        Thread.sleep(2000);

        addProductButton.click();        Thread.sleep(2000);


    }
    @Test
    public void testDeleteProduct() throws InterruptedException {
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Xoá')]"));
        Thread.sleep(2000);

        assertNotNull(deleteButton);
        Thread.sleep(2000);

        deleteButton.click();        Thread.sleep(2000);


        WebElement confirmDeleteButton = driver.findElement(By.xpath("//div[@class='modal-footer']/a[contains(text(),'Xoá')]"));        Thread.sleep(2000);

        assertNotNull(confirmDeleteButton);        Thread.sleep(2000);

        confirmDeleteButton.click();        Thread.sleep(2000);


    }
    @Test
    public void testAddProduct02() throws InterruptedException {


        driver.findElement(By.linkText("Thêm mới")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prCode")).sendKeys("test01");        Thread.sleep(2000);

        driver.findElement(By.name("prName")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prName")).sendKeys("test01");        Thread.sleep(2000);

        driver.findElement(By.name("prPrice")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prPrice")).sendKeys("99999");        Thread.sleep(2000);

        driver.findElement(By.name("prQuantity")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prQuantity")).sendKeys("100");        Thread.sleep(2000);

        driver.findElement(By.name("prImg")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prImg")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prImg")).sendKeys("https://cdn.tgdd.vn/2021/01/content/bo%CC%80vai-800x500.jpg");        Thread.sleep(2000);

        driver.findElement(By.name("prDateInput")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prDateInput")).sendKeys("18");        Thread.sleep(2000);

        driver.findElement(By.name("prDateInput")).sendKeys("11");        Thread.sleep(2000);

        driver.findElement(By.name("prDateInput")).sendKeys("2023");        Thread.sleep(2000);

        driver.findElement(By.name("prDetail")).click();        Thread.sleep(2000);

        driver.findElement(By.name("prDetail")).sendKeys("test01");        Thread.sleep(2000);

        driver.findElement(By.id("addProductBtn")).click();        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".alert span")).click();        Thread.sleep(2000);

    }

    @Test
    public void testCreateProduct02() {

        driver.manage().window().setSize(new Dimension(1680, 982));
        driver.findElement(By.linkText("Thêm mới")).click();
        driver.findElement(By.name("prCode")).click();
        driver.findElement(By.name("prCode")).sendKeys("TPTS05");
        driver.findElement(By.name("prName")).click();
        driver.findElement(By.name("prName")).sendKeys("cà ");
        driver.findElement(By.name("prPrice")).click();
        driver.findElement(By.name("prPrice")).sendKeys("4000");
        driver.findElement(By.cssSelector(".text-dark:nth-child(9)")).click();
        driver.findElement(By.name("prQuantity")).click();
        driver.findElement(By.name("prQuantity")).sendKeys("100");
        driver.findElement(By.name("prImg")).click();
        driver.findElement(By.name("prImg")).sendKeys("https://vinmec-prod.s3.amazonaws.com/images/20190606_120002_041483_ca-rot.max-800x800.png");
        driver.findElement(By.cssSelector("#createModal .modal-body")).click();
        driver.findElement(By.name("prDateInput")).click();
        driver.findElement(By.name("prDateInput")).sendKeys("2023-11-03");
        driver.findElement(By.name("prDetail")).click();
        driver.findElement(By.name("prDetail")).sendKeys("h");
        driver.findElement(By.id("addProductBtn")).click();
        driver.findElement(By.cssSelector(".alert span")).click();
    }


    @Test
    public void testDeleteProduct02() {

        driver.get("http://localhost:9091/ShowProductsServlet");
        driver.manage().window().setSize(new Dimension(1680, 982));
        driver.findElement(By.cssSelector(".odd:nth-child(1) > td > .btn-danger")).click();
        driver.findElement(By.linkText("Xoá")).click();

    }
    @Test
    public void testCreateProduct04() {

        driver.get("http://localhost:9091/ShowProductsServlet");
        driver.manage().window().setSize(new Dimension(1680, 982));
        driver.findElement(By.linkText("Thêm mới")).click();
        driver.findElement(By.id("addProductBtn")).click();
        {
            WebElement element = driver.findElement(By.id("addProductBtn"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".alert span")).click();
    }

    @Test
    public void testUpdatePR02() {

        driver.findElement(By.linkText("Edit")).click();

        driver.findElement(By.name("prImg")).click();
        driver.findElement(By.name("prImg")).click();
        driver.findElement(By.name("prImg")).click();
        {
            WebElement element = driver.findElement(By.name("prImg"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("prImg")).click();
        driver.findElement(By.name("prImg")).click();
        driver.findElement(By.name("prImg")).sendKeys("https://vinmec-prod.s3.amazonaws.com/images/20190606_120002_041483_ca-rot.max-800x800.png");
        driver.findElement(By.name("prDateInput")).click();
        driver.findElement(By.name("prDateInput")).sendKeys("2023-03-09");
        driver.findElement(By.name("prDetail")).click();
        driver.findElement(By.name("prDetail")).click();
        driver.findElement(By.name("prDetail")).sendKeys("restock");
        driver.findElement(By.cssSelector(".sticky-footer")).click();
        driver.findElement(By.id("editProductBtn")).click();
    }
    @Test
    public void testSpXeptheoGiaTien() {

        driver.findElement(By.cssSelector(".sorting:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".sorting_asc")).click();
        driver.findElement(By.cssSelector(".sorting_desc")).click();
        driver.findElement(By.cssSelector(".sorting_asc")).click();

    }
    @Test
    public void testSapXeptheoMA() throws InterruptedException {

        driver.findElement(By.cssSelector(".sorting_asc")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".sorting_desc")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".sorting_asc")).click();
        driver.findElement(By.cssSelector(".sorting_desc")).click();
    }
    @Test
    public void addProduct() throws InterruptedException {

        driver.findElement(By.id("addBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prCode")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prCode")).sendKeys("TPTS00989");
        Thread.sleep(2000);
        driver.findElement(By.name("prName")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prName")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prName")).sendKeys("aos8");
        Thread.sleep(2000);
        driver.findElement(By.name("prPrice")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prPrice")).sendKeys("4000");
        Thread.sleep(2000);
        driver.findElement(By.name("prQuantity")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prQuantity")).sendKeys("100");
        Thread.sleep(2000);
        driver.findElement(By.name("prImg")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prImg")).sendKeys("https://vinmec-prod.s3.amazonaws.com/images/20190606_120002_041483_ca-rot.max-800x800.png");
        Thread.sleep(1000);
        driver.findElement(By.name("prDateInput")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("prDateInput")).sendKeys("02");
        Thread.sleep(1000);
        driver.findElement(By.name("prDateInput")).sendKeys("02");
        Thread.sleep(1000);
        driver.findElement(By.name("prDateInput")).sendKeys("2020");
        Thread.sleep(1000);
        driver.findElement(By.name("prDetail")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("prDetail")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.id("addProductBtn")).click();
        {
            WebElement element = driver.findElement(By.id("addProductBtn"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
            Thread.sleep(1000);

        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
            Thread.sleep(1000);

        }
        driver.findElement(By.linkText("×")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Sản phẩm")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("2")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".card-body")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".odd:nth-child(3) > td:nth-child(3)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".col-md-5")).click();
        Thread.sleep(1000);

    }

}


