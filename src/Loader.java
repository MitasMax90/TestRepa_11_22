public class Loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Wolverine wolverine1 = new Wolverine();
        System.out.printf("Вес кошки N1:  %.2f %n", wolverine1.getWeight());
        wolverine1.feed(200.0);
        System.out.printf("Вес кошки N1 после кормёжки:  %.2f %n", wolverine1.getWeight());
        printCat();

        Wolverine wolverine2 = new Wolverine();
        System.out.printf("Вес кошки N2:  %.2f %n", wolverine2.getWeight());
        wolverine1.feed(150.0);
        System.out.printf("Вес кошки N2 после кормёжки:  %.2f %n", wolverine2.getWeight());
        printCat();

        Wolverine wolverine5 = new Wolverine();
        System.out.printf("Вес кошки N5:  %.2f %n", wolverine5.getWeight());
        wolverine1.feed(150.0);
        wolverine5.pee();
        wolverine5.pee();
        System.out.printf("Вес кошки N5 после туалета:  %.2f %n", wolverine5.getWeight());
        wolverine5.woof();
        System.out.printf("Вес кошки N5 после рычания:  %.2f %n", wolverine5.getWeight());

        printCat();

        Wolverine wolverine4 = new Wolverine();


        Wolverine smallWolverine = getSmallCat();
        System.out.printf("Котёнок с весом:  %.2f %n", smallWolverine.getWeight());
        printCat();

        System.out.println("Количество кошек: " + Wolverine.getCatCount());

    }

    private static Wolverine getSmallCat() { return new Wolverine(1100.0); }

    private static void printCat() { System.out.println("=^-.-^="); }

}
