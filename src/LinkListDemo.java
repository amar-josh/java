import java.util.Collections;
import java.util.LinkedList;
public class LinkListDemo {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("blue");
        list.addFirst("black");
        list.addFirst("white");
        list.addLast("gold");
        list.add("red");

        System.out.println("list = " + list);

        System.out.println(list.size());

        //Iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        //Remove
        list.remove(2);
        System.out.println("list  Remove= " + list);

        //Reverse the linedList
        Collections.reverse(list);
        System.out.println("list reverse= " + list);
        
        //Sort
        Collections.sort(list);
        System.out.println("list Sort = " + list);

    }
}
