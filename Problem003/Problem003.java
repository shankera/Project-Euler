
import java.util.ArrayList;

class Problem003 {
    public static void main(String[] args){
        long number = 600851475143L;
        boolean noSolution = true;
        for(long x = 2; x < number; x++){
            while (number % x == 0) {
                number /= x;
            }
        }
        System.out.print(number);
    }
}
