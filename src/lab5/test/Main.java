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

        //ex 1 - tema optionala Array

        int [] anArrayExercise = {24, 59, 20, 2};
        int aValue = op.returnMethodBlaBla(anArrayExercise);
        System.out.println(aValue);



        //ex 2 - tema optionala Array

        int [] anArray10 = {14, 146, 23, 55};
        int [] anArray11 = op.anotherMethod(anArray10, 100, 2);
        for (int i = 0; i<anArray11.length; i++){
            System.out.println(anArray11[i]);

        }

        //ex 3 - tema optionala Array

        int [] anArray12 = {10, 50000, 5, 230, 40494};
        op.findMyNumbers(anArray12);

        //ex 8 - refacut

        //ex 4 - tema optionala Array

        int [] anArray13 = {12, 50, 222, 47, 10, 2};
        op.printArray(op.reverseNumbers(anArray13));

        //ex 5 - tema optionala Array

        int [] anArray14 = {12, 44, 56, 44, 16, 16, 28, 4, 12};
        op.findDuplicateNo(anArray14);

        //ex 6 - tema optionala Array

        String [] anArray15 = {"Hello", "Deja-vu", "Common", "Hi" };
        String [] anArray16 = {"Ce faci?", "Lalala", "Hi", "Hello"};
        op.returnSameStrings(anArray15, anArray16);

        //ex 7 - tema optionala Array
        int [] anArray17 = {12, 4, 15, 64, 34, 2};
        op.printArray(op.sortAsc(anArray17));


    }



}