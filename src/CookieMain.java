public class CookieMain {

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.bake();

        int value1 = 10;
        int value2 = 15;
        int result = value1 - value2;
        System.out.println(result);


        Car.build();
        Car newCar = new Car();
        newCar.buy();

//        String str = "String";
//        str = null;
//        printStringLength(str);
//        System.out.println(str);

        printStringLength("Жигаггагжа");
    }

    private static void printStringLength(String str) {
        System.out.println(str.length());
    }
}
