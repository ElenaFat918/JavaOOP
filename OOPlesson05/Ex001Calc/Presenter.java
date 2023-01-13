package Ex001Calc;
/**
 * Компонента Presenter, который знает что будет работать с View и Model 
 */
public class Presenter {
    View view;
    Model model;
    /**
     * Конструктор принмает компоненты View и Model и передает их 
     * @param m
     * @param v
     */
    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }
    /**
     * Метод - кнопка запускает процесс: обращение к View 
     * на экране печатается System.out.printf("%s", title)
     * и передается в переменную внутри метода
     * Presenter связывает данные с теми данными кторые нужно положить в Model
     * У Model есть метод получить результат, считается результат и кладется в соотв переменную
     * и этот результат отправляестся во view на печать
     */
    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
