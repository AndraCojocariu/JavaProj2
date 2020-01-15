package com.company;


public class Main {


    //1
    public static void main(String[] args) {
        printMyName();
        System.out.println("Rezultatul adunarii este " + addition(5, 8.96f));
        System.out.println("Rezultatul impartii este: " + division(8.96f, 5));
        System.out.println("Rezultatul operatiei este: " + op(-5, 8, 6));
        float x = substraction(16.5f, 9);
        System.out.println("Rezultatul scaderii nr este: " + x);
        double y = inm(2.5, 7);
        System.out.println("Rezultatul inmultirii nr este: " + y);
        float z = div(5, 1.3f);
        System.out.println("Rezultatul impartirii nr este : " + z);
        long j = adun((short) 123, 12);
        System.out.println("Rezultatul adunarii nr este: " + j);
        printThis();
        System.out.println("Media este: " + average(345.2f, 23, 2.56f));
        printThisModel();
        System.out.println("Restul impartirii celor doua nr este: " + modulo(84, 12.3f));
        System.out.println("Temperatura in grade celsius este: " + temperature(130.4f));
        System.out.println("228.5 inch reprezinta: " + distance(228.5f) + " m");



    }

    public static void printMyName() {
        System.out.println("Hello \n Andra");
    }

    public static float addition(int first, float second) {
        float sum = first + second;
        return sum;
    }

    public static float division(float third, int fourth) {
        float result1 = third / fourth;
        return result1;
    }

    public static int op(int fifth, int sixth, int seventh) {
        int result2 = fifth + (sixth * seventh);
        return result2;
    }

    //ex 2

    public static float substraction(float firstnumber, int secondnumber) {
        float substraction = firstnumber - secondnumber;
        return substraction;
    }

    public static double inm(double third, int fourth) {
        double inm = third * fourth;
        return inm;
    }

    public static float div(int fifth, float sixth) {
        float div = fifth / sixth;
        return div;
    }

    public static long adun(short seventh, long eigth) {
        long adun = seventh + eigth;
        return adun;

    }

    //ex 3
    public static void printThis(){
        System.out.println    ("   J     a    v     v  a");
        System.out.println    ("   J   a   a   v   v  a a");
        System.out.println("J  J   aaaaa    V V  aaaaa");
        System.out.println  (" JJ   a     a    V  a     a");
    }
    //ex 4

    public static float average(float no1, int no2, float no3){
        float result2 = (no1 + no2 + no3) /3;
        return result2;
    }
    //ex 5
    public static void printThisModel(){
        System.out.println("    +'' '' '' '' ''+ ");
        System.out.println(" [  |  o       o   | ]");
        System.out.println("    |      ^       |");
        System.out.println("    |    ' _ '     |");
        System.out.println("    |              |");
        System.out.println("    +  _  _  _  _  +");
    }
    //sigur exista o metoda de a scrie cod pentru modelele astea, probably some kind of pattern code

    //ex 6
    public static float modulo(int no4, float no5){
        float result3 = no4 % no5;
        return result3;
    }
    //ex 7
    public static double temperature(float fahrenheitDegree){
        double celsiusDegree = ((5 * (fahrenheitDegree - 32.0)) / 9);
        return celsiusDegree;
    }

    //ex 8
    //one inch = 0.0254 meter
    public static float distance(float inch){
        float meters = inch * 0.0254f;
        return meters;
    }
    //ex 9
    /*1km = 1000m
    1mile = 1609m
     */

   /* public static float speed (float meters, int hours, int minutes, int seconds){
        float timePerSec = (hours * 3600) + (minutes * 60) + seconds;
        return timePerSec;

    }
    */
}


