/*
Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом,
как на картинке ниже.

* * * * *
* * * * *
* * * * *

 */


public class VertexStar {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Для переноса строки из 5 "*" на новую строку (состоящую из 3-х)
        }
    }
}
