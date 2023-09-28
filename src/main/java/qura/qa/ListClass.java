
import java.util.ArrayList;
import java.util.List;

public class ListClass {
    private static List<Integer> list = new ArrayList<>();

    public static void addList(int a) {
        list.add(a);
    }

    public static void findElementInlist(int a) {
        if (list.contains(a))
            System.out.println("Элемент " + a + " присутствует");
        else
            System.out.println("Элемент " + a + " отсутствует");
        ;
    }

    public static void removeList(int a) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).equals(a))
                list.remove(i);
            i++;
        }
    }

    public static void main(String[] args) {
        //добавление элементов через цикл
        for (int i = 0; i < 10; i++) {
            addList(i);
        }
        //поиск элемента в коллекции list
        findElementInlist(1);//элемент присутствует
        findElementInlist(12);//элемент который отсутствует
        //удаление элемента в коллекции
        removeList(3);
        removeList(9);
        removeList(1);
        System.out.println(list);
    }
}

