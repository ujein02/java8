package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int clacTot = 0;
	int calcAvg = 0;
	
	
	public Student() { }
	public Student(String name){this.name = name;}
	public Student(String name, int kor, int eng, int mat){
		this.name = name; 
		this.kor = kor; 
		this.eng = eng; 
		this.mat = mat;
	}
	public int calcTot(){
		return kor + eng + mat;
	}
	
	public double calcAvg(){
		return (double) (kor+eng+mat)/3;
	}
	
	public String calcHak(){
		String hak = "";
		double avg = this.calcAvg();
			if(avg>=90){
				hak="A";
			} else if(avg>=80){
				hak="B";
			} else if(avg>=70){
				hak="C";
			} else {
				hak="D";
			}
			return hak;
		
	}
				
	
		
	}


