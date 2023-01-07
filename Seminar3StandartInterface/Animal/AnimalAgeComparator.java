import java.util.Comparator;
/**
 * Класс импл-щий Comparator с типом Animal, для сортировки объектов класса Animal
 */
public class AnimalAgeComparator implements Comparator<Animal> {
    /**
         * Метод compare возвращает целочисленные значения 
         * и принимает два объекта типа Animal)
         * Если в каком-то плане o1<o2  - return отрицат число,
         * если o1>o2 - return + число, иначе return 0
     */
   @Override
   public int compare(Animal o1, Animal o2) {
       return o1.getAge() - o2.getAge();
   }
}
