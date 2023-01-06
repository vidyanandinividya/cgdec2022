package session2;
/**
 * 
 * @author bramhavidyamishra
 *
 */
public class MethodDemo {
	//Driver method
	public static void main(String[] args) {
		MethodDemo obj=new MethodDemo();
		//calling the method
		System.out.println(obj.add(10,30));
		System.out.println(mul(2,8));
		sub(10,4);
		

	}
	//Declaring method to add two numbers
	public int add(int num1,int num2)
	{
		/**
		 * This method calculates the sum of two integers
		 * @param num1 This is the first parameter to add() method
		 * @param num2 This is the second parameter to add() method
		 */
		return num1+num2;
	}
	//Declaring method to multiply two numbers
	public static int mul(int num1,int num2)
	{
		/**
		 * This method calculates the sum of two integers
		 * @param num1 This is the first parameter to mul() method
		 * @param num2 This is the second parameter to mul() method
		 */
		return num1*num2;
	}
	//Declaring method to substract two numbers
	public static void sub(int num1,int num2)
	{
		System.out.println(num1-num2);
	}
}
