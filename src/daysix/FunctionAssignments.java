package daysix;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionAssignments {
    public static void main(String[] args) {

        FunctionAssignments assignments = new FunctionAssignments();


        //test assignment4
        List<String> list = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> list1 = Arrays.asList("x");
        List<String> re = assignments.noX(list1);
        System.out.println(re);
    }

    /**
     * Assignment 2
     * @param list
     * @return
     */
    public List<Integer> rightDigit(List<Integer> list){

        List<Integer> result = list.stream().map(a -> a % 10).collect(Collectors.toList());
        return result;
    }

    /**
     * assignment 3
     * @param list
     * @return
     */
    public List<Integer> doubling(List<Integer> list){

        List<Integer> result = list.stream().map(a -> a *2).collect(Collectors.toList());
        return result;
    }

    /**
     * assignment 4
     * @param list
     * @return
     */
    public List<String> noX(List<String> list){

        List<String> result = list.stream().map(a -> a.replaceAll("x","")).collect(Collectors.toList());
        return result;
    }


}
