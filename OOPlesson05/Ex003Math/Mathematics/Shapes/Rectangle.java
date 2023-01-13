package Ex003Math.Mathematics.Shapes;
/**
 * иерархия фигур. Метод определения прямоугольника с полями ширина и высота
 */
public class Rectangle extends Shape {

    private double width;
    private double height;
/**
 * Статич метод добавляет экземпляры Rectangle: создантся инстанс прямоугольника
 * @param width
 * @param height
 * @param name
 * @return
 */
    public static Rectangle create(double width, double height, String name) {
        // ???...
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }
/**
 * приватный конструктор
 */
    private Rectangle() {
    }
/**
 * получение площади
 */
    @Override
    public double getArea() {
        return this.width * this.height;
    }
/**
 * печать прямоугольника
 */
    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}
