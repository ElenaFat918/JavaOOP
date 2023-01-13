package Ex003Math.Mathematics.Exceptions;
/**
 *  иерархия для работы с невалидными данными в рамках большой 
 * нами созданной иерерахии MathematicsException
 * 
 */
public class UnacceptableValueException extends MathematicsException {
    public UnacceptableValueException(String msg) {
        super(msg);
    }
}
