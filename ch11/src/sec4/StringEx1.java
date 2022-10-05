package sec4;
// String 클래스에 속하는 메서드
public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("KimGiTae");
		//b201
		System.out.println("str1="+str1);
		System.out.println("네 번째 글자 : "+str1.charAt(3)); //※ 해당 인덱스에 위치한 문자
		System.out.println("문자열 비교 : "+str1.equals("kimkitae"));
		
		byte[] char1 = str1.getBytes();  //문자열을 한 글자씩 바이트 단위로 분리
		System.out.print("char1은 문자열을 한 글자씩 분리 : ");
		charPrint(char1);
		int a = (char) str1.indexOf("i"); //※해당 문자를 찾기
		System.out.println("i는 몇 번째 ? "+a);	//중복이 될 경우 가장 먼저 찾은 문자의 위치
		String data = str1.substring(3, 5);  //※
		System.out.println("인덱스가 3부터 5전 까지 : "+data);
		System.out.println("소문자로 : "+str1.toLowerCase());
		System.out.println("대문자로 : "+str1.toUpperCase());
		String name = "   My name is Kitae, Kim   ";
		System.out.println("글자수 : "+name.length());
		System.out.println("공백 제거 전 : "+name);
		System.out.println("공백 제거 후 : "+name.trim()
				+", 문자 수 : "+name.trim().length());
		int b = 1004;
		System.out.println(String.valueOf(b)+1004);  //문자열로 형변환
		System.out.println();
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(b));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(b));
		System.out.println("16진수로 변환 : "+Integer.toHexString(b));
		System.out.println();
		String c1 = "1111101100";
		String c2 = "1754";
		String c3 = "3ec";
		System.out.println("10진수로 변환 : "+Integer.valueOf(c1, 2));
		System.out.println("10진수로 변환 : "+Integer.valueOf(c2, 8));
		System.out.println("10진수로 변환 : "+Integer.valueOf(c3, 16));
		String str2 = str1.replace("K", "L");
		System.out.println("name2 : "+str2);
		String str3 = str1.replace("Kim", "Lee");
		System.out.println("name3 : "+str3);
	}
	static void charPrint(byte[] data){
		for(int i=0;i<data.length;i++){
			char a = (char) data[i];
			System.out.print(a);
		}
		System.out.println();
	}
}