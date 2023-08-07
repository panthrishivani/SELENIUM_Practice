import java.util.ArrayList;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "Shivanipanthri";
		Scanner sc = new Scanner(System.in);
	    System.out.println("eneter therv string");
	     String s=sc.next();
	     
		
//		for(int i=0;i<s.length();i++){
//			char ch =s.charAt(i);
//			System.out.println(ch);
			ArrayList<Character>  a =new ArrayList<>();
			for(char c:s.toCharArray()) {
				a.add(c);
			}
//			System.out.println(a);
			ArrayList<Character>  b =new ArrayList<>();
			System.out.println(b);
			if(b.contains(a)==true) {
				System.out.println();
			}
			else {
				
			}
			
			
			
			
	}
}
	

	


