package queues;

public class QueueUsingArray {

	private int data[];
	private int front;//index of element at front of the queue
	private int rear;//index of element at front of the queue
	private int size;
	
	public QueueUsingArray()
	{
		data=new int[5];
		front=-1;	
		rear=-1;
		
		
	}
	/*
	public QueueUsingArray( int capacity)
	{
		data=new int[5];
		front=-1;	
		rear=-1;
		
		
	}* user will define the size*/
	
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void enqueue(int elem) throws QueueFullException
	{
		if(size==data.length)
		{
			throw new QueueFullException();
		}
		if(size==0 || front==-1)
		{
			front=0;
		}
//		rear++;
//		if(rear==data.length)
//		{
//			rear=0;
//		}
		rear=(rear+1)%data.length;
		data[rear]=elem;
		size++;
		
	}
	public int front() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
			
		}
		return data[front];
	}
	public int dequeue() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
			
		}
		int temp=data[front];
//		front++;
//		if(front==data.length)
//		{
//			front=0;
//		}
		front=(front+1)%data.length;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return temp;
	}
}
