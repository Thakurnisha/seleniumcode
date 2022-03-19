

public class MethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodsDemo1 d = new MethodsDemo1();
      String name = d.getData();
      System.out.println(name);
      MethodsDemo2 d2 = new MethodsDemo2();
      d2.getUser();
    
      getData2();
	}
	
	public String getData()
	{
	System.out.println("hello world");
	return "nisha";
	
	}
	public  static String getData2()
	{
	System.out.println("world");
	return "nisha";
	}
}


