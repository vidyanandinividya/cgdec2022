package session6;

public class Pizza {
	
	public interface IPizza
	{
		String getValue();
	}
	
	public enum PizzaStatus implements IPizza{
		ORDERED(1)
		{
			@Override
			public boolean isOrdered() {return true;}
		},
		READY(2){
			@Override
			public boolean isReady() {return true;}
		},DELIVERED(3){
			@Override
			public boolean isDelivered() {return true;} 
		};
		private int value;
		private PizzaStatus(int value)
		{
			this.value=value;
		}
		@Override
		public String getValue() {
			
			return "The value is:"+value;
		}
		public boolean isDelivered() {return false;}
		public boolean isReady() {return false;}
		public boolean isOrdered() {return false;}
	}

	
	public static void main(String[] args) {
		
		/*for(PizzaStatus pizzaStatus:PizzaStatus.values())
		{
			System.out.println(pizzaStatus.getValue());
		}
		
		PizzaStatus pizzaStatus=PizzaStatus.READY;
		//System.out.println(PizzaStatus.READY);
		for(PizzaStatus p:PizzaStatus.values())
		{
			System.out.println(p);
			System.out.println(p.value);
			
		}
		System.out.println(PizzaStatus.valueOf("READY")); //ENUM
		System.out.println(PizzaStatus.DELIVERED.toString());//string
		/*if(PizzaStatus.DELIVERED==pizzaStatus)
		{
			System.out.println("Pizza is ready");
		}
		else
		{
			System.out.println("Pizza is not ready");
		}*/
		/*switch(pizzaStatus)
		{
		case READY:
				System.out.println("pizza is ready");
				break;
		case DELIVERED:
				System.out.println("pizza is delivered");
				break;
		case ORDERED:
				System.out.println("Pizza order has been placed");
				break;*/
		
		}

	}


