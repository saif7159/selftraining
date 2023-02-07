public class Driver extends AbstractDemo {
    public static void main(String... args) {

        System.out.println(reverse(543));
    }

    public static int reverse(int value) {
        int reversed = 0;
        while (value > 1) {
            int i = value % 10; // i -> 4
            reversed = reversed * 10 + i; // 30
            value /= 10; // 54
        }
        return reversed;
    }

    @Override
    void demo() {
        // TODO Auto-generated method stub
        String str = "Saif";

    }
}
