public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 80);
        Person vasya = new Person("Вася", 60);
        Person marina = new Person("Марина", 55);
        Person masha = new Person("Маша", 36);
        Person jane = new Person("Женя", 35);
        Person ivan = new Person("Ваня", 40);
        Person ruslan = new Person("Руслан", 6);
        Person timur = new Person("Тимур", 3);
        Person elena = new Person("Елена", 37);
        Person denis = new Person("Денис", 37);

        GeoTree gt = new GeoTree();
        gt.appendParentChildShip(irina, vasya);
        gt.appendParentChildShip(irina, masha);
        gt.appendParentChildShip(vasya, jane);
        gt.appendParentChildShip(vasya, ivan);
        gt.appendParentChildShip(marina, jane);
        gt.appendParentChildShip(marina, ivan);
        gt.appendParentChildShip(elena, ruslan);
        gt.appendParentChildShip(elena, timur);
        gt.appendParentChildShip(denis, ruslan);
        gt.appendParentChildShip(denis, timur);
        gt.appendWifeHusbandShip(marina, vasya);
        gt.appendWifeHusbandShip(elena, denis);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent)); 
        System.out.println("Родители Руслана: " + new Reserch(gt).spend(ruslan,
        Relationship.children));
        System.out.println("Родители Жени: " + new Reserch(gt).spend(jane,
        Relationship.children));
        System.out.println(new Reserch(gt).searchAge());
        System.out.println("Жена Дениса: " + new Reserch(gt).spend(denis, Relationship.husband));
    
    }

}
/*
 * Описываем логику:
 * Создаем несколько человек (экземпляров класса Person с именем в качестве аргумента конструктора) 
 * Создали новое древо gt
 * Добавили в это древо gt этих людей и отношения
 * Создаём новый экземпляр исследований объекта gt и выводим всех детей человека с именем Ирина
 * Создаём новый экземпляр исследований объекта gt и выводим родителей человека с именем Руслан
 * Создаём новый экземпляр исследований объекта gt и выводим родителей человека с именем Женя
 * Создаём новый экземпляр исследований объекта gt и выводим всех людей выбранного возраста
 * Создаём новый экземпляр исследований объекта gt и выводим ену человека с именем Денис
*/

/*
 * Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом. 
Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей 
и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, 
сестра и т. д. компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод 
данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека 
Под “проведением исследования” можно понимать получение всех детей выбранного человека.
 */