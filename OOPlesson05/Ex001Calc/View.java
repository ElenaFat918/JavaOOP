package Ex001Calc;

import java.util.Scanner;
/**
 * Компонента View, осуществляет работу с терминалом, логика считывания данных и вывода на экран
 */
public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
