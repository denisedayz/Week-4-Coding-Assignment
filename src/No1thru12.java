
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class No1thru12 {

	public static void main(String[] args) {
		
		//#1: Create an instance of an ArrayList of String called employeeNames
				List<String> employeeNames = new ArrayList <String>();
		
		//#4a: Add at least five entries to the employeeNames 
				employeeNames.add("Sally");
				employeeNames.add("Beth");
				employeeNames.add("Robin");
				employeeNames.add("Sharon");
				employeeNames.add("Denise");
				employeeNames.add("Nic");
		
		//#2: Create an instance of a HashSet of Integer called ids		
				Set<Integer> ids = new HashSet<Integer>();
				
		//#4b: Add at least five entries to the ids
				ids.add(1);
				ids.add(2);
				ids.add(3);
				ids.add(4);
				ids.add(5);
				ids.add(6);
		
		//#3:Create an instance of a HashMap of Integer, String called employeeMap
				Map <Integer,String> employeeMap = new HashMap <Integer,String>();
		
		//#5: Iterate over ids to populate map with keys and values from ids and employeeNames
				int i = 0;
				
				for (Integer id:ids) {
					employeeMap.put(id, employeeNames.get(i++));
							}
		//#6: Iterate over employee Map keyset to print keys and values to console
				for (Integer key:employeeMap.keySet()) {
				System.out.println(key + "=" + employeeMap.get(key));
						
				}
		
		//#7: Create a StringBuilder called idsBuilder	
				StringBuilder idsBuilder = new StringBuilder ();
		
		//#8: Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder 
				for (Integer id:ids) {
				idsBuilder.append(id + "-");
				
				}
		//#9: Print the result of idsBuilder.toString() to the console
				System.out.println(idsBuilder.toString()); 
		
		//#10: Create another StringBuilder called namesBuilder
				StringBuilder namesBuilder = new StringBuilder ();
		
		//#11: Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder
				for (String name:employeeNames) {
					namesBuilder.append(name + " ");
				}
				
		//#12:Print the result of namesBuilder.toString() to the console
				System.out.println(namesBuilder.toString());
				
			

				


				
			}
}




