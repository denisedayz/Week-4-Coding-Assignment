import java.util.ArrayList;
import java.util.List;

public class No1 {

	public static void main(String[] args) {

	//an instance of an ArrayList of String called employeeNames
		
		List<String> employeeNames = new ArrayList <String>();
		employeeNames.add("Sally");
		employeeNames.add("Beth");
		employeeNames.add("Robin");
		
		System.out.println(employeeNames);
		
		for (int i = 0; i<employeeNames.size(); i++) {
			System.out.println((employeeNames.get(i)));
			
		}
		
	}

}
