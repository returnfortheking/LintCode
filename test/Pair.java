//import.
package test;

public class Pair<T>{
	private T one;
	private T two;
	public Pair()
	{
		one=null;
		two=null;
	}
	public Pair(T one,T two)
	{
		this.one=one;
		this.two=two;
	}
	public T getOne()
	{
		return one;
	}
	public T getTwo()
	{
		return two;
	}
	public void setOne(T Value)
	{
		one=Value;
	}
	public void setTwo(T Value)
	{
		two=Value;
	}
}
