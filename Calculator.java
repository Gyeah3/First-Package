public class Calculator {
	int answer;
	int a;
	int b;
	
	public void Add(int a, int b) {
		System.out.println("The answer is " +  a + b);
	}
	public void Sub(int a, int b) {
		System.out.println("The answer is " + (a - b));
	}
	public void Mul(int a, int b) {
		System.out.println("The answer is " + (a * b));
	}
	public int Div(int a, int b) {
		return answer = a / b;
	}
	public int Mod(int a, int b) {
		return answer = a % b;
	}
	public int Sqrt(int a) {
		return answer = Sqrt(a);
	}
	public void main(String[] args) {
		Add(2, 3);
		Sub(3, 6);
		Mul(100, 28756);
	}

}
