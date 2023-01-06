package session3;

public class FinalDemoOutput {
	final  int X;
	public FinalDemoOutput() {
		X=10;
	}

	public static void main(String[] args) {
		int Z,Y;
		Y=20;
		Z=0;
		FinalDemoOutput f=new FinalDemoOutput();
		Z=f.X+Y;
		System.out.println(Z);
		
		

	}

}
