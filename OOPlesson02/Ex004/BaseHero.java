package OOPlesson02.Ex004;

public abstract class BaseHero {
/**
 * Конструктор базовый
 * @param name
 * @param hp
 */
    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }
    /**
     * К-р по умолч, происходит вызов текущ констру-ра с 2мя аргументами
     */
    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}