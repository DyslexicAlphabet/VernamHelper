public class Test {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int seed = 22;
        int index;
        for (index = 1; index < 47; index ++) {
            seed = (a*seed + b) % 100;
            if (index == 46) {
                System.out.print(seed);
            }
        }
    }
}
