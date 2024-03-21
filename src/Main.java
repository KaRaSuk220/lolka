public class Main {
    public static void main(String[] args) {
        for (
                int j = 1;
                j <= 50;
                j = j + 2
        ) {
            System.out.println("нечетные числа: " + j);
        }
        int a = 10;
        int b = 7;
        int c = -17;

        double d = Math.pow(b, 2) - 4 * a + c;

        if (d < 0) {
            System.out.println("иди в жопу");
        } else if (d == 0) {
            double x = -1 * b / (2 * a);
            System.out.println(x);
        } else if (d>0) {
            double x1 = (-1 * b + Math.sqrt(d) / (2 * a));
            double x2 = (-1 * b - Math.sqrt(d) / (2 * a));
            System.out.println(x1 + ":" + x2);
        }
    }
}