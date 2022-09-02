import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Calc();
    }

    public static void Question() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Хотите продолжить? ");
        String answer = iScanner.nextLine();
        // iScanner.close();
        switch (answer) {
            case "da":
                Calc();
            case "Da":
                Calc();
            case "dA":
                Calc();
            case "DA":
                Calc();

            default:
                System.out.printf("Ну и ладно!");
                break;
        }
        // switch (answer) {
        // case "Да":
        // Calc();
        // case "дА":
        // Calc();
        // case "ДА":
        // Calc();
        // case "да":
        // Calc();
        //
        // default:
        // System.out.printf("Ну и ладно!");
        // break;
        // }
        // if ( answer == "Да"|| answer == "дА" || answer == "ДА" || answer == "да")
        // return 1;

        // else
        // return 0;
    }

    public static void Calc() {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Итак калькулятор!\nВведите первое число: ");
        float firstNumber = iScanner.nextFloat();
        System.out.printf("Введите второе число: ");
        float secondNumber = iScanner.nextFloat();
        System.out.printf("Выберите операцию ( * , / , + , - ) ");
        String operation = iScanner.next();
        switch (operation) {
            case "+":
                System.out.printf("Результат = %s", firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("Результат = %s", firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("Результат = %s", firstNumber * secondNumber);
                break;
            case "/":
                System.out.printf("Результат = %s", firstNumber / secondNumber);
                break;
            default:
                System.out.printf("Вы ввели фигню");
        }
        System.out.println();
        Question();
    }
}
