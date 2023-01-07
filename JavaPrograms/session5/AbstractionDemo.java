package session5;

public class AbstractionDemo {

	public static void main(String[] args) {
		SMSSender airtel=new Airtel();
		airtel.senSMS();
		SMSSender vodafone=new Vodafone();
		vodafone.senSMS();

	}

}
