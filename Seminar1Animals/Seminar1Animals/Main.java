package Seminar1Animals;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.getModel());
        animal.setModel("Млекопитающее");

        Dog dog = new Dog("Млекопитающее", "Бобик");
        dog.getModel();
        dog.setModel("Дворняшка");
        
        dog.voice();
        animal.voice();
        Animal dog1 = new Dog("Дворняшка", "Бобик");
        dog.voice();
    }

}
