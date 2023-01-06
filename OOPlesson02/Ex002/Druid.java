package OOPlesson02.Ex002

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
                Magician.r.nextInt(100, 200));
        this.maxHarmony = Magician.r.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int heal = BaseHero.r.nextInt(10, 20);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }
    @Override // при создании абстрактного класса в program данный метод там же абстрактный  - 
    //возникает ошибка в остальных классах
    //The type Druid must implement the inherited abstract method BaseHero.die()Java(67109264)
    //выбираем быстрое исправление add implemented method
    public void die() {//пишем метод для этого класса        
    }
}