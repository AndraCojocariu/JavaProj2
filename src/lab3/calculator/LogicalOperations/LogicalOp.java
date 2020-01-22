package lab3.calculator.LogicalOperations;
//ex 2
public class LogicalOp {

    //ex 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //ex 4
    public String checkText(String text) {
        if (text.equals("FastrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    //ex 5
    public String checkNoandText(String text3, int no1) {
        if (text3.equals("FastrackIT") && no1 <= 3) {
            return (text3 + " " + no1);
        } else if (!text3.equals("FastrackIT") && no1 >= 4) {
            return (no1 + " " + text3);
        } else {
            return ("Error 404");
        }
    }

    //ex 6
    public String myMethod(int myNumber) {
        if (myNumber > 8 || myNumber == 6) {
            return ("The amount of snow this winter was(cm): " + myNumber);
        } else {
            return ("The forecast snow is(cm): " + myNumber);
        }
    }

    //ex 7
    public String mySecondMethod(int mySecondNumber) {
        if (mySecondNumber > 3 && mySecondNumber != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (mySecondNumber == 4) {
            return ("The number is equal to 4");
        } else if (mySecondNumber < 3) {
            return ("The number is lower than 3");
        } else {
            return ("Neither");
        }
    }

    //ex 8
    public void myThirdMethod(int myThirdNumber) {
        System.out.println(myThirdNumber);
        switch (myThirdNumber) {
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            case 10:
                System.out.println("The number is 10");
                break;
        }

    }

    //ex 9
    public boolean isNumberEven(int myFourthNo) {
        if (myFourthNo % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ex 10
    public boolean isEligibleToVote (int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //ex 11
    public int biggestNo (int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else if (number3 >= number1 && number3 >= number2) {
            return number3;
        } else{
            return number1;
        }
    }



}


