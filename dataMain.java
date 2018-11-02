
public class dataMain {

	public static void main(String[] args) 
	{
		Data test=new Data();
		test.add(1);
		test.add(9);
		test.add(4);
		test.add(5);
		test.add(10);
		test.add(0);
		int x=test.getValue(0);
		System.out.println("Get index 0: "+x);
		int y=test.getValue(3);
		System.out.println("Get index 3: "+y);
	}

}
