package daythree;

import java.io.*;

public class AssignmentTwo {
    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        String path = "resources/note.txt";
        String str = "test";
        assignmentTwo.editFile(path, str);
    }

    public void editFile(String path, String str){
        try(FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw))
        {
            pw.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
