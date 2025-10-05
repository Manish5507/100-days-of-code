import java.util.LinkedList;

public class linkL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");

        System.out.println(list);

        list.addLast("this is last");
        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"->");
        }
        System.out.println("null");

        list.remove(2);
        System.out.println(list);
    }
}
