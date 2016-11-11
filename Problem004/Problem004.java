class Problem004 {
    public static void main(String[] args) {
        int num = 0;
        for(int x = 999; x > 99; x--) {
            for(int y = x; y > 99; y--) {
                int multiple = x * y;
                if(isPalindrome(multiple + "") && multiple > num) {
                    num = multiple;
                }
            }
        }
        System.out.println(num);
    }

    private static boolean isPalindrome(String str) {
        for(int x = 0; x < str.length()/2; x++) {
            if (str.charAt(x) != str.charAt(str.length()-1 - x)) {
                return false;
            }
        }
        return true;
    }
}
