package lab4.calculator;

public class Main {

    public static void main(String[] args) {


        LogicalOp newobj = new LogicalOp();
        int x = newobj.checkBiggerNumber(15, 305);
        System.out.println("The biggest number is: " + x);
        System.out.println(newobj.checkText("Fastrack"));
        System.out.println(newobj.checkNoandText("Fastrack", 7));
        System.out.println(newobj.myMethod(5));
        System.out.println(newobj.mySecondMethod(25));
        newobj.myThirdMethod(6);
        System.out.println(newobj.isNumberEven(1289));
        System.out.println(newobj.isEligibleToVote(25));
        System.out.println(newobj.biggestNo(14, 14, 12));
       newobj.printNumbers(1);
       newobj.printTo100(80);
       newobj.printToMinus100(-79);
       newobj.printMyNumbersPls(0, 12);
       //newobj.printThis(5, 1);
        newobj.printEvenNo();
        newobj.printUnevenNo();
        System.out.println(newobj.printResult(99));
        System.out.println(newobj.printAvg(95));
        newobj.printModel();
        newobj.printMethodEx1(77);
        newobj.printMethodEx2(-80);
        newobj.printMethodEx3(20,26);
        newobj.printMethodEx4(7,1);
        newobj.printMethodEx5();
        newobj.printMethodEx6();
        newobj.printMethodEx7();
        //newobj.printMethodEx8(1, 777);
        newobj.printMethodEx9();
        }

    }
