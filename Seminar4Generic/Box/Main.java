package Box;

public class Main {
    public static void main(String[] args) {
        Box <String> firstBox = new Box("Hi");
        Box <Integer> secondBox = new Box(3);

        // if (firstBox.getObject() instanceof Integer && secondBox.getObject() instanceof Integer) {
        //     int sum = (Integer) firstBox.getObject() + (Integer) secondBox.getObject();
        //     System.out.println(sum);
        // }else{
        //     System.out.println("Типы несовместимы");
        // }
        firstBox.showType();
        System.out.println(firstBox.getObject());

        System.out.println("_____________");

        secondBox.showType();
        System.out.println(secondBox.getObject());

    }
    
}
