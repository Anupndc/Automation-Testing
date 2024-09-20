package testng.basicoftestng;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10)
    public void invocationCountExample(){
        System.out.println("Demo for Invocation");
    }


}
