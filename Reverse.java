public class Reverse {
	public String stringReverse(String str) {
		StringBuilder temp = new StringBuilder();
		for(int i = str.length()-1; i >= 0; i--) {
			temp.append(str.charAt(i));
		}
		return temp.toString();
	}
	
	public boolean isPermutation(String a, String b) {
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i)== b.charAt(i))
					count += 1;
				}
		}
		if(count == a.length())
			return true;
		return false;
	}
	
	public String stringComp(String a) {
		if(a==null)
			return null;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length(); i++) {
			sb.append(a.charAt(i));
			int count = 1;
			while(i < a.length()-1 && a.charAt(i)==a.charAt(i+1)) {
				count += 1;
				i++;
			}
			sb.append(count);
		}
		return sb.toString();
	}
	public static void main(String args[]) {
		String a = "yee";
		String b = "eye";
		String c = "ramekin";
		System.out.println(new Reverse().stringComp(a));
		System.out.println(new Reverse().stringComp("a"));
		System.out.println(new Reverse().stringComp("aa"));
		System.out.println(new Reverse().stringComp("aab"));
		System.out.println(new Reverse().stringComp(null));
//		System.out.println(new Reverse().stringReverse(b));
//		System.out.println(new Reverse().stringReverse(c));
	}
}
