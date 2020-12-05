package com.ofis;
/*
1-driver olusturalim
2-java class'imiza chromedriver.exe'yi tanitalim
3-driver'in tum ekrani kaplamasini saglayalim
4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
  söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
5- google'a gidelim
  arama kutusuna "city bike" yazdıralım
6- Arama sonuclarını ekrana yazdıralım
7- Google ın altındaki alışveriş butonuna tıklayalım.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase02{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/niluf/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);

        System.out.println(driver.findElement(By.id("result-stats")).getText());

        WebElement alisverisLinki=driver.findElement(By.linkText("Alışveriş"));
        alisverisLinki.click();

        driver.close();


    }




}
