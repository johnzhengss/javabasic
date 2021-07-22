package daytwo;

import java.util.Arrays;

public class AssignmentTwo {
    public static void main(String[] args) {
        int[][] matrix = {  {2,1,3},
                            {7,9,12},
                            {6,21,5} };

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        int[] result = assignmentTwo.findMax(matrix);
        System.out.println(Arrays.toString(result));
    }

    public int[] findMax(int[][] matrix){

        int[] result = new int[2];
        if(matrix == null || matrix[0] == null){
            return result;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println("max is: " + max);
        return result;
    }
}
