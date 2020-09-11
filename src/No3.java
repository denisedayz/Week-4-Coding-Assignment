import java.util.HashMap;
import java.util.Map;

public class No3 {

	public static void main(String[] args) {

	//an instance of a HashMap of Integer, String called employeeMap
		
		Map <Integer,String> employeeMap = new HashMap <Integer,String>();
		employeeMap.put(1, "Evonne");
		employeeMap.put(2, "Cheri");
		employeeMap.put(3, "Edna");
		employeeMap.put(4, "Jenni");
		
		System.out.println(employeeMap);
		
	//use .get to access element in key 2
		System.out.println(employeeMap.get(2));
		 
	}

}
