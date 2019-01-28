public class MyFirstGame {

    public static void main(String[] args) {

        int guess = 10;    //Которое нужно угадать число.
        int user = 20; // Пользователь ввел число 20.

        while (true) {
            if (user == guess) {
                break;
            } else if (user > guess) {
                System.out.println("Введенное вами число больше того, что загадал компьютер ");
                user--;
            } else if (user < guess) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер ");
                user++;
            }

        }
    }
}
