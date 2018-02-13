package MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);

        Iterator<Integer> iterator = myLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
