import java.util.List;
import java.util.Map;

public class Methods {
    // public static Integer getElementFromIntegerCollection(List<Integer> col, int index){
    //     return col.get(index);
    // }
    
    // public static String getElementFromIntegerCollection(List<String> col, int index){
    //     return col.get(index);
    // }

    // public static Double getElementFromIntegerCollection(List<Double> col, int index){
    //     return col.get(index);
    // }
    // #region
    public static <U> U getElementFromIntegerCollection(List<U> col, int index){
        return col.get(index);
    }
    //#endregion

    //#region

    public static <T1, T2> T2 put (T1 arg1, T2 arg2){
        // Map<Integer, String> hm = new HashMap<>();
        // hm.put(arg2, hm);
        return arg2;
    }
    //#endregion
}
