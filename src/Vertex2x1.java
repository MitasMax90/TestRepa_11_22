/*
Необходимо, чтоб программа выводила на экран вот такую последовательность:

7 14 21 28 35 42 49 56 63 70 77 84 91 98
 */

public class Vertex2x1 {
    public static void main(String[] args) {
//        for (int i = 7; i <= 98; i+=7) {
//            System.out.print(i + " ");
//        }
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
    }
}
