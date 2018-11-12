import java.util.*;
public class Pair<T1,T2>
{
	T1 x;
	T2 y;
	Pair(T1 x,T2 y)
	{
		this.x=x;
		this.y=y;
	}
	T1 getFirst()
	{
		return this.x;
	}
	T2 getSecond()
	{
		return this.y;
	}

}

