package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide (double numerator, double denominator) throws IllegalArgumentException{
		if (denominator==0.0) {
		throw new IllegalArgumentException ();
		}
		return numerator/denominator;
	}
	public static String reverseString(String word) throws IllegalStateException{
		String reverseword ="";
		for(int i=word.length(); i>0; i--) {
            reverseword += word.charAt(i-1);
        }   
		if (word.isEmpty()){
			throw new IllegalStateException ();
		}
		return reverseword;
	}
}
