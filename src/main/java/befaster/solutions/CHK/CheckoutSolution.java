package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
       int sum = 0;
       int i = 0;
       int countA=0;
       int countB=0;
       int countE=0;
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
           else if(skus.charAt(i) == 'E'){
               sum+=40;
               i+=1;
               countE++;
           }
           else
               return -1;
       }
       int aux2 = (countA-countA/5*5)/3;
       int aux3 = countE/2;
       int aux4 = countB-aux3;
       sum = sum - (countA/5) * 50 - aux2*20 - (aux4/2) * 15 - aux3 * 30;
       if(countE == 2 && countB==0)
           sum+=30;
       return sum;
    }
}

