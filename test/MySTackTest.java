import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 0008, July, 8.
 */
public class MySTackTest {
    @Test
    public void testEmpty() throws IllegalStateException {
        MyStack stack = new MyStack();
        stack.checkInvariant();
        stack.push("sample");
        stack.checkInvariant();
//        popping last element ok
        Assert.assertEquals("sample", stack.pop());
        stack.checkInvariant();
//        delete from empty stack
        stack.delete(1);
        stack.checkInvariant();
    }
}
