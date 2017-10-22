import java.util.*;
import java.io.*;

public class SourceCode2 {

    /*
    myFunction takes int a, b, k as arguments, it will return how many integers between a and b (inclusive)
    can be divisible by k.

    The time complexity of this function is required to be O(1).

    For example:
        a, b, k = 6, 11, 2gesi
        there will be 3 integers divisible by 2, which are 6, 8, 10.

    */


    public static int myFunction(int a, int b, int k){

        if (a % k == 0 || b % k == 0){
            return (b - a) / k + 1;
        }
        else {
            return (b - a) / k;
        }
    }


}