public class Testees {
    public static void main(String[] args) {
        int number  = 7;
        number = (number > 10) ? (number -= 10) : (number += 10);

        System.out.println(number);
    }
}
