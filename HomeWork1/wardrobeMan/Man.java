/**
    * выделяем сущность "Человек": говорим класс Man, для этой сущности определены  поля - name и key
*/
public class Man {
   
    private String name;
    private String key;
    /**
     * конструктор отвечает за инициализацию имени и наличие ключа
     * @param name
     * @param key
     */
    public Man(String name, String key) {
        this.name=name;
        this.key = key;
    }
    /**
     * Метод подбора ключа 
     * @param name
     * @param pos
     * @return
     */ 
    public static Man search (Man name, Wardrobe pos){
        if (name.getKey() == "No" && pos.getPosition() == "Close"){
            name.setKey("Yes");           
        }
        return name;    
    }
    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return "Man [" + name + ", наличие ключа = " + key + "]";
    }
}
