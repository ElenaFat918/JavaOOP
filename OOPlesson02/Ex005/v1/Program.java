package Lesson_08.Ex005.v1;

import java.util.ArrayList;
import java.util.List;

import Lesson_08.Ex005.v1.Healers.Druid;
import Lesson_08.Ex005.v1.Healers.Healer;
import Lesson_08.Ex005.v1.Healers.Shaman;
import Lesson_08.Ex005.v1.Warriors.Knight;
import Lesson_08.Ex005.v1.Warriors.Paladin;
import Lesson_08.Ex005.v1.Warriors.Warrior;

public class Program {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {// instanceof проверяет : явл ли экземпляр h типом Warrior
            ((Warrior) h).attack(null);//каст к типу Warrior и на нем вызываем метод атаки
        }
        else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);//пропускаем проверку на тип instanceof и выполняем каст к нужному типу

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);


        //#endregion



    }
}
