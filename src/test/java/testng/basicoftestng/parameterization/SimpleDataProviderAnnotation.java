package testng.basicoftestng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 public class SimpleDataProviderAnnotation{
     @DataProvider(name = "test-date")
     public Object[][] dataProviderFun(){
         return new Object[][]{
                 {"Selenium","Mumbai"},
                 {"java", "Pune"},
                 {"Python", "Jaipur"}
         };
     }

    @Test(dataProvider = "test-data")
    public void verifyBestInstitude(String Coursename, String Cityname) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("Selenium" + " " + "Mumbai");
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
