class Problem006 {
    public static void main(String[] args) {
        long sumOfSquares = 0L;
        long squareOfSums = 0L;
        for(long x = 0L; x <= 100L; x++) {
            sumOfSquares += Math.pow(x, 2);
            squareOfSums += x;
        }
        System.out.println(Math.pow(squareOfSums, 2) - sumOfSquares);
    }
}
