package daysix;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentOne {

    public PerformOperation isOdd(){
        return (a) -> (a % 2) == 1 ? true : false;
    }

    public PerformOperation isPrime(){
        return (a) -> {
            for(int i = 2; i*i <= a; i++ ){
                if(a % i == 0){
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome(){
        return (a) -> {
            String s = String.valueOf(a);
            int i = 0, j = s.length()-1;
            while (i < j){
                if (s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
    }

    public boolean inputCheck(PerformOperation operation, int n){
        return operation.check(n);
    }

    public String testInput(int sn, int n){
        AssignmentOne assignmentOne = new AssignmentOne();

        String msg = "";
        switch (sn){
            case 1:
                msg = assignmentOne.inputCheck(assignmentOne.isOdd(), n) ? "ODD" : "EVEN";
                break;
            case 2:
                msg = assignmentOne.inputCheck(assignmentOne.isPrime(), n) ? "PRIME" : "COMPOSITE";
                break;
            case 3:
                msg = assignmentOne.inputCheck(assignmentOne.isPalindrome(), n) ? "PALINDROME" : "NOT PALINDROME";
                break;
            default:
                break;
        }

        return msg;
    }

    public static void main(String[] args) {

        AssignmentOne assignmentOne = new AssignmentOne();
        Scanner scanner = new Scanner(System.in);
        String next;
        System.out.print("please input numbers: ");
        while ((next = scanner.nextLine()) != null){
            String[] arr = next.split(" ");

            if (arr == null || arr.length < 2) {
                System.out.print("please input numbers: ");
                continue;
            }

            int sn = Integer.parseInt(arr[0]);
            int n = Integer.parseInt(arr[1]);

            System.out.println(assignmentOne.testInput(sn, n));
            System.out.print("please input numbers: ");
        }
    }

}

interface PerformOperation{
    boolean check(int a);
}
