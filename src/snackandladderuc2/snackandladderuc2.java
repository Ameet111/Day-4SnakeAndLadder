package snackandladderuc2;

public class snackandladderuc2 {
	public static final int START = 0;
	public static void main(String [] args){
		int Dies;
		System.out.println("Starting position of Snake and Ladder is :" + START);
		Dies = (int) (Math.floor(Math.random() * 10 ) %6 ) + 1;	
		System.out.println(Dies);
	}
}