package session8;
@FunctionalInterface
interface MyInter1
{
	String greet(String s);
}
public class LambdaExpressionAccessibilityDemo {
	static String s2="Welcome";
	String s3;
	public LambdaExpressionAccessibilityDemo(String s3)
	{
		this.s3=s3;
	}
	void show()
	{
		MyInter1 g3=(str)->{return s3 + " ," + str;};
		System.out.println(g3.greet("vidya"));
	}
	public static void main(String[] args) {
		String s1="Hello";
		
		MyInter1 g1=(str)->{return s1 + " ," + str;};
		System.out.println(g1.greet("vidya"));
		MyInter1 g2=(str)->{return s2 + " ," + str;};
		System.out.println(g2.greet("vidya"));
		new LambdaExpressionAccessibilityDemo("Hi").show();

	}

}
