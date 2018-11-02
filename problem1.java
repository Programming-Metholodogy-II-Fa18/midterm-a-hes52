
public class problem1 
{
	/*public int[] examSort(int[] a,int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i;j>size;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		return a;
	}*/
	public int[] examSort(int[] a,int size)
	{
		int min;
		for(int i=0;i<size;i++)
		{
			min=i;
			for(int j=i+1;j<size;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		return a;
		
	}
}
