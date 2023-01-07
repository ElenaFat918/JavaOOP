package Ex002;

import java.util.Iterator;

public class Worker implements Iterator<String> {//реализуем (имплементируем)интерфейс итератор
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
        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;//некоторый индекс

    @Override
    public boolean hasNext() {// ЕСЛИ больше 4х полей, то больше не перечисляем
        return index++ < 4;
    }

    @Override
    public String next() {//описываю метод некст
        switch (index) {//проверка если
            case 1:// текущ значение 1, то
                //return firstName;
                return String.format("firstName: %s", firstName);//красивый вывод
            case 2:
                //return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
                //return age;
                return String.format("age: %d", age);
            default:
                //return salary;
                return String.format("salary: %d", salary);

        }
    }
}
