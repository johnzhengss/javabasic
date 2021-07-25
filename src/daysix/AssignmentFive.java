package daysix;

public class AssignmentFive {

    public boolean groupSumClump(int n, int[] arr, int target){
        if (target == 0){
            return true;
        }
        if (n == arr.length){
            return false;
        }
        int temp = arr[n];
        while (n+1 < arr.length && arr[n+1] == arr[n]){
//            temp = temp + arr[n+1];
            temp += arr[n+1];
            n++;
        }

        return groupSumClump(n+1, arr, target-temp) || groupSumClump(n+1, arr, target);

    }
    public static void main(String[] args) {
        AssignmentFive assignmentFive = new AssignmentFive();
        int[] arr = {1, 2, 4, 8, 1};
        boolean re = assignmentFive.groupSumClump(0, arr, 14);
        System.out.println(re);

    }

}
