package TestNG_Examples;

import org.testng.annotations.*;

public class TestUsingAllAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }

 /*   @BeforeMethod
    public void beforeMethd(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }*/
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @Test(priority=10)
    public void actualTest(){
        System.out.println("This is actual Test/method to be executed");
    }

    @Test
    public void b_actualTest() {
     for(int i=0; i<=10; i++){
         iterationRun();
     }
    }

    public void iterationRun(){
        System.out.println("10 times run");
    }
}
