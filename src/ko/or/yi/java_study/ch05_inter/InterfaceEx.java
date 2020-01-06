package ko.or.yi.java_study.ch05_inter;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone =  new SamsungPhone();
		SamsungPhone gallexy10 = new SamsungPhone();
		PhoneInterface  gallexy11 = new SamsungPhone(); // PhoneInterface 부모클래스지 않나
		
		gallexy10.setpName("갤럭시10");
		gallexy10.setpYear(2019);
		
		gallexy11.printLogo(); // 동적바인딩
		gallexy11.receiveCall(); // 동적바인딩
		gallexy11.sendCall(); // 동적바인딩
		
		gallexy10.printLogo();
		gallexy10.receiveCall();
		gallexy10.sendCall();
	}
}
