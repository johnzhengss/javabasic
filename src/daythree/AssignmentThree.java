package daythree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentThree {
    public static void main(String[] args) {
        AssignmentThree assignmentThree = new AssignmentThree();
        String path = "resources/test.txt";
        int count = assignmentThree.countChar(path);
        System.out.println("total count: " + count);
    }

    public int countChar(String path){
        int count = 0;
        System.out.print("please input search letter: ");
        Scanner scanner = new Scanner(System.in);
        char search = scanner.next().charAt(0);
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            )
        {
            String line;
            while ((line = br.readLine()) != null){
                for(char c : line.toCharArray()){
                    if(c == search) count++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            scanner.close();
            return count;
        }
    }
}
