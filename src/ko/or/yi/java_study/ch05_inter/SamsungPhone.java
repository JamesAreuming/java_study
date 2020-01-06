package ko.or.yi.java_study.ch05_inter;

class SamsungPhone implements PhoneInterface {
	private String pName;
	private int pYear;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
