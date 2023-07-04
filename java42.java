import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class java42{
    public static LinkedList<Integer> ll(){
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        Random random = new Random();
        int i = 0;
        while (i<10){
            linkedlist.add(random.nextInt(100) +1);
            i = i+1;
        }
        return linkedlist;
    }
    public static void printlist(LinkedList<Integer> linkedlist) {
        System.out.println(linkedlist);
    }
    public static void enqueue(int a, LinkedList<Integer> linkedlist) {
        linkedlist.addLast(a);
    }
    public static Integer dequeue(LinkedList<Integer> linkedlist){
        return linkedlist.pollFirst();
    }
    public static Integer first(LinkedList<Integer> linkedlist) {
        return linkedlist.peekFirst();
    }
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist = ll();
        printlist(linkedlist);
        enqueue(325235, linkedlist);
        System.out.println("Добавили в конец " + linkedlist);
         System.out.println("Вывели первый без удаления " + first(linkedlist) + "\n" + linkedlist);
        System.out.println("Вывели первый с удалением " + dequeue(linkedlist) + "\n" + linkedlist);
    }
}
   