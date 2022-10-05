package sec3;

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {
	public static void main(String[] args) {
		System.out.println("운영체제 : "+System.getProperty("os.name"));
		System.out.println("사용자 : "+System.getProperty("user.name"));
		System.out.println("사용자 디렉토리 : "+System.getProperty("user.home"));
		System.out.println("자바 버전 : "+System.getProperty("java.version"));
		System.out.println("자바 홈 : "+System.getProperty("java.home"));
		
		Properties props = System.getProperties();  //해당 항목(키)를 뽑아 저장
		Set keys = props.keySet();  //항목들을 집합으로 별도로 저장
		for(Object objKey : keys){
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"] : "+value);
		}
		System.out.println("환경변수 JAVA_HOME : "+System.getenv("JAVA_HOME"));
	}
}