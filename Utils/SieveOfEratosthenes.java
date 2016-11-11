import java.util.ArrayList;

/*  I thought this would be useful, but turns out that this can't even be easily
 *  adapted to use longs. So much for that.
 */
class SieveOfEratosthenes {
    public static ArrayList<Integer> generate(int num){
        double upperBound = Math.ceil(Math.sqrt((double) num));
        boolean[] numbers = new boolean[num+1];

        for(int n = 2; n <= upperBound; n++){
            if (!numbers[n]) {
                for(int j = (int) Math.pow(n,2); j< num; j+=n){
                    if(!numbers[j]){
                        numbers[j] = true;
                    }
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int x = 2; x <= num; x++){
            if (!numbers[x]){
                primes.add(x);
            }
        }
        return primes;
    }
}
