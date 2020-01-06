package kr.or.yi.java_study.ch04;

public class Ch04Main {

	public static void main(String[] args) {
		//ch04_01();
		//ch04_02();
		//ch04_03();
		//ch04_04();	
		//ch04_05();
	}

	public static void ch04_05() {
		Book book1 = new Book();
		System.out.println(book1);
	}

	public static void ch04_04() {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);
		
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		ob1.setRadius(4);
		ob1.setRadius(5);
		ob1.setRadius(6);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

	public static void ch04_03() {
		Book 권수진자서전 = new Book(); //The constructor Book() is undefined : 정의되지 않았다.
		Book littlePrince = new Book("어린왕자","생택취베리");
		Book loveStory = new Book("춘향전");
		
		System.out.printf("%s + %s %n",littlePrince.title,littlePrince.author);
		System.out.printf("%s + %s %n",loveStory.title,loveStory.author);
		
		System.out.println(littlePrince);//kr.or.yi.java_study.ch04.Book@4aa298b7  --> toString : Book [title=어린왕자, author=생택취베리]
		System.out.println(loveStory);//kr.or.yi.java_study.ch04.Book@7d4991ad  --> toString : Book [title=춘향전, author=작자미상]
	}

	public static void ch04_02() {
		Rectangle rect = new Rectangle(); // default 생성자
		rect.width = 4;
		rect.height = 5;

		System.out.printf("사각형의 면적은 %d %n",rect.getArea());

		Rectangle rect1 = new Rectangle(10,15);

		System.out.printf("사각형의 면적은 %d %n",rect1.getArea());
	}

	public static void ch04_01() {
		Circle c1 = new Circle(); // c1의 타입이 Circle
		c1.name = "고르곤졸라";
		c1.radius = 100;
		//System.out.printf("이름 : %s 반지름 : %d  면적 %.2f %n",c1.name,c1.radius,c1.getArea());
		System.out.println(c1); // c1이 참조변수라면 to String 호출


		Object c2 = new Circle(); // c2는 object 입장에서 보겠다
		((Circle)c2).name = "페퍼로니"; // object입장에서보기때문에 보이지 않음, 타입캐스트 해야 name이 보임, 괄호가 우선순위가 더 높음
		((Circle)c2).radius = 50;
		//System.out.printf("이름 : %s 반지름 : %d 면적 %.2f %n",((Circle)c2).name,((Circle)c2).radius,((Circle)c2).getArea());
		System.out.println(c2);

		Circle c3 = new Circle(30, "시카고피자"); // 생성자 오버로딩  // 오버라이드 : 재정의 & 오버로드 : 중복
		System.out.println(c3);

		Circle c4 = new Circle("부침개");
		System.out.println(c4);
	}

}
