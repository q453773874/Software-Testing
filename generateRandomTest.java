import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class generateRandomTest {
    PrintWriter printWriter;
    private  Random rand = new Random();
    boolean isaBiggerb = false;
    boolean isk0 = false;
    boolean isaSmallk = false;

    public void generate(){
        try{
            printWriter = new PrintWriter(new FileOutputStream("src/RandomTestForTwo.java"));
            printWriter.println("import org.junit.Test;");
            printWriter.println("import static org.junit.Assert.assertEquals;");
            printWriter.println("import java.util.ArrayList;");
            printWriter.println("import org.junit.After;");
            printWriter.println("public class RandomTestForTwo {");
            printWriter.println("    private ArrayList<String> result = new ArrayList<>();");

            int count = 0;
            while (! (isaBiggerb && isk0 && isaSmallk)){
                int max = 100;
                int min = -100;
                int k = min + (int)(Math.random() * ((max - min) + 1));
                int a = min + (int)(Math.random() * ((max - min) + 1));;
                int b = min + (int)(Math.random() * ((max - min) + 1));;
                if (a > b){

                    isaBiggerb = true;
                }
                if (k == 0){

                    isk0 = true;
                }
                if (a < k){

                    isaSmallk = true;
                }
                printWriter.printf("    @Test public void R%d()",count);
                printWriter.println("    {");
                printWriter.printf("        int k = %d;\n",k);
                printWriter.printf("        int a = %d;\n",a);
                printWriter.printf("        int b = %d;\n",b);
                printWriter.printf("        int offset = SourceCode2.myFunction(a, b, k);\n" +
                        "        int expected = CorrectCode.myFunction(a, b, k);\n");
                printWriter.println("        result.add(\"a = \" + a + \",b = \" + b + \",k = \" + k + \" Expected: \" + expected + \" Actual: \" + offset);");
                printWriter.printf("        assertEquals(\"B%d\", expected, offset);",count);
                printWriter.println("    }");
                count ++;

            }
            printWriter.println("    @After public void result(){\n" +
                    "        for (String a:result) {\n" +
                    "            System.out.println(a);\n" +
                    "        }\n" +
                    "    }");
            printWriter.println("}");
            printWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
