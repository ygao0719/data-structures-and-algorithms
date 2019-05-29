import java.util.Arrays;

package code.challenges;

public class ArrayShift {
    public int[] insertShiftArray(int[] inputArr, int num) {
        int[] newArr = new int[inputArr.length + 1];

        for (int i = 0; i < newArr.length;i ++){
            if (i < Math.ceil(inputArr.length/2)){
                newArr[i] = inputArr[i];
            }else if (i == Math.ceil(inputArr.length/2)){
                newArr[i] = num;
            }else {
                newArr[i] = inputArr[i-1];
            }
        }

        return newArr;
    }
}