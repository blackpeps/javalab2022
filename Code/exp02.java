import java.util.Scanner;
public class frequency {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		System.out.print("Enter the Character: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of occurance of "+ch+" is "+count);
	}
}
