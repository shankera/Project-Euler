class Problem005 {
    public static void main(String[] args) {
        boolean isMultiple = false;
        int increment = 2520;
        int number = 0; //starting at 0 just in case 2520 works for them all
        while(!isMultiple) {
            number += increment;

            // 2520 is divisible by 1-10, and 20. If it's not a multiple of
            // 2520, it won't be divisible by 1-10.
            // Loop from 19-11 to break out of the loop earlier

            for(int x = 19; x > 10; x--) {
                if (number % x != 0) {
                    break;
                } else if (x==11) {
                    isMultiple = true;
                }
            }
        }
        System.out.println(number);
    }
}
