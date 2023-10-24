import static org.junit.Assert.*;


import java.util.List;

import org.junit.*;

public class ListTests {
    
    @Test 
    public void testfilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("hello");
        input1.add("hi");

        List<String> expected = new ArrayList<>();
        expected.add("hello");
        
        
        assertArrayEquals(expected, ListExamples.filter(input1,"hello"));
        }
}
