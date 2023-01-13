package Ex003Math.Mathematics.Shapes;

import java.util.ArrayList;
import java.util.List;
/**
 * Базовая фигура с площадью и именем фигуры
 */
public abstract class Shape {
    protected double area;
    protected String name;
/**
 * получение площади
 * @return
 */
    public double getArea() {
        return area;
    }
/**
 * задание площади, скрытый от пользователя метод
 * @param value
 */
    protected void setArea(double value) {
        area = value;
    }
/**
 * механика задания имени 
 * @param value
 */
    public void setNane(String value) {
        name = value;
    }
/**
 * получение имени
 * @return
 */
    public String getNane() {
        return name;
    }
/**
 * фигура внутри себя может содержать другие фигуры
 */
    public List<Shape> shapes = new ArrayList<Shape>();
/**
 * механика печати
 * @param sb
 * @param indent
 */
    private void Print(StringBuilder sb, String indent) {
        sb.append(String.format("%s %s %s\n", indent, name, getArea()));

        for (Shape shape : shapes)
            shape.Print(sb, indent + "  ");
    }
/**
 * перегрузка метода с рекурсией
 */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Print(sb, "");
        return sb.toString();
    }
}
