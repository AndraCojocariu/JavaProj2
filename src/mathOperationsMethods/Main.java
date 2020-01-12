package mathOperationsMethods;

public class Main {
    public static void main(String[] args) {
        float x = substraction(16.5f, 9);
        System.out.println(x);
        double y = inm(2.5, 7);
        System.out.println(y);
        float z = div(5,1.3f);
        System.out.println("The result is: " + z);
        long j = modulo((short) 123,12);
        System.out.println(j);
        printName("Andra");

    }
    public static float substraction (float firstnumber, int secondnumber){
        float substraction = firstnumber - secondnumber;
        return substraction;
    }
    public static double inm (double third, int fourth){
        double inm = third * fourth;
        return inm;
    }
    public static float div (int fifth, float sixth){
        float div = fifth / sixth;
        return div;
    }
    public static long modulo(short seventh, long eigth){
        long modulo = seventh % eigth;
        return modulo;
    }
    public static void printName(String name){
        System.out.println("The name is:");
        System.out.println(name);
    }
}
