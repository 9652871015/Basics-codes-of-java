package sample;
public class Strong{//Addition of factorial of each digit
	public static void main(String[]args) {
		int num =145;
		int i,p,r;
		int sum=0;
		int sn;
		sn=num;
		while(num!=0) {
			i=1;
			p=1;
			r=num%10;
			for(i=1;i<=r;i++)
			{
				p=p*i;
			}
			sum=sum+p;
			
			num=num/10;
		}
		if(sum==sn) {
			System.out.println(sn);
		}else {
		System.out.println("not strong");
		}
	}
}
