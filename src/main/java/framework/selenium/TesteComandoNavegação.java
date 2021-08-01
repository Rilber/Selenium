package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandoNavegação {

    static WebDriver driver;

    public static void main(String[] args) {
        navegacao();
    }

    public static void navegacao() {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        driver.navigate().to("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("celular");

        Actions act = new Actions(driver);

        act.sendKeys(Keys.ENTER).build().perform();

        driver.findElement(By.linkText("Shopping")).click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}
