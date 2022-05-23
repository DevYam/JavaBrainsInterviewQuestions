import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] givenArr = {2,3,7,4,8};
        System.out.println(Arrays.toString(findTwoSum(givenArr, 7)));
        System.out.println(Arrays.toString(findTwoSumOneLoop(givenArr, 7)));
        System.out.println(Arrays.toString(findTwoSumUsingMap(givenArr, 7)));
    }

    private static int[] findTwoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    private static int[] findTwoSumOneLoop(int[] arr, int target){
        ArrayList<Integer> toFindNums = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (toFindNums.contains(arr[i])){
                return new int[]{toFindNums.indexOf(arr[i]), i};
            } else {
                int toFind = target - arr[i];
                toFindNums.add(toFind);
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] findTwoSumUsingMap(int[] arr, int target){
        HashMap<Integer, Integer> toFindNums = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if (toFindNums.containsKey(arr[i])){
                return new int[]{toFindNums.get(arr[i]), i};
            } else {
                int toFind = target - arr[i];
                toFindNums.put(toFind, i);
            }
        }
        return new int[] {-1, -1};
    }

    }
