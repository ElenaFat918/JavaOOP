/**
 * InnerFoo
 */
 class Doo extends Foo{
    public void M(){
        Foo.getCount();
    }
}
/**
 * 
 */
public class Foo {
    public Integer value;

    private static Integer count; //публичное статич поле count
    public static Integer getCount(){/*обращаясь к статической переменной нельзя использовать
        this или super, можно только через имя типа*/
        return this.count;
    }
    static{
        count = 0;//статический инициализатор, чтобы не писать в коде = 0
    }
    /**
     * Конструктор который увеличивает значение поля count
     */
    public Foo() {
        count++;
    }
    public void printCount() {
        System.out.println(count);
    }
    /**
     * перегрузка метода для ускорения работы с переменной
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
