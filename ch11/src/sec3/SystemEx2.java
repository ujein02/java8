package sec3;

import sec2.Student;

public class SystemEx2 {
	public static void main(String[] args) {
		Student st;
		st = new Student(1, "남송윤");  //쓰레기1
		st = null;		
		st = new Student();	//쓰레기2
		st = new Student(2, "김기태");
		
		System.out.println(st.sno+", "+st.sname);
		System.gc();  //Garbage Collection
	}
}