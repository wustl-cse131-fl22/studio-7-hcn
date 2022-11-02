package studio7;

public class Fraction {
	private int num;
	private int deno;

	
	public Fraction (int initnum, int initdeno)
	{
		num = initnum;
		deno = initdeno;
	}
	
	public double sum (Fraction p1, Fraction p2) {
		
		return (double) p1.num / p1.deno + (double) p2.num / p2.deno;
	}
	
	public double product (Fraction p1, Fraction p2) {
		
		return (double) p1.num / p1.deno * (double) p2.num / p2.deno;
	}
	
	public double reciprocal (int num, int deno) {
		
		return deno/num;//
	}
	
	public int simplify (int num, int deno) {
		if (num/deno ==0 || deno/num ==0) {
			int a = num/deno;
		}
		return deno/num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
