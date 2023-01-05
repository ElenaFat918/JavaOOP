public class Main {
    public static void main(String[] args) {
        Person first = new Person("Иванов Иван Иванович");
        Person second = new Person("Петров Петр Петрович");
        Person third = new Person("Васильев Василий Васильевич");

        first.appendToFamily(second);
        first.appendToFamily(third);


        // System.out.println(first.getFamily());
        view(first);
    }    
    static void view(Person rootPerson){
        if (rootPerson!= null){
            System.out.println(rootPerson);
            for (Person person: rootPerson.getFamily()){
                view(person);//рекурсия: этот метод будет вызываться для каждого person из family аргумента
            }
        }
    }
}