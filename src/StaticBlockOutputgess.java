public class StaticBlockOutputgess {
    static int a = 20;
    static {
        a++;
    }
    {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        StaticBlockOutputgess obj = new StaticBlockOutputgess();
        StaticBlockOutputgess obj2 = new StaticBlockOutputgess();
        StaticBlockOutputgess obj3 = new StaticBlockOutputgess();
    }
}
