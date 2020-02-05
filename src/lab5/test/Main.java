package lab5.test;

public class Main{
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        //ex 1

        //ex 2
        int [] newArray = op.arrayToHundred();
        op.printArray(newArray);


        //ex 3
        int [] anArray = new int [100];
        for (int i = 1; i<=anArray.length; i++){
            anArray[i-1]= i;
        }
        int [] newArray2 = op.returnArray(anArray);


        //ex 4
        int [] anArray2 = {15, 23, 105};
        float x = op.getAverage(anArray2);
        System.out.println(x);


        //ex 5
        String [] anArray3 = {"Hello", "Friday"};
        boolean y = op.returnMethod(anArray3, "Friday");
        System.out.println(y);

        //ex 6

        int [] anArray4 = {14, 15, 453, 24};
        int z = op.returnMethod2(anArray4,453);
        System.out.println(z);

        //ex 7 (aproape corect)

        String [] anArray5 = new String[10];
        op.returnPattern(anArray5);

        //ex 8

      /*  int [] anArray6 = {23, 44, 62, 5357, 15};

        op.printArray(anArray6);
        int [] secondArray = op.returnMethod3(anArray6, 24);

       */

        //ex 9
        int [] anArray7 = {20, 53, 25, 2, 5};
        int value = op.returnMethod4(anArray7);
        System.out.println(value);

        //ex 10

        int [] anArray8 = {12, 5756, 1234, 64, 1};
        int [] anEmptyArray = new int [5];
        int [] anArray9 = op.returnMethod5(anArray8, anEmptyArray);
        op.printArray(anArray9);








    }



}