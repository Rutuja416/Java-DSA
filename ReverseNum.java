package rutuja;

public class ReverseNum {
public static void main(String[]args)
{
	int rev=0;
	int num=17352;
	while(num>0) {
		int rem=num%10;
		num=num/10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
}
}
