package dayone;

import java.util.Random;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(100) + 1;
        System.out.println("x: " + x);

        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;

        do{
            System.out.println("input a number: ");
            n = scanner.nextInt();
            count++;
        }while(count < 5 && (n < x-10 || n > x+10));

        if(n < x-10 || n > x+10){
            System.out.println("sorry, number is: " + x);
        }else {
            System.out.println("number: " + x);
        }
    }
}
