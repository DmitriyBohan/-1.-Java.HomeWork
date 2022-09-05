import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Calc(iScanner);
        Question(iScanner);
        iScanner.close();

    }

    public static void Question(Scanner scan) {
        System.out.printf("\nХотите продолжить?\n");
        //String answer = scan.nextLine();
        byte[] b = scan.next().getBytes();
        String answer = new String(b, "UTF-8");
        if (answer.equalsIgnoreCase("DA")) {
            Calc(scan);
        } else {
            System.out.printf("До свидания!");

        }

    }

    public static void Calc(Scanner scan) {

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
        Question(scan);
        System.out.println();
    }
}
