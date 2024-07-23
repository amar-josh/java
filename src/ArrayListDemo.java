import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get element
        int element = list.get(0);
        System.out.println(element);

        //Add element in bewteen
        list.add(1,1);
        System.out.println(list);

        //Set element
        list.set(0, 5);
        System.out.println(list);

        //Delete element
        list.remove(3);
        System.out.println(list);
        
        //Count element
        int size = list.size();
        System.out.println("size = " + size);
        
        //Iterate array list
        for (int i = 0; i < size; i++) {
            System.out.println("list = " + list.get(i));
        }

        System.out.println();

        //Sorting Array List
        Collections.sort(list);
        System.out.println(list);
    }
}
