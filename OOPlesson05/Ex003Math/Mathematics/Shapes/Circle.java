package Ex003Math.Mathematics.Shapes;

import Ex003Math.Mathematics.Exceptions.UnacceptableValueException;
/**
 * иерархия фигур. Метод определения окружности
 */
public class Circle extends Shape {
    /**
     * Статич метод добавляет экземпляры Circle: создантся инстанс окр-ти
     * @param radius
     * @param name
     * @return
     * @throws UnacceptableValueException
     */
    public static Circle create(double radius, String name) throws UnacceptableValueException {
        // ???...
        if (radius < 0)
            throw new UnacceptableValueException("radius < 0"); // заглушка тестировщикам

        var instance = new Circle();
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    public double radius;// поле радиус
/**
 * приватный конструктор
 */
    private Circle() {
    }
/**
 * получение радиуса
 * @return
 */
    public double getRadius() {
        return radius;
    }
/**
 * перегрузка получения площади
 */
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    // @Override
    // public String toString() {
    // // ???...
    // return String.format("Name: %s radius: %s", name, radius);
    // }

}
