package studio7;

public class Die {
	private int sides;
	// constructor
	public Die(int n) {
		sides = n;
	}
	public int roll() {
		return (int) (Math.random()*(sides)+1);
	}
	public static void main(String[] args) {
		Die test = new Die(10);
		System.out.println(test.roll());
	}
}
