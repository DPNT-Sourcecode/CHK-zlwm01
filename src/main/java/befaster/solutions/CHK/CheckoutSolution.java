package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        int ok=0;
        int cont1 =0;
        int cont2 =0;
        char aux;
        for(char c: skus.toCharArray()) {
            ok++;
            if (c == 'A')
                sum+=50;
            else if (c == 'B')
                sum+=30;
            else if (c == 'C')
                sum+=20;
            else if (c == 'D')
                sum+=15;
            else
                return -1;

             aux = c;

            if(ok>1)
                if(aux == 'A'){
                    cont1+=1;
                    cont2 = 0;}
                else if (aux == 'B'){
                    cont2+=1;
                    cont1 = 0;}
            if(cont1 ==3){
                sum-=20;
                cont1 = 0;}
            if(cont2 ==2){
                sum-=15;
                cont2 = 0;}
        }
        return sum;
    }
}

