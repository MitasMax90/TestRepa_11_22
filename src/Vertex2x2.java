/*
Необходимо вывести на консоль такую последовательность чисел:

1 2 4 8 16 32 64 128 256 512
 */

public class Vertex2x2 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 512) {
            System.out.print(a + " ");
            a *= 2;
        }
    }
}
