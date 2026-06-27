import java.util.Scanner;
 
 
 
public class Main{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	while(true) {
    		n=n+1;
    		if(isdistinct(n)) {
    			System.out.println(n);
    			break;
    		}
    	}
    }
 
	private static boolean isdistinct(int n) {
		boolean[] arr=new boolean[10];
		while(n>0) {
			int last=n%10;
			if(arr[last]) {
				return false;
			}else {
				arr[last]=true;
			}
			n/=10;
		}
		return true;
	}
}
