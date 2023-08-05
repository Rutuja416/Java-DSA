package rutuja;

public class Strong_num {
	public static void main(String[]args) {
		int num=145;
		int temp=num;
		
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
				
			}
			sum=sum+fact;
			//System.out.println(fact);
			num=num/10;
		}


		//System.out.println(sum);
		if(temp==sum) {
			System.out.println("The number is Strong number");
		}
		else {
			System.out.println("The number is not Strong number");
		}
	}
}
