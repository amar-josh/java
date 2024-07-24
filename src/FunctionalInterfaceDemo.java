
@FunctionalInterface
interface Summation{
    int sum(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Summation s = (int x, int y) -> x + y;
        int summation = s.sum(10, 20);
        System.out.println("summation = " + summation);
    }
}
