package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
       int sum = 0;
       int i = 0;
       while (i < skus.length()) {
           if(i<=skus.length()-3 && skus.substring(i,i+3).equals("AAA")) {
               sum+=130;
               i+=3;
           }
           else if(i<=skus.length()-2 && skus.substring(i,i+2).equals("BB")) {
               sum+=45;
               i+=2;
           }
           else if(skus.charAt(i) == 'A'){
               sum+=50;
               i+=1;
           }
           else if(skus.charAt(i) == 'B'){
               sum+=30;
               i+=1;
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
       return sum;
    }
}




