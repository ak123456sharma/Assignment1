
public class Nulll {

	public static void doSomething(Float obj)
	{
	float fval = 10.0f;
	  System.out.println("Float called " + obj);
	}
	public static  void doSomething(Integer obj) {
	    System.out.println("Integer called");
	}
	public static void main(String[] args) {

	doSomething( (Integer) null);
	
	doSomething( (Float) null);
}
}
