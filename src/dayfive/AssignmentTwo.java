package dayfive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,5,8,11,56,78);
        System.out.println(list.toString());

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        String s = assignmentTwo.stringHelper(list);
        System.out.println(s);
    }

    public String stringHelper(List<Integer> list){
        if (list == null || list.size() == 0){
            return "";
        }
        String s = list.stream().map(n->n%2 == 0 ? "e"+n : "o"+n).collect(Collectors.joining(","));
        return s;
    }
}
