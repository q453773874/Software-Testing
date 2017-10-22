public class CorrectCode {


    public static int myFunction(int a, int b, int k){

        //need to consider when a > b

        if (a > b){
            return -1;
        }

        if (k > b){
            return -1;
        }


        // need to consider when k is equal to 0
        if (k == 0){
            return -1;
        }

        //we should also consider the whether a is small than k
        if(a >= k){
            if (a % k == 0 || b % k == 0){
                return (b - a) / k + 1;
            }
            else {
                return (b - a) / k;
            }
         }
         else{
            return (b - a) / k + 1;
         }
    }

}
