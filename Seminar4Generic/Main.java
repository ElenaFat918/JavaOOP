public class Main {
    public static void main(String[] args) {
        Arrays<Integer> integerArrays = new Arrays<>(1,2,3,4,5);// 

        System.out.println("Среднее значение " + integerArrays.avg());

        Arrays<Double> doubleArrays = new Arrays<>(1.0, 2.0, 3.0, 4.0, 5.0);

        System.out.println("Среднее значение " + doubleArrays.avg());

        if (integerArrays.sameAvg(doubleArrays)) {
            System.out.println("Среднее значение одинаково");
        } else {
            System.out.println("Среднее значение разное");
        }
    }

    /*
    MyPage<Cat> pageWithCats = new ...
    внутри List<Cat> catsList
    for (Cat cat : pageWithCats.getCatsList()) {
        cat.getColorCount
    }
     */
}
