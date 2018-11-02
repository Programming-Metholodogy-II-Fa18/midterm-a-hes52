
public class Data 
{
	Node head;
	Node tail;
	int N;
	public Data()
	{
		head=null;
		tail=null;
		N=0;
	}
	public class Node
	{
		int val;
		Node next;
	}
	public void add(int add)
	{
		Node oldTail=tail;
		tail= new Node();
		tail.val=add;
		tail.next=null;
		if(N==0)
		{
			head=tail;
		}
		//oldTail.next=tail;
		N++;
	}
	public int remove()
	{
		if(head==null)
		{
			//throw new java.util.NullPointerException;
		}
		int oldHead=head.val;
		head=head.next;
		N--;
		return oldHead;
	}
	public int getValue(int index)
	{
		if(index>N)
		{
			return -1;
		}
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.val;
	}
}

