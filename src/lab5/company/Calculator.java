package lab5.company;

public class Calculator {


    //ex 1 - Tema Java Arrays - partea cu polimorfism in clasa Calculator

    public float addition(int first, float second) {
        float sum = first + second;
        return sum;
    }
    public float addition (int first, float second, int third){
        return first + second + third;
    }
    public int addition (int first, int second){
        return first + second;
    }

    public float division (float third, int fourth) {
        float result1 = third / fourth;
        return result1;
    }
    public float division (float third, int fourth, float fifth){
        return (third / fourth) / fifth;
    }
    public int division (int third, int fourth){
        return third/fourth;
    }

    public int op(int fifth, int sixth, int seventh) {
        int result2 = fifth + (sixth * seventh);
        return result2;
    }
    public int op (int fifth, int sixth){
        return fifth * sixth;
    }
    public float op (int fifth, float sixth){
        return fifth * sixth;
    }

    public float substract (float firstnumber, int secondnumber) {
        float substraction = firstnumber - secondnumber;
        return substraction;
    }
    public int substract (int firstnumber, int secondnumber){
        int substr = firstnumber - secondnumber;
        return substr;
    }

    public float substract (int firstnumber, float secondnumber){
        float sub = firstnumber - secondnumber;
        return sub;
    }
}