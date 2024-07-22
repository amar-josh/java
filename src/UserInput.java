import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("name = " + name);

        String fullName = sc.nextLine();
        System.out.println("fullName = " + fullName);

    }
}
