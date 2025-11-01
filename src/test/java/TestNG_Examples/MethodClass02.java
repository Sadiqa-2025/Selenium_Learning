package TestNG_Examples;
import  TestNG_Examples.MethodClass01;
import org.testng.annotations.Test;

import static TestNG_Examples.MethodClass01.indirectMethod;

public class MethodClass02 {

    @Test
    public void directMethod(){
        System.out.println("direct method");
        //call other class method here
        indirectMethod();
        MethodClass01.indirectMethod();   //static methods can be accessed using Class names
        MethodClass01 obj = new MethodClass01();
        obj.indirectNonStatic();           //non static can be accessed using obj of the ns method class
        System.out.println("end of direct method");
    }

    @Test
    static void directMethod02(){
        MethodClass01.indirectMethod();
    }
}
