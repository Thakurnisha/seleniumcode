package javaPractise;

public class Java1 {

	public static void main(String[] args) {
		
		int myNum = 5;
		String website = "makemytrip";
		boolean myCard = true;
		double des = 0.9;
		
		System.out.println(myNum);
		System.out.println(website + " is travel website");
		System.out.print(des);
		
//----------arrays-----------
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,3,4,5,7,8,9};
		
		System.out.println(arr[0]);
		
// for loop
		for (int i=0;i<arr.length;i++)
		{
	System.out.println(arr[i]);
	
	for (int j=0;j<arr2.length;j++)
	{
		System.out.println(arr2[j]);
		
	}
		
		String[] name = {"nisha","thakur","selenum"};
		for (int k=0;k<name.length;k++)
		{
			System.out.println(name[k]);
			
		for(String s:name)	
		{
			System.out.println(s);
		}
		}	
		}	
	}

}
