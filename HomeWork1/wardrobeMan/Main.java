public class Main {
    public static void main(String[] args) {

        Man man = new Man("Человек", "No"); 
        Wardrobe wardrobe = new Wardrobe("Close");

        System.out.println("Начальное состояние " + man + " " + wardrobe);
        

        if ((man.getKey() == "Yes" || man.getKey() == "No") && wardrobe.getPosition() == "Open") {
            System.out.println("Шкаф открыт");
        } else if (man.getKey() == "Yes" && wardrobe.getPosition() == "Close") {
            Wardrobe.lockOn(man, wardrobe);
            System.out.println(man);
            System.out.println(wardrobe);
        } else if (man.getKey() == "No" && wardrobe.getPosition() == "Close") {
            Man.search(man, wardrobe);
            System.out.println(man);
            System.out.println(wardrobe);
            Wardrobe.lockOn(man, wardrobe);
            System.out.println(wardrobe);

        }
    }
}
/*
 * Описать в ООП стиле логику взаимодействия объектов реального мира между собой: шкаф-человек. 
 * Какие члены должны быть у каждого из классов.
 */

 /*
 * Описываем логику:
 * Создаем человека (экземпляр класса Man с именем и наличием ключа в качестве аргументов конструктора) 
 * Создаем шкаф (экземпляр класса Wardrobe с позицией замка в качестве аргумента конструктора) 
 * Выводим в консоль имя и наличие ключа и позицию замка
 * Проверяем соответствующие параметры и человек открывает шкаф
*/