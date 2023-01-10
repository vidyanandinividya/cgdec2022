package session7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("Apple", 100);
		map.put("Orange", 70);
		map.put("Banana", 50);
		System.out.println(map);
		for(HashMap.Entry<String, Integer> m:map.entrySet())
		{
			System.out.println("Key: "+m.getKey()+ 
					" Value: "+m.getValue());
		}

	}

}
