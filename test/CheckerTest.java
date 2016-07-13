import org.junit.Assert;

import java.util.Calendar;

/**
 * Created on 0013, July, 13.
 */
public class CheckerTest {
    public void testQuittingTime() {
        MockSystemEnvironment env = new MockSystemEnvironment();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2004);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 16);
        long t1 = cal.getTimeInMillis();

        env.setTime(t1);
        Checker checker = new Checker(env);

//        run the checker
        checker.reminder();
//        nothing should be played yet
        Assert.assertFalse(env.wavWasPlayed());
//        advance the time by 5 min
        t1 += (5 * 60 * 1000);
        env.setTime(t1);
//        now run the checker
        checker.reminder();
//        should have played now
        Assert.assertTrue(env.wavWasPlayed());
//        reset the flag so we can try again
        env.resetWav();
//        advance the time by 2 hours and check
        t1 += 2 * 60 * 1000;
        env.setTime(t1);
        checker.reminder();
        Assert.assertTrue(env.wavWasPlayed());
    }
}
