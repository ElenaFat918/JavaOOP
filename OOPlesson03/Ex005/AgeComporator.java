package Ex005;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker>{
    /**
     * описываем что значит один Worker больше другого
     * можно return Integer.compare(o1.salary, o2.salary);
     */
    @Override
    public int compare(Worker o1, Worker o2) { 
        return Integer.compare(o1.age, o2.age);
    }
    
}