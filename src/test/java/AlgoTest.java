import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.example.algo.DivideAndConquer;

public class AlgoTest {

    @Test
    void divideAndConquerFindMin() {
        assertEquals(10, DivideAndConquer.findMin(new int[]{38, 27, 43, 10}, 0, 3));
    }
}
