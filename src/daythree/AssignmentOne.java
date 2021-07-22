package daythree;

import java.io.File;

public class AssignmentOne {
    public static void main(String[] args) {
        AssignmentOne assignmentOne = new AssignmentOne();
        String path = "C:\\Users\\John_Zheng\\Desktop\\testfile";
        assignmentOne.listDirectoryAndFiles(path);
    }

    public void listDirectoryAndFiles(String path){
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files != null && files.length > 0){
            for (File file : files){
                if (file.isDirectory()){
                    System.out.println(file.getName());
                    listDirectoryAndFiles(file.getPath());
                }else {
                    System.out.println(file.getName());
                }
            }
        }else {
            System.out.println("file is null or file is not exist");
        }
    }
}
