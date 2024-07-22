public class StringOperation{
    public static void main(String[] args) {
        String greet = new String(" Good Morning ");

        System.out.println(greet.length());
        System.out.println(greet.trim());
        greet = greet.trim();
        System.out.println(greet.toUpperCase());
        System.out.println(greet.startsWith("Go"));
    }
}
