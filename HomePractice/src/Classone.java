
public class Classone {

	public static void main(String[] args) {
		
		Javatrainingbasic obj = new Javatrainingbasic();
		obj.sum();
		String myname = Classone.fullname("Jassi","Singh");
		System.out.println(myname);
		}
public static String fullname(String first, String last){
	String name = first +" "+ last;
	return name;
	}
}
