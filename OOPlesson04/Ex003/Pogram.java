import java.lang.constant.DynamicConstantDesc;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pogram {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer t = Methods.<Integer>getElementFromIntegerCollection(data, 1);
        System.out.println(t);
        // var el = Methods.getElementFromIntegerCollection(data, 1);
        // System.out.println(el);
        // el = Methods.<Integer>getElementFromIntegerCollection(data, 2);
        // el =  Methods.getElementFromIntegerCollection(data, 2);
        // System.out.println(el);

    }
}
