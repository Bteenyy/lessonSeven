
import java.util.HashMap;
import java.util.Map;

public class MapClass {
    private static Map<Integer, String> map = new HashMap<>();

    public static void addMap(int a, String b) {
        map.put(a, b);
    }

    public static void findElementInMap(int a) {
        if (map.containsKey(a))
            System.out.println("Ключ " + a + " присутствует");
        else
            System.out.println("Ключ " + a + " отсутствует");
        ;
    }

    public static void removeMap(int a) {
        map.remove(a);
    }

    public static void main(String[] args) {
        //добавление элементов в коллекцию через цикл
        int i = 0;
        while (i < 10) {
            addMap(i, "world");
            i++;
        }
        //поиск элемента в коллекции
        findElementInMap(1);//элемент присутствует
        findElementInMap(12);//элемент который отсутствует
        //удаление элемента в коллекции
        removeMap(3);
        removeMap(1);
        removeMap(9);
        System.out.println(map.entrySet());

    }
}

