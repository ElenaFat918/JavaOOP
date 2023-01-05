public class Main {
    public static void main(String[] args) {

        Man man = new Man("Артём", "доброжелательный");
        Man man2 = new Man("Денис", "злой");
        Cat cat = new Cat("Пушок");
        man.call(man.getDemeanour(), cat);

        System.out.print("\n");
        man2.call(man2.getDemeanour(), cat);
    }
}
/*
 * Подумать как описать логику взаимодействия человека и домашнего питомца.
 * Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
 * Какое ещё взаимодействие может быть?
 */