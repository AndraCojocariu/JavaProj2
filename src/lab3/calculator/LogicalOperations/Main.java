package lab3.calculator.LogicalOperations;

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

        }

    }
