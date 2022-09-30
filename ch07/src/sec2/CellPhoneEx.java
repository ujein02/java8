package sec2;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.powerOn();
		p1.bell();
		p1.handIn();
		p1.sendVoice("여보세요~!");
		p1.recieveVoice("저 김기태라고 하는데요~!");
		p1.hangOut();
		p1.powerOff();
				
				

	}

}
