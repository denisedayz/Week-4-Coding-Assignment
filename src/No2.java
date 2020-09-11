import java.util.HashSet;
import java.util.Set;

public class No2 {

	public static void main(String[] args) {

//an instance of a HashSet of Integer called ids
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(10);
		ids.add(9);
		ids.add(8);
		ids.add(7);
		ids.add(6);
		ids.add(5);
		
		System.out.println(ids);
		
		for (Integer id:ids) {
			System.out.println(id);
		}
		
	}

}
