public class Problem012 {
    public static void main(String[] args) {
        int index = 0;
        int divisors = 0;
        long triangleNum = 0;
        while(divisors <= 500) {
            index++;
            //1 and self
            divisors = 2;
            triangleNum += index;
            for(int x = 2; x< Math.ceil(Math.sqrt(triangleNum)); x++) {
                if(triangleNum%x == 0){
                    divisors+=2;
                }
            }
            if(triangleNum%Math.ceil(Math.sqrt(triangleNum)) == 0) {
                divisors++;
            }
        }
        System.out.println(divisors);
        System.out.println(triangleNum);
    }
}
