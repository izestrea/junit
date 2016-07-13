/**
 * Created on 0008, July, 8.
 * Compass bearing
 */
public class Bearing {
//    0 ... 359
    protected int bearing;
    /**
     * Initialize a bearing to a value from 0 ... 359
     */
    public Bearing(int numDegrees) {
        if (numDegrees < 0 || numDegrees > 359) {
            throw new RuntimeException("Bad bearing");
        }
        bearing = numDegrees;
    }
    /**
     * Return the angle between our bearing and another.
     * May be neagative.
     */
    public int angleBetween(Bearing anOther) {
        return bearing - anOther.bearing;
    }
}
