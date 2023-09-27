
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    private static Set<Integer> set = new HashSet<>();

    public static void addSet(int a) {
        set.add(a);
    }

    public static void findElementInSet(int a) {
        if (set.contains(a))
            System.out.println("Элемент " + a + " присутствует");
        else
            System.out.println("Элемент " + a + " отсутствует");
        ;
    }

    public static void removeSet(int a) {
     set.remove(a);
    }

    public static void main(String[] args) {
        //добавление элементов в коллекцию через цикл
        for (int i = 0; i < 10; i++) {
            addSet(i);
        }
        //поиск элемента в коллекции
        findElementInSet(3);//элемент присутствует
        findElementInSet(12);//элемент который отсутствует
        //удаление элемента в коллекции
        removeSet(3);
        removeSet(1);
        removeSet(9);
        System.out.println(set);

    }
}

