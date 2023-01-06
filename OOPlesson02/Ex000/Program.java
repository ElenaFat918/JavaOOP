public class Program {
    void A(){ //static работает без вызова  Program prog = new Program();prog.A();
        System.out.println("A()");
    }
    public static void main(String[] args) {
        Program prog = new Program();
        prog.A();
        // Foo f1 = new Foo();//если есть тип Foo и есть экземпляр f1
        // f1.value = 123;//то value для каждого экземпляра свой
        // // System.out.println(f1.value);
        // f1.printCount();//вызываем экземплярный метод обращаясь к статическому полю

        

        // Foo f2 = new Foo();
        // f2.value = 222; //присваевается значение полю экземпляра
        // // System.out.println(f2.value);
        // f2.printCount();

        // Foo f3 = new Foo();
        // f3.value = 444;
        // // System.out.println(f3.value);
        // f3.printCount();
    }
}
