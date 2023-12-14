package mypackage;

public class FirstApp {
    public static void main(String[] args) {
        char ac= 12342;
        System.out.println("Hi Jack!" + ac);
        System.out.println(summ(2,3));
        printSomeText();
        printMyText("Stop!");
    }
    public static int summ(int a, int b){
        return a+b;}
    public static void printSomeText() {
        System.out.println("Hi Jack!");}
    public static void printMyText(String txtToPrint){
        System.out.println(txtToPrint);
    }


}
