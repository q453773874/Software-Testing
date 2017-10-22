import org.junit.After;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class BoundaryTestForTwo{

    private ArrayList<String> result = new ArrayList<>();


    @Test public void B1()
    {
        //include a message for better feedback
        int k = 0;
        int a = 1;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B1: k = 0", expected, offset);
    }
    @Test public void B2()
    {
        //include a message for better feedback
        int k = 2;
        int a = 3;
        int b = 7;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B2: k != 0", expected, offset);
    }
    @Test public void B3()
    {
        //include a message for better feedback
        int k = 2;
        int a = 4;
        int b = 4;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B3: a == b", expected, offset);
    }



    @Test public void B4()
    {
        //include a message for better feedback
        int k = 2;
        int a = 4;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B4: a > b", expected, offset);
    }

    @Test public void B5()
    {
        //include a message for better feedback
        int k = 2;
        int a = 2;
        int b = 3;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B5: k == a", expected, offset);
    }

    @Test public void B6()
    {
        //include a message for better feedback
        int k = 3;
        int a = 2;
        int b = 5;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B6: k > a", expected, offset);
    }

    @Test public void B7()
    {
        //include a message for better feedback
        int k = 2;
        int a = 2;
        int b = 5;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B7: a % k == 0", expected, offset);
    }

    @Test public void B8()
    {
        //include a message for better feedback
        int k = 2;
        int a = 3;
        int b = 5;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B7: a % k != 0", expected, offset);
    }

    @Test public void B9()
    {
        //include a message for better feedback
        int k = 2;
        int a = 3;
        int b = 4;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B7: b % k == 0", expected, offset);
    }

    @Test public void B10()
    {
        //include a message for better feedback
        int k = 2;
        int a = 3;
        int b = 5;
        int offset = SourceCode2.myFunction(a, b, k);
        int expected = CorrectCode.myFunction(a, b, k);
        result.add("a = " + a + ",b = " + b + ",k = " + k + " Expected: " + expected + " Actual: " + offset);
        assertEquals("B7: b % k != 0", expected, offset);
    }

    @After public void result(){
        for (String a:result) {
            System.out.println(a);
        }
    }
}




