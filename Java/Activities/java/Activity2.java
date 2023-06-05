import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        //Declaring an Array
        int[] arr1 = {10,77,66,23,30,64};
        System.out.println("Original Numbers" + Arrays.toString(arr1));
        int searchNum = 10;
        int fixedSum = 64;

        System.out.println("Result: " + result(arr1, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}
