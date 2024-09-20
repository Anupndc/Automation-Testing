package testng.basicoftestng;

import org.testng.annotations.*;

public class BeforeAfterMethodExample {

    @BeforeClass
    public void  beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void  afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void BeforeMethodDemo(){
        System.out.println("Before Method");
    }

    @Test
    public void nameTest_1(){
        System.out.println("Name Test 1");
    }

    @Test
    public void nameTest_2(){
        System.out.println("Name Test 2");
    }

    @Test
    public void nameTest_3(){
        System.out.println("Name Test 3");
    }

    @AfterMethod
    public void AfterMethodDemo(){
        System.out.println("After Method");
    }

}
