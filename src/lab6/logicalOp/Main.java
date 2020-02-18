package lab6.logicalOp;

import lab6.logicalOp.LogicalOp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(15);
        myList.add(19);
        myList.add(123);

        List <String> mySecondList = new ArrayList<>();
        mySecondList.add("Hi");
        mySecondList.add("nice");
        mySecondList.add("to");
        mySecondList.add("meet");
        mySecondList.add("you");


        LogicalOp logicalop = new LogicalOp();
        logicalop.printThis(myList, 1);
        logicalop.reverseList(myList);
        logicalop.printList(mySecondList);
        logicalop.printAnotherList(myList, 4);
        logicalop.yetAnotherList(mySecondList, 1, "all");
        logicalop.printListNo6(myList, 14);
        logicalop.printListNo7(myList);
    }
}
