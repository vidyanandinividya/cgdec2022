package session6;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		try
		{
		calc.calculation();
		calc.checkNum(-12);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		

	}

}
