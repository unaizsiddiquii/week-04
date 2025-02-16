package frequencyofelementstesting;

import com.listinterface.frequencyofelements.FruitFrequency;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class FruitFrequencyTesting {

    @Test
    public void testFruitFrequency() {
        //list which store fruits
        List<String> fruitList = Arrays.asList("apple", "banana", "apple", "orange");

        //object of FruitFrequency class
        FruitFrequency fruitFrequency = new FruitFrequency();

        //store manually expected counts
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);


        //create map to store actual count
        Map<String, Integer> actual = fruitFrequency.findFruitFrequency(fruitList);

        //testing
        assertEquals(expected, actual);
        System.out.println("Test passed.");


    }

    @Test
    public void testEmptyList() {
        //list which store fruits
        List<String> fruitList = new ArrayList<>();

        //object of FruitFrequency class
        FruitFrequency fruitFrequency = new FruitFrequency();

        //store manually expected counts
        Map<String, Integer> expected = new HashMap<>();

        //create map to store actual count
        Map<String, Integer> actual = fruitFrequency.findFruitFrequency(fruitList);

        //testing
        assertEquals(expected, actual);
        System.out.println("Test passed.");
    }

    @Test
    public void testAllSameElements() {
        FruitFrequency fruitFrequency = new FruitFrequency();
        List<String> fruitList = Arrays.asList("apple", "apple", "apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);

        assertEquals(expected, fruitFrequency.findFruitFrequency(fruitList));
        System.out.println("Test passed.");
    }
}
