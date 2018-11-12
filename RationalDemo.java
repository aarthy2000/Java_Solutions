import java.util.*;
public class RationalDemo{
	public static void main(String[] args)
	{
		Rational<Integer> n=new Rational<>(10,5);
		Rational<Integer> l=new Rational<>(15,5);
		Rational<Integer> r=new Rational<>(3,4);
		r=n.add(l);
		System.out.println(r.n);
		System.out.println(r.d);
	}
}
