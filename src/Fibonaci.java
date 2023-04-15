public class Fibonaci {

    public static int fibreku(int n) {
        if (n < 2) {
            return n;
        }
        return fibreku( - 1) + fibreku(n - 2);
    }

    public static int fibiter(int n) {
        if (n < 2) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("rekurencyjnie: " + fibreku(n));
        System.out.println("iteracyjnie: " + fibiter(n));
    }
}