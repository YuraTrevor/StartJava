public class Variable {	
    public static void main(String[] args) {
        short sddEvo = 200;
        byte hdd = 127;
        int videoCard = 1050;
        long sdd = 2000;
        double ram = 16.0;
        float frequency = 3.7f;
        char keyboard = '\u2328';
        boolean compares = sdd > hdd;

        System.out.println("My Disk E:" + hdd);
        System.out.println("My Disk C:" + hdd + " Gigabyte");
        System.out.println("My NVIDIA GeForce GTX:" + videoCard + " ti");
        System.out.println("My Disk D:" + sdd + " Gigabyte");
        System.out.println("My ram:" + ram + " Gigabyte");
        System.out.println("My processor:" + frequency + " GHz");
        System.out.println("My " + keyboard );
        System.out.println(true);
    }
}