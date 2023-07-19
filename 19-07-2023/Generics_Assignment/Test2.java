package ninteen;

class TypeSaftyDemo
{
public static <T extends Number>double getAverage(T[] a)
{
double sum = 0.0 ; 
for(int i = 0 ; i<a.length;i++)
sum = sum +a[i].doubleValue() ;
return sum/a.length;
}
}
public class Test2 {
	public static void main(String[] args)
	{
	System.out.println(TypeSaftyDemo.getAverage(new Integer[] {10,20,30,40,50}));
		
	System.out.println(TypeSaftyDemo.getAverage(new Double[] {10.45, 20.32,30.56,40.56,50.32})); 
	}
	}


