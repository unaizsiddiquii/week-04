package basics;

import com.ListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTesting {

    @Test
    public void addElementTest() {
        List<Integer> actualList = new ArrayList<>();

        //add element by ListManager class method
        ListManager.addElement(actualList, 1);
        ListManager.addElement(actualList, 2);
        ListManager.addElement(actualList, 3);

        List<Integer> expectedList = new ArrayList();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);

        Assertions.assertEquals(expectedList, actualList);

    }

    @Test
    public void removeElementTest() {
        List<Integer> actualList = new ArrayList<>();
        actualList.add(1);
        actualList.add(2);
        actualList.add(3);

        //ListManager class method call
        ListManager.removeElement(actualList, 2);

        List<Integer> expectedList = new ArrayList();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.remove(2);

        Assertions.assertEquals(expectedList, actualList);

    }

    @Test
    public void getSizeTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //getting size with listManager class method
        int actual = ListManager.getSize(list);
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }

}
