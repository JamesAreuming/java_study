package ko.or.yi.java_study.ch05_overriding;

class Cannon extends Weapon { //Weapon 상속

	@Override
	protected int fire() {
		return 10; // 대포
	}
	
}
