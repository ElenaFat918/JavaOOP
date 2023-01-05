package Seminar1Animals;
import java.io.ObjectInputStream.GetField;

public class Animal {
    private String model;
    private int age;

    public   Animal(String model){
        this.model = model; 
    }
    public Animal(){
    };
    public void voice(){
        System.out.println("Животное говорит");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
/*
 * Абстракция 
 * Инкапсуляция
 */