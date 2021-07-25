package test.daysix;
import daysix.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DaySixTest {

    @Test
    public void assignmentOneTest(){
        AssignmentOne assignmentOne = new AssignmentOne();
        assertFalse(assignmentOne.inputCheck(assignmentOne.isOdd(),4));
        assertTrue(assignmentOne.inputCheck(assignmentOne.isPrime(),5));
        assertTrue(assignmentOne.inputCheck(assignmentOne.isPalindrome(),898));
        assertTrue(assignmentOne.inputCheck(assignmentOne.isOdd(),3));
        assertFalse(assignmentOne.inputCheck(assignmentOne.isPrime(),12));
    }

    FunctionAssignments functionAssignments = new FunctionAssignments();

    @Test
    public void assignmentTwoTest(){
        List<Integer> list1 = Arrays.asList(1, 22, 93);
        List<Integer> list1T = Arrays.asList(1, 2, 3);
        assertEquals(list1T,functionAssignments.rightDigit(list1));

        List<Integer> list2 = Arrays.asList(16, 8, 886, 8, 1);
        List<Integer> list2T = Arrays.asList(6, 8, 6, 8, 1);
        assertEquals(list2T,functionAssignments.rightDigit(list2));

        List<Integer> list3 = Arrays.asList(10, 0);
        List<Integer> list3T = Arrays.asList(0, 0);
        assertEquals(list3T,functionAssignments.rightDigit(list3));
    }

    @Test
    public void assignmentThreeTest(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list1T = Arrays.asList(2, 4, 6);
        assertEquals(list1T,functionAssignments.doubling(list1));

        List<Integer> list2 = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> list2T = Arrays.asList(12, 16, 12, 16, -2);
        assertEquals(list2T,functionAssignments.doubling(list2));

        List<Integer> list3 = Arrays.asList();
        List<Integer> list3T = Arrays.asList();
        assertEquals(list3T,functionAssignments.doubling(list3));
    }

    @Test
    public void assignmentFourTest(){
        List<String> list1 = Arrays.asList("ax", "bb", "cx");
        List<String> list1T = Arrays.asList("a", "bb", "c");
        assertEquals(list1T,functionAssignments.noX(list1));

        List<String> list2 = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> list2T = Arrays.asList("a", "bb", "c");
        assertEquals(list2T,functionAssignments.noX(list2));

        List<String> list3 = Arrays.asList("x");
        List<String> list3T = Arrays.asList("");
        assertEquals(list3T,functionAssignments.noX(list3));
    }

    @Test
    public void assignmentFiveTest(){
        AssignmentFive assignmentFive = new AssignmentFive();
        int[] arr1 = {2, 4, 8};
        assertTrue(assignmentFive.groupSumClump(0, arr1,10));

        int[] arr2 = {1, 2, 4, 8, 1};
        assertTrue(assignmentFive.groupSumClump(0, arr2,14));

        int[] arr3 = {2, 4, 4, 8};
        assertFalse(assignmentFive.groupSumClump(0, arr3,14));
    }

}
