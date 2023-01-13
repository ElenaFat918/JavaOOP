package Ex003Math.Mathematics.Exceptions;
/**
 * большая иерархия для работы с математической библтотекой исключений:
 * 
 */
public class MathematicsException extends Exception {
    public MathematicsException(String msg) {
        super(msg);
    }
}
