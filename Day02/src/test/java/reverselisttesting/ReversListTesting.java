package reverselisttesting;

import com.listinterface.reverselist.LinkedL;
import com.listinterface.reverselist.Main;
import com.listinterface.reverselist.Reverse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReversListTesting {

    @Test
    //arraylist test 1 method
    public void test1() {

        //object of class reverse
        Reverse reverse = new Reverse();
        //create arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //add values
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //create copy of orignal list
        ArrayList<Integer> copyOfList = new ArrayList<>(list);
        ArrayList<Integer> actual = reverse.reverseArrayList(list);
        List<Integer> expected = copyOfList.reversed();

        //result checker
        Assertions.assertEquals(actual, expected);
        System.out.println("Test executed for " + copyOfList);
    }


}
