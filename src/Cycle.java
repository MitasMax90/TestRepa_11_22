public class Cycle {
    public static void main(String[] args) {

        String[] words = {"Кошка", "Собака", "Слон", "Лягушка", "Обезьяна", "Рыба"};
        int word = 0;

        do {
            System.out.print(words[word] + " ");
            word++;
        } while (words[word] != "Слон");
        // Внёс изменения
    }
}
