import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Add element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set = " + set);

        //Size
        System.out.println(set.size());

        //Contains / Search
        if(set.contains(3)){
            System.out.println("set Contains 3");
        }

        //Remove
        set.remove(3);
        System.out.println("set after remove = " + set);

        //Iteration
        // (Because there is no address of next element store index wise we can't perform for loop on it)
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println("Iteration: " + it.next());
        }
    }
}
