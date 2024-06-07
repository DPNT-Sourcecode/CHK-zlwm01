package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        for(char c: skus.toCharArray()) {
            if (c == 'A')
                sum+=50;
            else if (c == 'B')
                sum+=30;
            else if (c == 'C')
                sum+=20;
            else if (c == 'D')
                sum+=15;
            else
                return 0;

        }
        return sum;
    }
}


