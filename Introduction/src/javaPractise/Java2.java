package javaPractise;
import java.util.ArrayList;

public class Java2 {

	public static void main(String[] args) {
	//check if array has multiple of 2
		
	int[] arr = {1,2,4,5,6,8,122};
	
	for(int i=0;i<arr.length;i++)
	{
		if (arr[i] % 2 == 0)
		{
			System.out.println(arr[i]);
			//break;
			
		}
		else
		{
			System.out.println(arr[i] +"is not multiple of 2");
		}	
		
		//Array list
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("testing");
		a.add("java");
		System.out.println(a.get(1));
		
	}
	}
	
	}


