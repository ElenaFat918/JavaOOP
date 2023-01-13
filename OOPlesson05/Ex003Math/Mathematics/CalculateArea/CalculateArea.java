package Ex003Math.Mathematics.CalculateArea;

import Ex003Math.Mathematics.Shapes.Shape;
/**
 * представитель Calculate, проходит по всем фигурам и считать площадь фигур
 */
public class CalculateArea implements Calculate {

    private static CalculateArea instance;
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * Внутри класса описываем еще один класс RefInt
     */
    private class RefInt {
        public double value;

        public RefInt(double ident) {
            value = ident;
        }
    }
/**
 * считает площадь фигуры
 * @param shape
 * @param ref
 */
    private void calculate(Shape shape, RefInt ref) {
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }

    }
/**
 * проходит по всем фигурам
 */
    public double visit(Shape shape) {
        RefInt area = new RefInt(0);

        calculate(shape, area);

        return area.value;
    }

}
