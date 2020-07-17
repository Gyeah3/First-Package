
public class uniqueChar {
	public boolean findUniqueChar(String str) {
		if(str.length() < 1) {
			System.out.println("This string is invalid");
		}
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j  = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count += 1;
			}
		}
		if(count > 0)
			return false;
		return true;
	}
	
	public static void main(String args[]) {
		String a = "apple";
		String b = "";
		System.out.println(new uniqueChar().findUniqueChar(a));
		System.out.println(new uniqueChar().findUniqueChar(b));
				
	}
}
