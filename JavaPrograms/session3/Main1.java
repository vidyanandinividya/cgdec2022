package session3;

class Cube
{
	public Cube()
	{
		System.out.println("Cube is instantiated");
	}
}
public class Main1 {

	public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException {
		
		Class obj=Class.forName("Cube");
		Cube cube=(Cube)obj.newInstance();

	}

}
