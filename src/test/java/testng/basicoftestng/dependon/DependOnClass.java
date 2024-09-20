package testng.basicoftestng.dependon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnClass {

    @Test(groups = {"smoke"})
    public void  verifyFundTransfer (){
        Assert.assertTrue(false);
        System.out.println("Verify Fund Transfer");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransferWithSaving (){
        System.out.println("Verify Fund Transfer With Saving");
    }

    @Test(enabled = false)  // not run testcase
    public void verifyCashbackOffered (){
        System.out.println("Verify Cashback Offered");
    }
}
