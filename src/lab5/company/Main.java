package lab5.company;


public class Main {


    //ex 1
    public static void main(String[] args) {
        Calculator newobj = new Calculator();
        System.out.println(newobj.addition(5, 8.96f));
        System.out.println(newobj.addition(1, 24.4f, 3));
        System.out.println(newobj.addition(10, 5));
        System.out.println(newobj.division(8.96f, 5));
        System.out.println(newobj.division(5.3f, 4, 1.1f));
        System.out.println(newobj.division(250, 5));
        System.out.println(newobj.op(-5, 8, 6));
        System.out.println(newobj.op(20, 6));
        System.out.println(newobj.op(15, 9.5f));

        float x = newobj.substract(16.5f, 9);
        System.out.println("Rezultatul scaderii nr este: " + x);

        int x2 = newobj.substract(150, 42);
        System.out.println("Rezultatul scaderii nr este: " + x2);

        float x3 = newobj.substract(15, 5.4f);
        System.out.println("Rezultatul scaderii nr este: " + x3);



    }

}


