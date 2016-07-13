import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created on 0008, July, 8.
 */
public class LargestDataFileTest {
    /*
     * Run all the tests in testdata.txt (does not test exception case).
     * We'l get an error if any of any of the file I/O goes wrong.
     */
    @Test
    public void testFromFile() throws Exception {
        String line;
        BufferedReader rdr = new BufferedReader(
          new FileReader("test/testdata.txt")
        );

        while ((line = rdr.readLine()) != null) {
//            ignore comments
            if (line.startsWith("#")) {
                continue;
            }
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreElements()) {
//              blank line
                continue;
            }
//            get the expected value
            String val = st.nextToken();
            int expected = Integer.valueOf(val);
//            and the arguments to Largest
            ArrayList<Integer> argumentList = new ArrayList();
            while (st.hasMoreTokens()) {
                argumentList.add(Integer.valueOf(st.nextToken()));
            }
//            transfer object list into native array
            int[] arguments = new int[argumentList.size()];
            for (int i = 0; i < argumentList.size(); i++) {
                arguments[i] = argumentList.get(i);
            }
//            and tun the assert
            Assert.assertEquals(expected, Largest.largest(arguments));
        }
    }
}
