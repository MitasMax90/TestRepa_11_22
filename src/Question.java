import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        String[] questions = {
                "Как Вас зовут?",
                "Сколько Вам лет?",
                "Изучаете ли Вы Java?",
                "Сколько модулей Вы уже прошли?"
        };

        String[] titles = {
                "Имя",
                "Возраст",
                "Изучает Java",
                "Прогресс в уроках",
//                "Чего-нибудь ещё?"
        };

        String[] answers = new String[questions.length];

        askQuestions(questions, answers);
        printAnswer(titles, answers);
    }

    static void askQuestions(String[] quesions, String[] answers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа - опросник студента, изучающего Java.");
        System.out.println();
        System.out.println("Пожалуйста, ответьте на несколько вопросов.");

        System.out.println("Нажмите энтер когда будете готовы.");
        scanner.nextLine();

        for (int i = 0; i < quesions.length; i++) {
            String quest = quesions[i];
            System.out.println(quest);
            System.out.flush();
            String answer = scanner.nextLine();
            answers[i] = answer;
        }
    }

    static void printAnswer(String[] titles, String[] answers) {
//        if (titles.length != answers.length)
//            return;

        System.out.println();
        System.out.println("Результат опроса: ");
        for (int i = 0; i < answers.length; i++) {
            System.out.printf("%s : %s \n", titles[i], answers[i]);
        }
    }
}

