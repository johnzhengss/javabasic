package dayfive;

import java.util.Arrays;

public class AssignmentOne {
    public static void main(String[] args) {
        String[] arr = {"hello", "hi","echo", "good","eat", "bad","morning"};

        //question 1.1
        Arrays.sort(arr, (a,b)->(a.length() - b.length()));
        System.out.println(Arrays.toString(arr));

        //question 1.2
        Arrays.sort(arr, (a,b)->(b.length() - a.length()));
        System.out.println(Arrays.toString(arr));

        //question 1.3
        Arrays.sort(arr, (a,b)->(a.charAt(0) - b.charAt(0)));
        System.out.println(Arrays.toString(arr));

        //question 1.4
        Arrays.sort(arr, (a,b)-> {
            int x = a.charAt(0) == 'e' ? 1 : 0;
            int y = b.charAt(0) == 'e' ? 1 : 0;
            return y-x;
        });
        System.out.println(Arrays.toString(arr));

        //question 1.5
        Arrays.sort(arr, (s1,s2)-> Utils.sortHelper(s1, s2) );
        System.out.println(Arrays.toString(arr));
    }
}

class Utils{
    public static int sortHelper(String s1, String s2){
        int x = s1.charAt(0) == 'e' ? 1 : 0;
        int y = s2.charAt(0) == 'e' ? 1 : 0;
        return y-x;
    }
}
