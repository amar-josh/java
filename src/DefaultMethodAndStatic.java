
    import java.util.ArrayList;
    import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

    @FunctionalInterface
    interface EvenNumberChecker {
        boolean isEven(int n);

        default boolean defaultCheck(int n) {
            return n % 2 == 0;
        }

        static boolean staticCheck(int n) {
            return n % 2 == 0;
        }
    }

    public class DefaultMethodAndStatic {

        public static void main(String[] args) {
            // Create a list of integers
            List<Integer> list = new ArrayList<Integer>();
            list.add(4);
            list.add(8);
            list.add(5);
            list.add(4);
            list.add(6);
            list.add(4);
            list.add(5);

            // Use Stream API to filter even numbers
            List<Integer> evenNumbers = list.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            // Print even numbers using forEach loop
            System.out.println("Even Numbers:");
            evenNumbers.forEach(num -> System.out.println("num = " + num));

            // Find the first even number greater than 5 using Optional
            Optional<Integer> firstEvenGreaterThanFive = evenNumbers.stream()
                    .filter(n -> n > 5)
                    .findFirst();

            // Print the first even number greater than 5
            firstEvenGreaterThanFive.ifPresentOrElse(
                    n -> System.out.println("First even number greater than 5: " + n),
                    () -> System.out.println("No even number greater than 5 found")
            );

            //static and default methods with optional class
            EvenNumberChecker checker = n -> n % 2 == 0;
            System.out.println("Default : " + checker.defaultCheck(4));
            System.out.println("Static: " + EvenNumberChecker.staticCheck(3));
        }
    }


