public class Cycle {
    public static void main(String[] args) {

        for (int i = 0; i < 21; i++) {
            System.out.println("for = " + i);
        }

        int i = -6;
        while (i <= 6) {
            i = i + 2;
            System.out.println("while = " + i);
        }

        int s = 9;
        do {
            s = s + 2;
            System.out.println("do while = " + s);
        } while (s < 19);

    }
}


