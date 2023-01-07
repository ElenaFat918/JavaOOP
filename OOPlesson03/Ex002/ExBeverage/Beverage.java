package Ex002.ExBeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * создаем условный тип напиток, абстрактый и импле-ет Iterator с закрытым обобщением Ingredient*/
 public abstract class Beverage implements Iterator<Ingredient> { 
    List<Ingredient> components; //коллекция
    int index;
    /**
     * Конструктор с начальной настройкой
     */
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }
/**
 * Метод добавления
 * @param component
 */
    public void addComponent(Ingredient component){
        components.add(component);
    }

    @Override
    public boolean hasNext() {//реализация методов итератора
        return index < components.size();
    }
    
    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
