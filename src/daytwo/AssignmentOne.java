package daytwo;

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {

        AssignmentOne assignmentOne = new AssignmentOne();

        try{
            assignmentOne.sumInput();
        }catch (Exception e){
            System.out.println("Only Integer is Valid");
        }
    }

    public void sumInput(){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input numbers: ");
        int x = 0;
        int input;
        while (scanner.hasNext()){
//            while (!scanner.hasNextInt()){
//                System.out.println("please input integer");
//                scanner.next();
//            }
            input = scanner.nextInt();
            sum = sum + input;
            x++;
            if(x > 1){
                System.out.println("sum: " + sum);
            }
        }
        scanner.close();
    }
}
