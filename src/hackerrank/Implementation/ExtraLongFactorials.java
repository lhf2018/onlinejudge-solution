package hackerrank.Implementation;

import java.math.*;

public class ExtraLongFactorials {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger b=BigInteger.valueOf(1);
        for(int i=n;i>=1;i--){
            b=b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b);
    }
}
