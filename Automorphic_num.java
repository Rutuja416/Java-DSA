package rutuja;

public class Automorphic_num {
public static void main(String[]args) {
	int num=25;
	int temp=num;
	int sqr=num*num;
	int count=0;
	int rev=0;
	int rev1=0;
	while(num!=0) {
		count++;
		num=num/10;
	}
	
	for(int i=1;i<=count;i++) {
		int rem=sqr%10;
		rev=rev*10+rem;
		sqr=sqr/10;
	}
	while(rev!=0) {
		int rem1=rev%10;
		rev1=rev1*10+rem1;
		rev=rev/10;
	}
	if(temp==rev1) {
		System.out.println("The number is automorphic");
	}
	else {
		System.out.println("The number is not automorphic");
	}
}
}
