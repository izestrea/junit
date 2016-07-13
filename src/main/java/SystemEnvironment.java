/**
 * Created on 0013, July, 13.
 */
public class SystemEnvironment implements Environmental{
    public long getTime() {
        return System.currentTimeMillis();
    }
}
