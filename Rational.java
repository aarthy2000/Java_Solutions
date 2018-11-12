import java.util.*;

public class Rational<T>
{
	T n,d;
	public Rational(T n,T d)
	{
		this.n=n;
		this.d=d;
	}
	public Rational()
	{
	}
	public Rational<T> add(Rational R2)
	{
		Rational r=new Rational();
		System.out.println("R2 numer");
		System.out.println(R2.getN());
		//r=this.n + R2.getN();
		r.d=this.d;
		return r;
	}
	public T getN()
	{
		return this.d;
	}
}

