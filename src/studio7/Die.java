package studio7;

public class Die {
	private int sides;

	
	public Die (int initsides)
	{
		sides = initsides;
	}
	
	public int throw1 (int sides) {
		return (int)Math.random()* sides + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
