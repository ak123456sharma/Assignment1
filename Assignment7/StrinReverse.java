package as7;

public class StrinReverse {
	 public static void main(String[] args) {
	      String string = "abdfxy";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\n before "+string);
	      System.out.println(" after  "+reverse);
	   }
}
