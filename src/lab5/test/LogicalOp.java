package lab5.test;
public class LogicalOp {


    //ex 2 - Tema Arrays
    public int[] arrayToHundred() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public void printArray(int[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }

    }

    //ex 3
    public int[] returnArray(int[] arrayList) {

        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] % 2 == 0) {
                System.out.println(arrayList[i]);
            }

        }
        return arrayList;
    }

    //ex 4
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    //ex 5
    public boolean returnMethod(String[] array, String ceva) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(ceva)) {
                return true;
            }

        }
        return false;
    }

    //ex 6

    public int returnMethod2(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }

        }
        return 99999999;
    }

    //ex 7 (aproape corect)

    public void returnPattern(String[] array) {
        String model = "-";
        for (int i = 0; i < 10; i++) {
            System.out.println(model + " ");

            for (int j = 0; j < 10; j++) {
                System.out.print(model + " ");
            }
        }

    }

    //ex 8

    /* public int [] returnMethod3 (int [] array, int number){
        int []array2 = [2];
        int counter = 0;
        for (int i: array) {
            if (i == number) {
                counter++;
            }

            if(counter == 0) {
                return array;
            }

            if else (counter != 0){
                return ...
            }
        }

        return array2;
    }

     */
    //ex 8 refacut

   /* public int[] returnNewArray (int[] array, int number){
        boolean found = false;
        int [] newArray = new int [array.length-1];
                for (int i = 0; i< array.length; i++){
                    if (found){
                        newArray[i-1] =array[i];
                    }
                    if (array[i] ! = number){
                        newArray[i] = array[i];
                    }
                    else {
                        found = true
                        continue;
                    }
                }
                return newArray;
    }

    */

    //ex 9

    public int returnMethod4 (int[] array){
        int number;
        for (int i = 0; i <array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                    // am preluat-o de pe net, dar nu inteleg cum s-ar traduce logic sintaxa din if-ul asta de sus
                }
            }
        }
        return array[1];
    }

    //ex 10

    public int[] returnMethod5 (int [] array, int [] copyArray){
         copyArray = new int [array.length];
        for (int i = 0; i<array.length; i++){
            copyArray[i] = array[i];
        }

        return copyArray;
    }

    // Tema optionala Java Arrays

    //ex 1 - acelasi cu ex 9 din tema anterioara de la Arrays


    public int returnMethodBlaBla (int[] array){
        int number;
        for (int i = 0; i <array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;

                }
            }
        }
        return array[1];
    }

    //ex 2 - Tema optionala Arrays

    public int[] anotherMethod(int [] array, int number, int index){
        int [] result = new int [array.length + 1];
        for (int i = 0, j = 0; i <array.length; i++, j++){
            if (i == index) {
                result[j] = number;
                j++;
            }
            result [j] = array[i];

        }
        return result;
    }

    //ex 3 - Tema optionala Arrays

    public void findMyNumbers (int[] array){
        int max = array[0];
        int min = array[0];

        for (int i = 1; i <array.length; i++){
            if(array[i] > max)
                max = array[i];

            if (array[i] < min)
                min = array[i];
            }

        System.out.println("The largest number from the array is: " + max);
        System.out.println("The smallest number from the array is : " + min);

        }

        //ex 4 - tema optionala Array

        public int[] reverseNumbers (int[] array) {

            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[array.length - 1 - i] = array[i];

            }
            return newArray;
        }

        //ex 5 - tema optionala Array

        public void findDuplicateNo (int [] array){
            for (int i = 0; i<array.length; i++){
                for (int j = i + 1; j <array.length; j++){
                    if (array[i] == array[j]){
                        System.out.println("Duplicate elements in the given array are: " + array[j]);

                        }
                    }
                }

            }

        //ex 6 - tema optionala Array

        public void returnSameStrings (String [] array, String [] array2){
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j< array2.length; j++){
                if (array[i].equals(array2[j])){
                    System.out.println(array[i]);
                }
            }
        }
        }


        //ex 7 - tema optionala Array

        public int [] sortAsc (int[] array){
        for (int i = 0; i <array.length; i++){
            for (int j = i+1; j <= array.length-1; j++){
              if(array[i] > array[j]){
                  int temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
              }
                System.out.println(array[i]);
            }
        }
        return array;
        }
        }














