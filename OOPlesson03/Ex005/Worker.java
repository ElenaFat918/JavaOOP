package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }
/**
 * реализация сравнения
 * Можно заменить на return Integer.compare(this.age, o.age); или 
 * return Integer.compare(this.salary, o.age); или
 * описываем отдельный класс как компоненту, упорядочивающую Worker-ов
 * если выкл то удаляем в кл implements Comparable<Worker> и в програм пропишем 
 * db.sort((w1, w2)-> Integer.compare(w1.age, w2.age)); или
 * db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
 */
    // @Override 
    // public int compareTo(Worker o) {
    //     if (this.age > o.age)
    //         return 1;
    //     else if (this.age < o.age)
    //         return -1;
    //     else
    //         return 0;
    // }
}
