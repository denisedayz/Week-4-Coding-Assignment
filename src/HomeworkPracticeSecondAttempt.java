import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeworkPracticeSecondAttempt {

	public static void main(String[] args) {

		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Chad");
		employeeNames.add("Rad");
		employeeNames.add("Tad");

		Set<Integer> ids = new HashSet<Integer>();
		ids.add(100);
		ids.add(200);
		ids.add(300);

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		int i = 0;

		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
			System.out.println(employeeMap);
		}

		for (Integer key : employeeMap.keySet()) {
			System.out.println(key + employeeMap.get(key));
		}

		for (Integer employee : employeeMap.keySet()) {
			System.out.println(employeeMap.get(employee));
		}

		for (Integer employee : employeeMap.keySet()) {
			System.out.println(employee + employeeMap.get(employee));
		}
		System.out.println(employeeMap);

	}

}
