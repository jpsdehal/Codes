
public class Javatrainingbasic {
	public static int i = 20;
	public static int j = 30;
	
public static void main(String[] args) {
		
	
		while (i<=50)
		{
			System.out.println(i);
			i++;
			
		}
		System.out.println("the value of i after loop is : " + i);
		Javatrainingbasic obj = new Javatrainingbasic();
		obj.sum();
		String fulname = Classone.fullname("Banta", "Singh");
		System.out.println(fulname);
		
}
public  void sum()
{
	int c = i+j;
	System.out.println(c);
	
}

}
