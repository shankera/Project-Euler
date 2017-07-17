import java.util.ArrayList;
public class Problem010 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = generate(2000000);
        long sum = 0;
        for(int x = 0; x < primes.size(); x++){
            sum += primes.get(x);
        }
        System.out.println(sum);
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
        for (int x = 2; x < num; x++){
            if (!numbers[x]){
                primes.add(x);
            }
        }
        return primes;
    }
}
