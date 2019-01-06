public class Calculator {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        char sign = '+'; // +, -, *, /, ^, %

        if (sign == '+') {
            int sum = a + b;
            System.out.println(sum);

        } else if (sign == '-') {
            int subtraction = a - b;
            System.out.println(subtraction);
        } else if (sign == '*') {
            int multiplication = a * b;
            System.out.println(multiplication);
        } else if (sign == '%') {
            int remainderOfDivision = a % b;
            System.out.println(remainderOfDivision);
        } else if (sign == '/') {
            int division = a / b;
            System.out.println(division);
        } else if (sign == '^') {
            int degree = 1;
            for (int i = 0; i < b; i++)
                degree = degree * a;
            System.out.println(degree);
        }

    }
}
