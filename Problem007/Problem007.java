import java.util.ArrayList;

/*  I thought this would be useful, but turns out that this can't even be easily
 *  adapted to use longs. So much for that.
 */
class Problem007 {
    public static void main(String[] args){
        ArrayList<Integer> value = generate(200000000);
        System.out.println(value.get(value.size() - 1));
    }

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
                if (primes.size() == 10001){
                    return primes;
                }
            }
        }
        return primes;
    }
}
