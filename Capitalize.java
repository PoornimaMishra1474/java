public class Capitalize{
	public static void main(String args[]){
	    StringBuffer S= new StringBuffer("PFghhfFfghghrfHFH");
	    char ch;
	    for(int i=0;i<S.length();i++){
	        if ((S.charAt(i)>'a') && (S.charAt(i)<'z')){
	            ch=(char)((int)S.charAt(i)-32);
	            S.setCharAt(i,ch);
	         }
	    }
	System.out.println(S);
	}
}