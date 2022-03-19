package javaPractise;

public class Java3 {

	public static void main(String[] args) {
		// string is an object
		//string literal
		
		String s = "nisha";
		
		//new
		String s1 = new String("welcome");
		
		String s2 = "Life is Beautiful";
		String[] splittedstring =  s2.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		
		for(int i=0;i<s2.length();i++)
		{	
		System.out.println(s2.charAt(i));
		}
		
		//reverse string
		
		for (int i=s2.length()-1;i>=0;i--)
		{
		 System.out.println(s2.charAt(i))	;
		}
		}
		
//for(int i = s2.length()-1; i>=0;i--)
//for(int i = 0;i<s2.length();i++)
	
	}

