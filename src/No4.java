import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class No4 {

	public static void main(String[] args) {

		List<String> employeeNames = new ArrayList <String>();
		employeeNames.add("Sally");
		employeeNames.add("Beth");
		employeeNames.add("Robin");
		employeeNames.add("Sharon");
		employeeNames.add("Denise");
		employeeNames.add("Nic");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		ids.add(6);
		
		Map <Integer,String> employeeMap = new HashMap <Integer,String>();
			
		int i = 0;
		
		for (Integer id:ids) {
			employeeMap.put(id, employeeNames.get(i++));
			//i++;
			//i++ also works here. i = i++ doesn't work.
			//when using i=i++, you get the same name for every key, for every iteration (sally over and over)
			
		//System.out.println(employeeMap);
		//good through here
		}

		for (Integer key:employeeMap.keySet()) {
		System.out.println(key + "=" + employeeMap.get(key));
		//good through here	
				
		}
		
		StringBuilder idsBuilder = new StringBuilder ();
		
		for (Integer id:ids) {
		idsBuilder.append(id + "-");
		
		}
		System.out.println(idsBuilder); 
		//Is this answer to #9 or is there something else need to do?
		
		StringBuilder namesBuilder = new StringBuilder ();
		
		for (String name:employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
		
		//Is this answer to #12 or is there something else need to do?
		//What's difference between this and just printing out namesbuilder?


		


		
	}
}


