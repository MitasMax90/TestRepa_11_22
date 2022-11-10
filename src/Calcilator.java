import java.util.Scanner;

public class Calcilator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InfiniteCalc calc = new InfiniteCalc();
        String enterOperation = "Введите операцию +, -, *, / или s для выхода, C для обнуления";
        String answer = "Ответ: ";
        char operation = 0;
        int result = 0;

        System.out.println("Введите 1-й операнд");
        int operand1 = scanner.nextInt();

        while (true) {

            System.out.println(enterOperation);
            operation = scanner.next().charAt(0);
            if (operation == 's') {
                break;
            } else if (operation == 'C') {
                result = 0;
                System.out.println("Введите 1-й операнд");
                operand1 = scanner.nextInt();
            } else {
                System.out.println("Введите 2-й операнд");
                int operand2 = scanner.nextInt();
                if (operation == '/' && operand2 == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else if (result == 0) {
                    result = calc.Calc(operand1, operand2, operation);
                    System.out.println(answer + result);
                } else {
                    result = calc.Calc(result, operand2,operation);
                }
            }
        }
    }
}
