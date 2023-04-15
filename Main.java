import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        OurLinkedList list = new OurLinkedList();
        list.add("Мама");
        list.add("Папа");

        list.add(1, "Бабушка");
        list.add(1, "Дедушка");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}