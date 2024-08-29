import javax.naming.directory.AttributeInUseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Создаем список строк
        System.out.println("-----------------1-----------------");
        ArrayList<String> text = new ArrayList<>();// Задание 1
        text.add("Яблоко");
        text.add("Автомат");
        text.add("Бомба");
        text.add("Гигант");
        text.add("Велик");


        Comparator<String> stringComparator = (String word1, String word2) -> word1.compareTo(word2);
        text.sort(stringComparator);

        for (String s : text) {
            System.out.println(s);
        }

        text.add("Яблоко");
        text.add("Автомат");
        text.add("Бомба");
        text.add("Гигант");
        text.add("Велик");

        System.out.println("-----------------2-----------------");
        text.sort((s1, s2) -> s1.compareTo(s2)); // Зпдание 2

        for (String s : text) {
            System.out.println(s);
        }

        System.out.println("-----------------3-----------------");
        MyFunctionalInterface sum = (int num1, int num2) -> num1 + num2; // Задание 3

        System.out.println("Сумма двух чисел равна: " + sum.toSum(10, 10));

        System.out.println("-----------------4-----------------");
        StringUtil stringUtil = new StringUtil();  // Задание 4
        System.out.println(stringUtil.getStringActions().concate("Я про", "граммист"));

        System.out.println("-----------------5-----------------");
        System.out.println(stringUtil.getStringActions().countChars("три")); // Задание 5
        System.out.println(stringUtil.getStringActions().findChar("Айтегин", 'н'));

        System.out.println("-----------------доп задание 1-----------------");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add((int)(1 + Math.random() * 11));
        }
        System.out.println(numbers);

        numbers.sort((a, b) -> (a.compareTo(b)*(-1)));

        System.out.println(numbers);

        System.out.println("-----------------доп задание 2-----------------");
        ArrayList<String> str = new ArrayList<>();

        str.add("Aitegin");
        str.add("Isa");
        str.add("Baha");
        str.add("Omari");
        str.add("Iskender");

        Predicate<String> stringPredicate = n -> n.length() < 5;
        str.removeIf(stringPredicate);
        System.out.println(str);

        System.out.println("-----------------доп задание 3-----------------");
        ArrayList<Double> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++ ) {
            nums.add(Math.random() * 10);
        }

        System.out.println(nums);

        BiFunction<Double, Double, Double> summ = (a, b) -> a + b;

        double result = 0.0;

        for(double num : nums) {
            result = summ.apply(result, num);
        }

        System.out.println("Среднее значение равно: " + result / nums.size());

        System.out.println("-----------------доп задание 4-----------------");

        List<MyClass> classes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            classes.add(new MyClass((int)(Math.random() * 10), Math.random() * 10));
        }
        MyClass maxId = new MyClass(1, Double.MIN_NORMAL);
        Comparator<MyClass> comparator = (a, b) -> Double.compare(a.getId(), b.getId());

        for (MyClass cl : classes) {
            if (comparator.compare(cl, maxId) > 0) {
                maxId.setId(cl.getId());
            }
        }

        System.out.println("Максимальное значение в списке MyClass: " + maxId.getId());

        System.out.println("-----------------доп задание 5-----------------");

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 10; i++ ) {
            list.add((int)(Math.random() * 10));
            }

        System.out.println(list);

        Function<Integer, Integer> multiTwo = n -> 2 * n;

        List<Integer> tempList = new ArrayList<>();

        for (int num : list) {
            tempList.add(multiTwo.apply(num));
        }
        list = tempList;

        System.out.println(list);
    }
}
