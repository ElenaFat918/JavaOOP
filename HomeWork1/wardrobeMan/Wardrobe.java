/**
    * выделяем сущность "Шкаф": говорим класс Wardrobe, для этой сущности определено  поле - position
    */
public class Wardrobe {

        private String position;
        /**
         * конструктор отвечает за инициализацию позиции замка
         * @param position
         */
        public Wardrobe(String position) {
            this.position = position;
        }
          
        /**
         * Метод отпирания замкавозвращает открытый замок
         * @param name
         * @param pos
         * @return
         */
        public static Wardrobe lockOn(Man name, Wardrobe pos) {
            if (name.getKey() == "Yes" && pos.getPosition() == "Close") {
                pos.setPosition("Open");
                System.out.println("Вставляем ключ в замок и ...");
            }
            return pos;
            }
    
        public String getPosition() {
            return position;
        }
    
        public void setPosition(String position) {
            this.position = position;
        }
    
        @Override
        public String toString() {
            return "Wardrobe [Шкаф = " + position + "]";
        }
    
    }