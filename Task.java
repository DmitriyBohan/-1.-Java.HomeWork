import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        do {
            calc(iScanner);
        } while (question(iScanner));

        iScanner.close();
    }

    public static boolean question(Scanner scan) {
        System.out.printf("\nХотите продолжить?\n");
        String answer = scan.nextLine();
        return answer.equalsIgnoreCase("DA");
    }

    public static void calc(Scanner scan) {

        System.out.printf("Итак калькулятор!\nВведите первое число: ");
        float firstNumber = scan.nextFloat();
        System.out.printf("Введите второе число: ");
        float secondNumber = scan.nextFloat();
        System.out.printf("Выберите операцию ( * , / , + , - ) ");
        String operation = scan.next();
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
    }
}
