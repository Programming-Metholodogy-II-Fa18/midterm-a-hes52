
public class sortMain 
{

	public static void main(String[] args) 
	{
		problem1 test= new problem1();
		int [] arr= {15,9,60,44,12,1,4};
		int [] temp= new int[arr.length];
		temp=test.examSort(arr, arr.length);
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
