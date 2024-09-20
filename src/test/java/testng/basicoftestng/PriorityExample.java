package testng.basicoftestng;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;
import static java.lang.System.*;

public class PriorityExample {

    @Test(priority = 1)
    public void newTestCase_Z(){

        System.out.println("New Test Case Z");
    }

    @Test(priority = 2)
    public void newTestCase_S(){
        System.out.println("New Test Case S");
    }

    @Test(priority = -3)
    public void newTestCase_F(){
        System.out.println("New Test Case F");
    }

    @Test(priority = 4)
    public void newTestCase_V(){
        System.out.println("New Test Case V");
    }

    @Test(priority = 5)
    public void newTestCase_A(){
        System.out.println("New Test Case A");
    }

    @Test(priority = 6)
    public void newTestCase_E(){
        System.out.println("New Test Case E");
    }

}
