package sec2;

public class Condition4 {
	public static void main(String[] args) {
		//점수를 입력받아 등급을 구하되, 90점 이상이면, "A", 80점 이상이면, "B",
		//70점 이상이면, "C", 60점 이상이면 "D", 그 밖의 점수는 "F"
		//상품은 등급이 "A"이면, "100년 묵은 산삼", "B" 이면, "한우갈비세트",
		//"C"이면, "백화점 상품권", "D"이면, "문화상품권"으로 하며, "F"는 "한입만" =>switch문 사용
/*		switch(기준변수) {
			case "값1":
				실행문1;
				break;
			case "값2":
				실행문2;
				break;
			...
			default:
				실행문n;
		}*/
		int jum = 84;
		String rank = "";
		if(jum>=90){
			rank = "A";
		} else if(jum>=80){
			rank = "B";
		} else if(jum>=70){
			rank = "C";
		} else if(jum>=60){
			rank = "D";
		} else {
			rank = "F";
		}
		 
		String goods = "";
		switch(rank){
			case "A":
				goods = "100년 묵은 산삼";
				break;
			case "B":
				goods = "한우갈비세트";
				break;
			case "C":
				goods = "백화점 상품권";
				break;
			case "D":
				goods = "문화상품권";	
				break;
			default:
				goods = "한입만";
		}
		System.out.println("당신의 점수는"+jum+"점이며, 등금은"+rank+"이고, 상품은"+goods+"입니다.");
		}

	}


