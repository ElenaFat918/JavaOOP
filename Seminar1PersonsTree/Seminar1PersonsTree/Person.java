import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Person> family = new ArrayList<>();//в список можно вложить только объекты Person

    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Person> getFamily(){
        return family;
    }
    @Override
    public String toString() {
        return name;
    }
    /*
     * метод добавляет человека в семью
     */
    public void appendToFamily(Person person){
        if (person != null && person != this){
            family.add(person);
        }
    }
}