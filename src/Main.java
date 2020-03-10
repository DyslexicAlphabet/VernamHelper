public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int k = 0;
        double seed = 14;
        int configuration = 1;
        int seedIntegerPart;
        int index;
        for (a = 1; a < 100; a++) {
            for (b = 1; b < 100; b++) {
            for (index = 1; index < 47; index++) {
                while (!(isInteger((seed + 100 * k - b) / a))) {
                    k++;
                }
                while (((seed + 100 * k - b) / a) < 0) {
                    seed = seed + 100;
                }
                seed = (seed + 100 * k - b) / a;
                seedIntegerPart = (int) seed;
                k = 0;
                if (index == 46) {
                    System.out.println("Configuration " + configuration + ": " + "a = " + a + ", " + "b = " + b + ", " + "seed = " + seedIntegerPart);
                    configuration++;
                    seed = 14;
                }
            }
        }
    }

}

    public static boolean isInteger(double number) {
        return (number % 1 == 0);
    }
}




