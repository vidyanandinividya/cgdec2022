package session5;

public class Airtel extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("connecting using Airtel way");
		
	}

	@Override
	public void destroyConnectionWithYourTower() {
		System.out.println("Disconnecting using Airtel way"); 
		
	}

}
