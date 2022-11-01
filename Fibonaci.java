package sample;

public class Fibonaci {//sum of preceding two numbers
	public static void main(String[] args) {
		int fn=0,sn = 1,result;
		int user=10;
		int count=0;
		while(true)
		{
		 result =fn+sn;
			count++;
		
		if (result>=user) 
		{
			break;
		}
			fn=sn;
			sn=result;
			System.out.println(result);
		} 
		}
	}

