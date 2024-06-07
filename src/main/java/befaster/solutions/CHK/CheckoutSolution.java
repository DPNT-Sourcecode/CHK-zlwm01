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
       int H=0, K=0, N=0, P=0, Q=0, R=0, U=0, V = 0, M=0, S=0, T=0, X=0, Y=0, Z=0;
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
               H++;
           }
           else if(skus.charAt(i) == 'I'){
               sum+= 35;
               i+=1;
           }
           else if(skus.charAt(i) == 'J'){
               sum+= 60;
               i+=1;
           }
           else if(skus.charAt(i) == 'K'){
               sum+=70;
               i+=1;
               K++;
           }
           else if(skus.charAt(i) == 'L'){
               sum+=90;
               i+=1;
           }
           else if(skus.charAt(i) == 'M'){
               sum+=15;
               i+=1;
               M++;
           }
           else if(skus.charAt(i) == 'N'){
               sum+=40;
               i+=1;
               N++;
           }
           else if(skus.charAt(i) == 'O'){
               sum+=10;
               i+=1;
           }
           else if(skus.charAt(i) == 'P'){
               sum+=50;
               i+=1;
               P++;
           }
           else if(skus.charAt(i) == 'Q'){
               sum+=30;
               i+=1;
               Q++;
           }
           else if(skus.charAt(i) == 'R'){
               sum+=50;
               i+=1;
               R++;
           }
           else if(skus.charAt(i) == 'S'){
               sum+=20;
               i+=1;
               S++;
           }
           else if(skus.charAt(i) == 'T'){
               sum+=20;
               i+=1;
               T++;
           }
           else if(skus.charAt(i) == 'U'){
               sum+=40;
               i+=1;
               U++;
           }
           else if(skus.charAt(i) == 'V'){
               sum+=50;
               i+=1;
               V++;
           }
           else if(skus.charAt(i) == 'W'){
               sum+=20;
               i+=1;
           }
           else if(skus.charAt(i) == 'X'){
               sum+=17;
               i+=1;
               X++;
           }
           else if(skus.charAt(i) == 'Y'){
               sum+=20;
               i+=1;
               Y++;
           }
           else if(skus.charAt(i) == 'Z'){
               sum+=21;
               i+=1;
               Z++;
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


        int aux5 = (H-H/10*10)/5;
        sum = sum - (H/10) * 20 - aux5*5 - K/2*20 ;

        if(N/3<=M)
            sum = sum - N/3*15;
        else
            sum = sum - M*15;

        if(R/3<=Q){
            sum = sum - R/3*30;
            Q = Q-R/3;}
        else{
            sum = sum - Q*30;
            Q = 0;}
        sum = sum - P/5*50 - Q/3*10 - U/4*40;

        int aux6 = (V-V/3*3)/2;
        sum = sum - (V/3) * 20 - aux6*10;

        sum = sum - (S+T+X+Y+Z)/3 *15;
        return sum;
    }
}



