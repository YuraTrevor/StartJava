public class ConditionalStatement{
    public static void main(String[] args) {

        int age = 24;
        if (24 > 20) {
            System.out.println("Ваш возраст больше 20 лет.");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Вы мужского пола.");
        }

        boolean noGirl = false;
        if (noGirl) {
            System.out.println("Данная строчка ничего не выведет в boolean - false");
        }

        boolean myHeight;
        if (1.76 < 1.80) {
            System.out.println("Мой рост меньше 180, выведется первый блок кода. Условие истинно - true ");
        } else {
            System.out.println("176");
        }

        char name = 'Ю';

        if ('Ю' == 'М') {
            System.out.println(" Если М ");
        } else if ('Ю' == 'И') {
            System.out.println("false");
        } else {
            System.out.println("Ю");
        }
    }
}



