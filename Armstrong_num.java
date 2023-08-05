package rutuja;

public class Armstrong_num {
public static void main(String[]args) {
	int num=153;
	int temp=num;
	int temp1=num;
	int arm_add=0;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	//System.out.println(count);
		while(temp!=0) {
			int rem=temp%10;
			int arm_prod=1;
			for(int i=1;i<=count;i++) {
				arm_prod=arm_prod*rem;
			}
				temp=temp/10;
				arm_add=arm_add+arm_prod;
		}
	
		if(temp1==arm_add) {
			System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not armstrong number");
		}
}



	

}
