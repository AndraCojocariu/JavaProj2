package lab4.calculator;

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
    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //ex 11
    public int biggestNo(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else if (number3 >= number1 && number3 >= number2) {
            return number3;
        } else {
            return number1;
        }
    }

    //Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
//Also compute and display the average.
   /* public void SumandAverage (int myNumber){
        for(int i = myNumber; i <= 100; i++){
            System.out.println();
        }

    */
    public void printToHundred(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
            System.out.println("Numarul este:" + 1);
        }
        System.out.println("Media este:" + sum / count);
    }


//faceti o afisare de nr pare de la 0 la -100

    public void printNumbers(int number) {

        for (int i = number; i >= -100; i--) {
            if (i % 2 == 0)
                System.out.println(i);


        }
    }

    public void printFromHundred(int first, int second) {
        for (int i = first; i >= second; i--) {
            System.out.print(i + ", ");
        }
    }

    // ex 1 - Tema - Java For Loops

    public void printTo100(int myNo) {
        for (int i = myNo; i <= 100; i++) {
            System.out.print(i + ", ");
        }
    }

    //ex 2

    public void printToMinus100(int mysecondNo) {
        for (int i = mysecondNo; i >= -100; i--) {
            System.out.println(i);
        }
    }

    // ex 3

    public void printMyNumbersPls(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    //ex 4 ??
     /* public void printThis (int first, int second){
        for (int i = first; i > second; i--){
            if (i > second){
                System.out.println(i);
            }
            else {
                System.out.println(second);
            }


        }
    }

      */


    //ex 5
    public void printEvenNo() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //ex 6

    public void printUnevenNo() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //ex 7

    public int printResult(int first) {

        int sum = 0;
        for (int i = first; i <= 100; i++) {
            sum += i;
        }
        return sum;

    }


    //ex 8

    public int printAvg(int first) {

        int sum = 0;
        int average = 0;
        int counter = 0;
        for (int i = first; i <= 100; i++) {
            sum += i;
            counter++;
            average = sum / counter;

        }
        return average;
    }

    // ex 9
    public void printModel() {
        int i;
        int j;
        for (i = 7; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // ex 1 - Java While Loop

    public void printMethodEx1(int first) {
        while (first <= 100) {
            System.out.println(first);
            first++;
        }

    }

    //ex 2

    public void printMethodEx2(int second) {
        while (second >= -100) {
            System.out.println(second);
            second--;
        }
    }

    //ex 3

    public void printMethodEx3(int first, int second) {
        while (first <= second) {
            System.out.println(first);
            first++;
        }
    }

    //ex 4

    public void printMethodEx4(int first, int second) {
        while (first > second) {
            System.out.println(first);
            first--;
        }
    }


    //ex 5

    public void printMethodEx5() {
        int first = 1;
        while (first <= 100) {
            if ((first % 2) == 0) {
                System.out.println(first);
            }
            first++;
        }

    }

    //ex 6

    public void printMethodEx6(){
        int first = 1;
        while (first <= 100){
            if ((first % 2) != 0){
                System.out.println(first);
            }
            first++;
        }
    }

    //ex 7

    public void printMethodEx7(){
        int first = 111;
        float sum = 0;
        float average = 0;
        int counter = 0;
        while (first <= 8899){
            sum += first;
            first++;
            counter++;
        }
        average = sum/counter;
        System.out.println(average);
    }

    //ex 8 ??

    /*public float printMethodEx8(int first, int second){
        float average = 0;
        float sum = 0;
        int counter = 0;
        while (first <= second) {
            if ((first % 7) == 0) {
                sum += first;
                counter++;
            }
        }
            average = sum / counter;

        return average;


        }

     */

    //ex 9
    public void printMethodEx9 (){
        int i = 1;
        int n = 20;
        int t1 = 0;
        int t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }

    // ex 10

    /*public void printMethodEx10(){
        int first = 1;
        while (first <= 110){
            if ((first % 4) == 0){
                System.out.println("Coza");
            }
            if else ((first % 5) == 0){
                System.out.println("Loza");
            }
        }
    }

     */



    }























