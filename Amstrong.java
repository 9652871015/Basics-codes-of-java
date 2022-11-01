package sample;
public class Amstrong{
	public static void main(String[]args) {
		int num=153;
		int sum;
		int i=1;
		int n=0;
		 sum=0;
		i=num;
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i)
		{
			System.out.println("Amstrong number");
					}else {
						System.out.println("not Amstrong number");	
					}
	}
}