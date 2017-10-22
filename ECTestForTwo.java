import org.junit.After;
import org.junit.Test;
import java.io.PrintWriter;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ECTestForTwo {
    private ArrayList<String> result = new ArrayList<>();

    @Test
    public void EC1()
    {
        //include a message for better feedback
        int k = 0;
        int a = 1;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC1: k = 0", expected, offset);
    }
    @Test public void EC2()
    {
        //include a message for better feedback
        int k = 2;
        int a = 3;
        int b = 6;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-3-5-7: k <= a <= b", expected, offset);
    }
    @Test public void EC3()
    {
        //include a message for better feedback
        int k = 2;
        int a = 5;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-3-6-7: k<= b < a", expected, offset);
    }



    @Test public void EC4()
    {
        //include a message for better feedback
        int k = 3;
        int a = 7;
        int b = 1;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-3-6-8: b < k <= a", expected, offset);
    }

    @Test public void EC5()
    {
        //include a message for better feedback
        int k = 2;
        int a = 1;
        int b = 4;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-4-5-7: a < k <= b", expected, offset);
    }

    @Test public void EC6()
    {
        //include a message for better feedback
        int k = 9;
        int a = 1;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-4-5-8: a <= b < k", expected, offset);
    }

    @Test public void EC7()
    {
        //include a message for better feedback
        int k = 9;
        int a = 5;
        int b = 1;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("EC2-4-6-8: b < a < k", expected, offset);
    }
    @After
    public void result(){
        for (String a:result) {
            System.out.println(a);
        }
    }
}
