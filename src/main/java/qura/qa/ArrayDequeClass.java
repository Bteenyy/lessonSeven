
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeClass {
    private static Queue<Integer> queue = new ArrayDeque<>();

    public static void addQueue(int a) {
        queue.add(a);
    }

    public static void findElementInQueue(int a) {
        if (queue.contains(a))
            System.out.println("Элемент " + a + " присутствует");
        else
            System.out.println("Элемент " + a + " отсутствует");
        ;
    }

    public static void removeQueue(int a) {
        queue.remove(a);
    }

    public static void main(String[] args) {
        //добавление элементов через цикл
        for (int i = 0; i < 10; i++) {
            addQueue(i);
        }
        //поиск элемента в коллекции list
        findElementInQueue(1);//элемент присутствует
        findElementInQueue(12);//элемент который отсутствует
        //удаление элемента в коллекции
        removeQueue(3);
        removeQueue(9);
        removeQueue(1);
        for (int num : queue) {
            System.out.print(num + ", ");
        }
    }
}

