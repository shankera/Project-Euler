public class Problem014 {
    public static void main(String[] args) {
        long collatz = 0;
        long total = 0;
        for (long x = 1; x < 1000000; x++) {
            long counter = 1;
            long num = x;
            while (num > 1){
                if (num%2 == 0){
                    num = num/2;
                } else {
                    num = (3*num)+1;
                }
                counter++;
            }
            if (counter > total){
                collatz = x;
                total = counter;
            }
        }
        System.out.println(collatz);
        System.out.println(total);
    }
}
