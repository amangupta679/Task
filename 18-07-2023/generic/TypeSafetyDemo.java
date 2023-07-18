package eighteenjuly;

public class TypeSafetyDemo<T,U> {
	T obj1; 
	U obj2 ; 
	public TypeSafetyDemo(T obj1 , U obj2) {
		this.obj1 = obj1 ; 
		this.obj2 = obj2 ; 
		
	}
	public T getObj1()
	{
		return obj1;
	}
	public U getObj2() {
		return obj2 ; 
	}
}
class Test2{
	public static void main(String[] args) {
		TypeSafetyDemo<String,Employee> ts = new TypeSafetyDemo<String, Employee>("Marketing", new Employee(104,"dk",75000));
		System.out.println(ts.getObj1()+ " "+ ts.getObj2());
	
	}
	
}
