package testng.basicoftestng.dependon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodExample {

    @Test
    public void  verifyLogin (){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void createNewUser (){
        System.out.println("Create A New User");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void fundTransfer (){
        System.out.println("Fund Transfer");
    }
}
