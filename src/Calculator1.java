import java.util.Scanner;
import java.util.regex.Pattern;


public class Calculator1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Калькулятор готов, ведите выражение:\n введите 'exit' для выхода");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String op = "";
//        String calc = "\\d+([-+*/])\\d+";
//        String calc = "\\d+(\\-|\\+|\\*|\\/)\\d+";       //  Pattern
        do {
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            String[] strings = input.split("\\W");
            String[] operator = input.split("\\w");
            try {
                a = Integer.parseInt(strings[0]);
                b = Integer.parseInt(strings[1]);
                op = operator[operator.length - 1];
            } catch (Exception e) {
                throw new Exception("Строка не является математической операцией");
            }
//            if (!input.matches(calc)) {
//                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
//            }
//            if (operation(a, b, op) == 123456789) {
//                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
//            }5
            if ((a >= 1 && a <= 10) && (b >= 1 && b <= 10) && operator.length <= 2)
                System.out.println("Результат = " + operation(a, b, op));
            else {
                throw new Exception("Некорректное значение. ВВедите значение от 1 до 10");
            }

        } while (true);
    }

    private static int operation(int a, int b, String op) {
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return 123456789;
        }
    }
}