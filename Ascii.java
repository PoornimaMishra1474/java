public class Ascii
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		for (int i =0 ; i < 125 ; i++){
		    System.out.printf("%d %c" ,i, i );
		    System.out.println("");
		}
	}
}