package pack;

public class Assigment2 {
	
	public int sum (int a, int b)
	{
		int c=a+b;
		return c;	
	}
	
	public int sub (int a, int b)
	{
		int d=a-b;
		return d;	
	}
	
	public int div (int a, int b)
	{
		int e=a/b;
		return e;	
	}
	public int mul (int a, int b)
	{
		int f=a*b;
		return f;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assigment2 cal=new Assigment2();
		int result = cal.div(10, 2);
		int result2 = cal.sub(result, 2);
		//System.out.println(result2);
		int result3 = cal.sum(result2, 2);
		int result4 = cal.sub(result3, 2);
		int result5 = cal.mul(result4, 2);
		
		
		int res = cal.sum(10, 2);
		int res1 = cal.sum(res, 2);
		int res2 = cal.sub(res1, 2);
		int res3 = cal.mul(res2, 2);
		int res4 = cal.div(res3, 2);
		
		System.out.println("Result of (((((10+2)+2)-2)*2)/2) is:" +res4);
		System.out.println("Result of (((((10/2)-2)+2)-2)*2) is :" +result5);
		
		
		
	}

}
