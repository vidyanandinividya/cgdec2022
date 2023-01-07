package session5;

public abstract class SMSSender {
	abstract public void establishConnectionWithYourTower() ;
    abstract public void destroyConnectionWithYourTower();
    public void checkForDND() 
    {
        System.out.println("check for number present in DND");
    }
    public void checkForTelecomRules() 
    {
        System.out.println("check for Telecom Rules");
    }
    public void senSMS()
    {
        establishConnectionWithYourTower();
        checkForDND();
        checkForTelecomRules();
        System.out.println("sending SMS to numbers");
        destroyConnectionWithYourTower();
    }

}
