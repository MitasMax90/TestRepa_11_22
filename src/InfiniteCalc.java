public class InfiniteCalc {
    int res = 0;

    public int Calc(int operand1, int operand2, char operation) {

        if (operation == 's') {
            return 0;
        } else {

            switch (operation) {

                case '+':
                    res = operand1 + operand2;
                    break;
                case '-':
                    res = operand1 - operand2;
                    break;
                case '*':
                    res = operand1 * operand2;
                    break;
                case '/':
                    res = operand1 / operand2;
                    break;
                case 's':
                    break;
                case 'C':
                    res = 0;
                    break;
                default:
                    break;
            }
            return res;
        }
    }
}
