import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created on 0013, July, 13.
 */
public class TemperatureServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws SerialException, IOException {
        String str_f = req.getParameter("Fahreinheit");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            int temp_f = Integer.parseInt(str_f);
            double temp_c = (temp_f - 32) * 5.00 / 9.0;
            out.println("Fahrenheit: " + temp_f + ", Celsius: " + temp_c);
        }catch (NumberFormatException e) {
            out.println("Invalid temperature: " + str_f);
        }
    }
}
