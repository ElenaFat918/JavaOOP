package Ex003Math.Mathematics.Shapes;

public class Square extends Shape {
    /// ???...
    
    private double width;
   
/**
 * Статич метод добавляет экземпляры Rectangle: создантся инстанс прямоугольника
 * @param width
 *  @param name
 * @return
 */
    public static Square create (double width,  String name)  {
        // ???...
        var instance = new Square();
        instance.name = name;

        instance.width = width;
        return instance;
    }
/**
 * приватный конструктор
 */
    private Square() {
    }
/**
 * получение площади
 */
    @Override
    public double getArea() {
        return this.width * this.width;
    }
/**
 * печать прямоугольника
 */
    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width);
    }
}