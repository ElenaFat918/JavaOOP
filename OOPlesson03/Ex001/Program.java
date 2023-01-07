package Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); //создаем коллекцию чисел
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);
        /*
         * испол-ем итератор:  на экземпляре коллекции nums
         * обращаемся к методу iterator и приводим к типу Integer  
         */

        Iterator<Integer> iter = nums.iterator();

        while (iter.hasNext()) {//ипользуя цикл while и методы итератора hasNext и next
            System.out.println(iter.next());
        }

        Worker worker = new Worker( //созд экземпляр типа Worker
            "Имя", "Фамилия", 23, 4567);

        // Iterator<Object> components = worker.iterator();//не полусится обратиться к итератору, тк итератор не реализован

        
    }
}
