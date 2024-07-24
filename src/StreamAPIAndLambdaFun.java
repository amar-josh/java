import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Predicate;

@FunctionalInterface
interface FunctionalInterfaceExecute<T> {
    void execute(T t);
}

 class StreamAPIAndLambdaFun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(4);
        list.add(5);
        //Stream API with lambda function
        List<Integer> newList = list.stream().filter(number ->number > 2).collect(Collectors.toList());
        System.out.println("newList = " + newList);


        // Use Stream API with custom functional interface
        List<Integer> filterlist = newList.stream()
                .filter(new NameFilterPredicate()).collect(Collectors.toList());
        System.out.println("filterlist = " + filterlist);

        //Lambda function with functional interface
        FunctionalInterfaceExecute<Integer> numberPrint = number -> System.out.println("Number " + number);
        numberPrint.execute(list.get(3));

    }

     // Custom Predicate implementation
     static class NameFilterPredicate implements Predicate<Number> {
         @Override
         public boolean test(Number num) {
             return num.equals(4);
         }
     }

}
