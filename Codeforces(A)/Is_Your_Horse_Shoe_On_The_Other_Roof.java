
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int count=0;
    	int s1=sc.nextInt();
    	int s2=sc.nextInt();
    	if(s2==s1) {
    		count++;
    	}
    	int s3=sc.nextInt();
    	if(s3==s1 || s3==s2) {
    		count++;
    	}
    	int s4=sc.nextInt();
    	if(s4==s1 || s4==s2 || s4==s3) {
    		count++;
    	}
    	System.out.println(count);
    	
    }
}
