import org.example.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortUnitTest {

    @Test
    void bubbleSort_test(){
        Integer[] sortable = {5,4,3,2,1};
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(BubbleSort.sort(sortable)));
    }

}
