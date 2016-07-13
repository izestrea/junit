import java.util.Calendar;

/**
 * Created on 0013, July, 13.
 */
public class Checker {
    private MockSystemEnvironment env;

    public Checker(MockSystemEnvironment anEnv) {
        env = anEnv;
    }
    /**
     * After 5 o'clock, remind people to go home
     */
    public void reminder(){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(env.getTime());
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if(hour >= 17) {
            env.playWavFile("quit_whistle.wav");
        }
    }
}
