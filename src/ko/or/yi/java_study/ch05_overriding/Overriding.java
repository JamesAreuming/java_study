package ko.or.yi.java_study.ch05_overriding;

public class Overriding {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire()); // 1
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 "+weapon.fire()); // 10 : 동적바인딩
	}

}
