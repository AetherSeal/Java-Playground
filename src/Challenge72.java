import java.util.Scanner;

public class Challenge72 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        /* Lesson
        // int[] myIntArray = new int[10];
        // or...
        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,0};
        //double[] myDoubleArray = new double[10];
        */

        int[] inputArray = getIntegers(5);
        inputArray = sortIntegers(inputArray);
        printArray(inputArray);
    }

    public static int[] getIntegers(int arrayLength){
        //return the input
        int[] inputs = new int[arrayLength];

        System.out.println("Enter "+arrayLength+" the values: \r");

        for (int i = 0; i < arrayLength; i++) {
            inputs[i] = scanner.nextInt();
        }

        return inputs;
    }
    public static void printArray(int[] array){
        // print out the array
        for (int e:array) {
            System.out.print(e+" ");
        }
    }
    public static int[] sortIntegers(int[] array){
        // Utils way
        // Arrays.sort(array);

        

        return array;

    }
}
