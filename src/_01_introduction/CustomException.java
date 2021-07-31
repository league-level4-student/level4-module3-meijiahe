package _01_introduction;

public class CustomException extends Exception{
	void terminate() {
		System.exit(0);
	}
}
