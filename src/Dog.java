public class Dog extends Animal{
    
    private String name;

    public Dog(String model, String name){
        super(model);
        this.name = name;
    }
    public Dog(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void voice(){
        System.out.println(getName()+ " говорит");
    }
}
