public class Occurrence{
	public static void main(String args[]){
	    String str= "1.	Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring.";
	    System.out.println("First occurence of o :"+ str.indexOf("o"));
	    System.out.println("First occurence of string:"+str.indexOf("string"));
	    System.out.println("Last occurence of m:"+str.lastIndexOf("m"));
	    System.out.println("Last occurence of charecter:"+str.lastIndexOf("charecter"));
	}
}