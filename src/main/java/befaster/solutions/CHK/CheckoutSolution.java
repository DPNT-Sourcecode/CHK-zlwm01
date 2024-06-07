package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
       int sum = 0;
       int i = 0;
       int countA=0;
       int countB=0;
       int countE=0;
       int countF=0;
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
           else if(skus.charAt(i) == 'F'){
               sum+=10;
               i+=1;
               countF++;
           }
           else if(skus.charAt(i) == 'G'){
               sum+=20;
               i+=1;
           }
           else if(skus.charAt(i) == 'H'){
               sum+=10;
               i+=1;
           }
           else if(skus.charAt(i) == 'I'){
               sum+=135;
               i+=1;
           }
           else if(skus.charAt(i) == 'K'){
               sum+=60;
               i+=1;
           }
           else if(skus.charAt(i) == 'L'){
               sum+=90;
               i+=1;
           }
           else if(skus.charAt(i) == 'M'){
               sum+=15;
               i+=1;
           }
           else if(skus.charAt(i) == 'N'){
               sum+=40;
               i+=1;
           }
           else if(skus.charAt(i) == 'O'){
               sum+=10;
               i+=1;
           }
           else if(skus.charAt(i) == 'P'){
               sum+=50;
               i+=1;
           }
           else if(skus.charAt(i) == 'Q'){
               sum+=30;
               i+=1;
           }
           else if(skus.charAt(i) == 'R'){
               sum+=50;
               i+=1;
           }
           else if(skus.charAt(i) == 'S'){
               sum+=30;
               i+=1;
           }
           else if(skus.charAt(i) == 'T'){
               sum+=20;
               i+=1;
           }
           else if(skus.charAt(i) == 'U'){
               sum+=40;
               i+=1;
           }
           else if(skus.charAt(i) == 'V'){
               sum+=50;
               i+=1;
           }
           else if(skus.charAt(i) == 'W'){
               sum+=20;
               i+=1;
           }
           else if(skus.charAt(i) == 'X'){
               sum+=90;
               i+=1;
           }
           else if(skus.charAt(i) == 'Y'){
               sum+=10;
               i+=1;
           }
           else if(skus.charAt(i) == 'Z'){
               sum+=50;
               i+=1;
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
       sum = sum - countF/3*10;
       return sum;
    }
}
