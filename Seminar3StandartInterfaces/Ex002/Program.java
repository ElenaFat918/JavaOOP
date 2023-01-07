package Ex002;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Ex002.ExBeverage.*;

public class Program {
    public static void main(String[] args) {

        //#region Intro Iterator
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }
        //#endregion

        //#region Worker Iterator
       
        // Worker worker = new Worker(
        //     "Имя", "Фамилия", 23, 4567); //создали элкземпляр типа Worker

        // Iterator<String> components = worker;
        // //смогли worker напрямую привести к типу итератора, который был имплементирован в классе Worker

        // while (components.hasNext()) {
        //     System.out.println(worker.next());
        // }
       
        //#endregion
       
        //#region Beverage Iterator

        Beverage latte = new Coffee();//создаем напиток типа кофе
        latte.addComponent(new Water("Вода"));//добавляем воду...
        latte.addComponent(new Вeans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));
        
        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {//пробегаемся по всем компонентам напитка
            System.out.println(iterator.next());
        }

        //#endregion
    }
}
