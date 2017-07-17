public class Problem009 {
    public static void main(String[] args) {
        int big = 1000;
        for(int a = 1; a < big/3; a++) {
            for(int b = big/2-a; b < big/2; b++) {
                int c = big - b - a;
                if (((a*a) + (b*b)) == (c*c)) {
                    System.out.println(a*b*c);
                    System.out.println("a:"+a+" b:"+b+" c:"+c);
                    return;
                }
            }
        }
    }
}
