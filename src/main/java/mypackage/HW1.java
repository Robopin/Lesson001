package mypackage;

public class HW1 {
    public static void main(String[] args) {
        int a = 1;
        char b;
        double c;
        boolean d = true;
        byte i;
        short f;
        long g;
        float h = 11.11F;
        b = 12342;
        c = 17.171;
        i = 121;
        f = 32767;
        g = 111111111;


        System.out.println(findResult(2, 3, 4, 2));
        System.out.println(diapozon(1, 8));
        plusMinus(1);
        System.out.println(minusPlus(3));
        Hi("Иван");
        leapYear(1101);


    }

    public static int findResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean diapozon(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusMinus(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean minusPlus(int i) {
        if (i >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void Hi(String someName) {
        System.out.println("Hi, " + someName + "!");
    }

    public static void leapYear(int i) {
        boolean v = false;
        if (i % 4 == 0) {
            v = true;
        }
        /*if (i % 400 == 0){
            v = true;}*/
        if (v = false){
            System.out.println("Год не високосный");}
        if (v = true){
            System.out.println("Год високосный");
        }
    }
}





