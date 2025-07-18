package Package1;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNumber()>o2.getRollNumber())
			return 1;
		if(o1.getRollNumber()<o2.getRollNumber())
			return -1;
		return 0;
	}

}
