package session5;

public class Vodafone extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("connecting using Vodafone way");
		
	}

	@Override
	public void destroyConnectionWithYourTower() {
		System.out.println("Disconnecting using Vodafone way");
		
	}

}
