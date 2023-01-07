public class Fish extends Animal implements Swimable{

    @Override
    public void eat() {
        System.out.println("Рыбка поела");
    }

    @Override
    public void swim() {
        System.out.println("Рыбка поплавала");
        
    }
    
}
