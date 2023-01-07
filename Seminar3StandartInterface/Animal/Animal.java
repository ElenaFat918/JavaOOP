public class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя животного: " + name;
    }

    /**
     * Чтобы включить такой метод, нужно наследование от Comparable<Animal>
     * переопределяем compareTo. бегаем по коллекции и сравниваем предидущ с последующ
     */
    @Override
    public int compareTo(Animal o) {
        return this.getName().compareTo(o.getName());//return this.getAge()-(o.getAge()); 
    }
}
/*
 * Comparable - пишу когда вот такой вид сортировки будет однозначно приорететен 
 * и вседа использоваться, задает естественное сравнение, преимущественное и часто используемое
 * Comparator - когда хочу использовать множество разных вариантов сравнения объектов, 
 * на каждое сравнение пишут свой компаратор, задает неестественное сравнение, 
 *  и чуть реже используемое
 */