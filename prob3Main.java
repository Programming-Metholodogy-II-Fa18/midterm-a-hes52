
public class prob3Main 
{

	public static void main(String[] args) 
	{
		probSolve test= new probSolve();
		int compares;
		int compares2;
		test.add(1);
		test.add(5);
		test.add(8);
		test.add(10);
		test.add(12);
		test.add(14);
		test.add(18);
		test.add(20);
		test.add(33);
		test.add(41);
		compares=test.search(8);
		System.out.println("Compares for 8: "+compares);
		compares2=test.search(33);
		System.out.println("Compares for 33: "+compares2);

	}

}
