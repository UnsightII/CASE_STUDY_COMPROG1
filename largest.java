public class largest{

    static int largest(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        int result = largest(10, 25, 15);
        System.out.println("Largest = " + result);
    }
}