package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
       int sum = 0;
       int i = 0;
       int countA=0;
       int countB=0;
       while (i < skus.length()) {
           if(skus.charAt(i) == 'A'){
               sum+=50;
               i+=1;
               countA++;
           }
           else if(skus.charAt(i) == 'B'){
               sum+=30;
               i+=1;
               countB++;
           }
           else if(skus.charAt(i) == 'C'){
               sum+=20;
               i+=1;
           }
           else if(skus.charAt(i) == 'D'){
               sum+=15;
               i+=1;
           }
           else
               return -1;
       }
       sum = sum - (countA/3) * 20 - (countB/2) * 15;
       return sum;
    }
}

