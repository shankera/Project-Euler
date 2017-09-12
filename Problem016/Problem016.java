import java.math.BigInteger;

public class Problem016 {
    public static void main(String[] args) throws Exception {
        String big = BigInteger.valueOf(2)
            .pow(1000)
            .toString();
        int sum = 0;
        System.out.println(big.length());
        for(int x = 0; x < big.length(); x++){

            System.out.println(big.charAt(x));
            System.out.println(sum);
            sum += Character.getNumericValue(big.charAt(x));
        }
        System.out.println(sum);
    }
}
