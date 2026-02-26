public class Largestnum {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 6;

        if (a > b && a > c) {
            System.out.println("largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("largest number is " + b);
        } else {
            System.out.println("largest number is " + c);
        }
    }
}
