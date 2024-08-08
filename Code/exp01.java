import java.util.Scanner;
public class string_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String strlwr = str.toLowerCase();
		int flag = 0, len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (strlwr.charAt(i) != strlwr.charAt(len - i - 1)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
