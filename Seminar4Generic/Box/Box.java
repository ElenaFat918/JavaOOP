package Box;

public class Box <T>{
    private T object;

    public Box(T object) {
        this.object = object;
    }
    
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void showType() {
        System.out.println("тип Т: " + this.object.getClass().getName());
    }
}
