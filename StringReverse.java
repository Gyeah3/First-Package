import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.next();
		String str1 = str;
		String reverse = reverse(str);
		System.out.println("Reverse of the string is: " + reverse);
		System.out.println("Is palindrome?: " + (str.equals(reverse)));
		System.out.println(reverse.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str == str1);
		scanner.close();
	}

	private static String reverse(String str) {
		char[] array = str.toCharArray();
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return new String(array);
	}
}