public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    public void respond(String name){
        System.out.println("кошка " + name + " подошла и сказала мяу");
    }
    public void respondNot(String name){
        System.out.println("кошка " + name + " убежала");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
