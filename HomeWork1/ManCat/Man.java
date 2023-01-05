public class Man {
    private String name;
    private String demeanour;

    public Man(String name, String demeanour) {
        this.name = name;
        this.demeanour = demeanour;
    }
    // метод когда человек зовет кошку
    public void voice(String name, Cat cat) {
        System.out.println(name + " зовет кошку: " + cat.getName() + " кс-кс-кс");
    }
    // человек зовет кошку
    public void call(String demeanour, Cat cat) {
        if (demeanour == "доброжелательный") {
           
            voice(name, cat);
            cat.respond(cat.getName()); // кошка приходит
        } else {
            // если человек не хозяин кошки
            voice(name, cat);
            cat.respondNot(cat.getName()); // кошка не приходит
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDemeanour() {
        return demeanour;
    }
    public void setDemeanour(String demeanour) {
        this.demeanour = demeanour;
    }
}
