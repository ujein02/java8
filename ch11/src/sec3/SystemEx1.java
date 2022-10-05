package sec3;

public class SystemEx1 {
	public static void main(String[] args) {
		//보안 관리자 설정 : 특정 조건(값이 5일 때 종료)
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status){
				if(status != 5){
					throw new SecurityException();
				}
			}
		});
		//특정 조건에 따른 쓰레드 종료
		for(int i=0;i<10;i++){ //0~9
			System.out.println(i);
			try {
				System.exit(i); //System.exit() 시스템을 종료하는 메소드
			} catch(SecurityException e){
				//System.out.println("종료");
			}
		}
	}
}