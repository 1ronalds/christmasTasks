import org.example.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListUnitTest {

    @Test
    void add_test() {
        ArrayList list = new ArrayList();
        list.add(5);
        assertEquals(5, list.getAtIndex(0));
    }

    @Test
    void delete_test() {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(4);
        list.delete(0);
        assertEquals(4, list.getAtIndex(0));
    }

    @Test
    void getAtIndex_test() {
        ArrayList list = new ArrayList();
        list.add(5);
        assertEquals(5, list.getAtIndex(0));
    }

    @Test
    void addAtIndex_test() {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(7);
        list.addAtIndex(1, 6);
        assertEquals(6, list.getAtIndex(1));
        assertEquals(7, list.getAtIndex(2));
    }
}
