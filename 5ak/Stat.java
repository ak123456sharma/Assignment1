
public class Stat {
	static int j;
	int p;
	static {
		j=5;
		System.out.println("static block");
	}
	  Stat() {
		    System.out.println("Constructor method called.");
		  }
		 
		  public static void main(String[] args) {
		    Stat object = new Stat(); 
		  }

}
