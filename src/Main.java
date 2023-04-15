public class Main {


    public static int fibreku(int n) {
        if (n < 2) {
            return n;
        }
        return fibreku(n - 1) + fibreku(n - 2);
    }

    public static int fibiter(int n) {
        if (n < 2) {
            return n;
        }
        int prevSum = 0;
        int currSum = 1;
        int newSum = 0;
        for (int i = 2; i <= n; i++) {
            newSum = currSum + prevSum;
            prevSum = currSum;
            currSum = newSum;
        }
        return newSum;
    }


    public static void main(String[] args) {
        int number = 100;
        long f = System.nanoTime();
        for (int i = 0; i < number; i++) {
            fibreku(7);
        }
        long fTime = System.nanoTime() - f;
        long it = System.nanoTime();
        for (int i = 0; i < number; i++) {
            fibiter(7);
        }
        long it_time = System.nanoTime()-it;
        System.out.println(" " + fTime / (double) number);
        System.out.println(it_time / (double) number);
    }
}