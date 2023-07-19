package ninteen;

class Stack<T>{
	T[] a ; 
	int index = -1 ; 
	// public Stack(T[] a) {this.a=a;}
	public MyStack(Doubl [] a) {super (a);}
	public boolean isEmpty()
	
	{
		return index ==-1 ; 
		
	}
	public boolean isFull()
	{
		return index == 9 ; 
	}
	
}
class MyStack<T> extends Stack<T>
{
	public MyStack(T[] a ) {super(a);}
	public void push(T element)
	{
		if(!isFull())
			a[++index] = element ; 
		else 
			throw new RuntimeException("Stack Overflow :- cannot insert more element");
		
	}
	// public T pop()
	public Double pop()
	{
		if(!isEmpty())
			return a[index--];
		throw new RuntimeException("Stack underflow :- cannot remove more element");
	}
	
	
}
public class Test4 {
public static void main(String[] args) {
	
//	MyStack<Integer> ms = new MyStack<Integer> (new Integer[10]);
	MyStack ms = new MyStack(new Double[10]);
	for(int i = 1 ; i<=10 ; i++)
		ms.push(i);
	for(int i=1 ; i<=10 ; i++)
		System.out.println(ms.pop());
}
}

// this sub  also becomes a generic class if extends a generic super class . 
