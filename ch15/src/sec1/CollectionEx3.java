package sec1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEx3 {

	public static void main(String[] args) {
		Set set1 = new HashSet();		//=> new set 불가 인터페이스이기때문
		set1 = new TreeSet();
		
		HashSet set2 = new HashSet();	//=> set2 = new TreeSet(); 형변환이 힘듦
		
		
	}

}
