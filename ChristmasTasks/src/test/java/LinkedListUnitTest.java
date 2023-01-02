import org.example.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListUnitTest {

    @Test
    void add_test(){
        LinkedList list = new LinkedList();
        list.add(5);
        assertEquals(5, list.get(0));
    }

    @Test
    void delete_test(){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.delete(0);
        assertEquals(6, list.get(0));
    }

    @Test
    void addAtIndex_test(){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.addAtIndex(1, 6);
        assertEquals(5, list.get(0));
        assertEquals(6, list.get(1));
        assertEquals(7, list.get(2));
    }
}
