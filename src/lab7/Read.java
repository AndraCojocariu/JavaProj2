package lab7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

   /* public int readInt(){
        boolean repeat = true;
        int number = 0;
        while(repeat){
            try {
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                number = scanner.nextInt();
                repeat = false;
            }catch(InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
                finally{
                    System.out.println("Thank you for asking for help!");
                }
            }
        }
        return number;
    }

    */


    //ex 1

    public int returnValue() {
        boolean repeat = true;
        int number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }
        return number;


    }

    //ex 2

    public float returnFloatNo() {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                System.out.println("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }
        return number;
    }

    public double returnDoubleNo() {
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                System.out.println("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }
        return number;
    }

    public long returnLongNo() {
        boolean repeat = true;
        long number = 0;
        while (repeat) {
            try {
                System.out.println("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextLong();
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }
        return number;
    }


    //ex 3 ??

  /*  public int[] returnArray(){

    int[] myArray = new int [5];
     int i;

    try{
        System.out.println("Please enter an array of int");
        Scanner scanner = new Scanner (System.in);
        for (i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        myArray[i] = scanner.nextInt();

    }
    catch (IndexOutOfBoundsException e){
        System.out.println("The entered index is out of bounds");
    }
    catch (InputMismatchException e2){
        System.out.println("Must enter int type of values");
    }
    return myArray;

   */


    //ex 4 ??

    public List<Integer> returnList() {
        List<Integer> list = new ArrayList<>();
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("Please enter a list");
                Scanner scanner = new Scanner(System.in);
                int index = scanner.nextInt();
                System.out.println(list.get(index));
                repeat = false;
            }
            catch (IndexOutOfBoundsException exception){
                System.out.println("Index is out of bounds");
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid type. Please retry");
            }
        }
        return list;


    }
}
