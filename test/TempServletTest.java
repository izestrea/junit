import com.mockobjects.servlet.MockHttpServletRequest;
import com.mockobjects.servlet.MockHttpServletResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 0013, July, 13.
 */
public class TempServletTest  {
    @Test
    public void test_bad_parameter() throws Exception {
        TemperatureServlet s = new TemperatureServlet();
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();

        request.setupAddParameter("Fahrenheit", "boo!");
        response.setExpectedContentType("text/html");
        s.doGet(request, response);
        response.verify();
        Assert.assertEquals("Invalid temperature: boo!\n", response.getOutputStreamContents());
    }

    @Test
    public void test_boil() throws Exception {
        TemperatureServlet s = new TemperatureServlet();
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();

        request.setupAddParameter("Fahrenheit", "212");
        response.setExpectedContentType("text/html");
        s.doGet(request, response);
        Assert.assertEquals("Fahrenheit: 212, Celsius: 100.0\n", response.getOutputStreamContents());
    }
}
