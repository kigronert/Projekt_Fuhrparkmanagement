package Program;
/**
 * 
 */
/**
 * @author kigro
 *
 */
public class RandomMileageGenerator {
    public static Integer getRandomMileage() {
    	
    	int low = 0;
    	int high = 100000;
    	int r = (int) (Math.random() * (high - low)) + low;

    	System.out.println(r);
    	return r;
    }
}