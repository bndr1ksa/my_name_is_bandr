package lol;
import java.util.Scanner;
public class lk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] m = {1,2,3,4,5};
		
		
		Scanner input=new Scanner(System.in);
		String text1=input.nextLine();
	
		System.out.println("عدد الكلمات "+countB(text1));
			System.out.println("عدد الحروف "+countC(text1));
	}



public static int countB(String s) {
	int c=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ')
			c++;
	}
	return c+1;
	
}

public static int countC(String s) {
	int c=0;
	for(int i=0;i<s.length();i++){
		if(!(s.charAt(i)==','||s.charAt(i)==' '))
			c++;
	}
	return c;
	
	
	
	
	
	
}

}
