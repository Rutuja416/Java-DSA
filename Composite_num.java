package rutuja;

public class Composite_num {
public static void main(String[]args) {
	int num=6;
	//int fact=0;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count=count++;
		}
		
	}
	if(count>2) {
		System.out.println(num + "is a composite number");
	}
	else{
		System.out.println(num + "is not composite number");
	}
}
}
