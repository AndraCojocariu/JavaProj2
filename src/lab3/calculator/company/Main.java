package lab3.calculator.company;


public class Main {


    //ex 1
    public static void main(String[] args) {
        Calculator newobj = new Calculator();
        System.out.println(newobj.addition(5, 8.96f));
        System.out.println(newobj.division(8.96f, 5));
        System.out.println(newobj.op(-5, 8, 6));

        float x = newobj.substract(16.5f, 9);
        System.out.println("Rezultatul scaderii nr este: " + x);

        double y = newobj.inmultire(2.5, 7);
        System.out.println("Rezultatul inmultirii nr este: " + y);

        float z = newobj.impartire(5, 1.3f);
        System.out.println("Rezultatul impartirii nr este : " + z);

        long j = newobj.adunare(12,135);
        System.out.println("Rezultatul adunarii nr este: " + j);


    }

}


