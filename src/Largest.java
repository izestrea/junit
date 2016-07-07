/**
 * Created on 0007, July, 7.
 */
public class Largest {
    /**
     * return the largest element in a list
     */
    public static int largest(int[] list){
        int max = Integer.MAX_VALUE;

        for(int index = 0; index < list.length - 1; index++){
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }
}
