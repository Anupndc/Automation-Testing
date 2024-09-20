package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test

    public void testcase1(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.close();

    }

    @Test

    public void testcase2(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng");
        driver.manage().window().maximize();
        driver.close();

    }

}
