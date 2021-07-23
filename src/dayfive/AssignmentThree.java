package dayfive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentThree {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "eating", "apple", "App", "pear", "api", "apt");

        AssignmentThree assignmentThree = new AssignmentThree();
        List<String> result = assignmentThree.listHelper(list);
        System.out.println(result);
    }

    public List<String> listHelper(List<String> list){
        if (list == null || list.size()==0){
            return list;
        }
        return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
    }
}
