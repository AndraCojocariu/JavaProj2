package lab6.logicalOp;

import java.util.List;



//ex 3 - tema Liste

public class LogicalOp {
    public void printThis (List <Integer> list, int number){

        for(int i = number; i < list.size(); i++){

            System.out.println(list.get(i));
        }
    }

    //ex 1 - tema Liste

    public void printList (List <String> list){
        for(String element: list){
            System.out.println(element);
        }
    }

    //ex 2 - tema Liste

    public void printAnotherList(List <Integer> list, int number){
        list.add(number);
        System.out.println(list);
    }

    //ex 4 - tema Liste

    public void reverseList (List <Integer> list){
        for (int i = list.size() - 1; i>= 0; i--){
            System.out.println(list.get(i));
        }
    }

    //ex 5 - tema Liste

    public void yetAnotherList(List <String> list, int number, String text){
        list.add(number, text);
        System.out.println(list);

    }

    //ex 6 - tema Liste

    public void printListNo6 (List <Integer> list, int number){
        list.add(0, number);
        System.out.println(list);
    }

    //ex 7 - tema Liste

    public void printListNo7 (List <Integer> list){
        for (int i = 0; i <list.size(); i++){
            System.out.println("Pe pozitia " + i + "," + " valoarea este: " + list.get(i));
        }
    }

    //ex 8 - tema Liste   how??



}
