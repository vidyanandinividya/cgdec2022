package session3;

public class Car{
	//declaration of attributes
    private String modelName;
    private String owner;
    private int regNumber;
    
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	
	public Car(String modelName, String owner, int regNumber) {
		this.modelName = modelName;
		this.owner = owner;
		this.regNumber = regNumber;
	}
	//declaration of public methods
    public void startEngine()
    {
        System.out.println("Start the engine");
    }
    public void accelerate()
    {
        System.out.println("car is accelerating");
    }
    public void stop()
    {
        System.out.println("Stop the car");
    }
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", owner=" + owner + ", regNumber=" + regNumber + "]";
	}
    
}
