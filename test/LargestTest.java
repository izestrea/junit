import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created on 0007, July, 7.
 */
public class LargestTest{
    @Test
    public void largest() {
        assertEquals(9, Largest.largest(new int[] {7, 9, 8}));
        assertEquals(9, Largest.largest(new int[] {9, 8, 7}));
        assertEquals(9, Largest.largest(new int[] {8, 9, 7}));
        assertEquals(9, Largest.largest(new int[] {7, 8, 9}));
    }
    @Test
    public void testDups(){
        assertEquals(9, Largest.largest(new int[] {9, 7, 9, 8}));
    }
    @Test
    public void testOne(){
        assertEquals(1, Largest.largest(new int[] {1}));
    }
    @Test
    public void testNegative(){
        assertEquals(-7, Largest.largest(new int[] {-9, -8, -7}));
    }
    @Test
    public void testEmpty(){
        try {
            Largest.largest(new int[] {});
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

}