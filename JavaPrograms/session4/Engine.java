package session4;

public class Engine  extends Part{
	private String engineType;

	public Engine(String engineType,String identifier, String manufacturer, String description) {
		super(identifier, manufacturer, description);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nEngine [engineType=" + engineType + "]";
	}
	public void fn2()
	{
		super.fn1();
		System.out.println("Engine Class");
	
	}
	

	
	
}
