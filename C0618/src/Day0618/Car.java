package Day0618;

import java.util.Calendar;

public class Car {
	//클래스의 필요한 정보를 담는 공간을 field라고 한다.
	//car 클래스의 경우 차량의 종류,색상,차량번호를 field로 지정한다.
	
	
	//field는 변수처럼 선언하게 된다.
	//dataType fieldName
	
	//변수란?
	//내용이 '변할' 수 있는 공간
	String carType;
	String carColor;
	String carPlateNum;
	
	//클래스가 해야할 행동(기능)은 method가 담당한다.
	//method 선언하기
	//returnType methodName(parameterType parameterName)
	
	//parameter가 없는 메소드는 가능하다.
	//하지만 return type이 없는 메소드는 불가능하다.(생성자 빼고)
	void startCar() {
		System.out.println("차량 출발!");
	}
	
	void parkCar(){
		System.out.println("주차");
	}
	
	public void setCarType(String myCarType) {
		this.carType = myCarType;
	}
	
	//method는 같은 이름으로 만들어 줄 수 있다.(overload)
	//!!!단!!!!parameter type이 "달라져야만" 한다.
	public void startCar(String owner) {
		System.out.println(owner+"님의 차량이 출발합니다!");
	}
	
	//public void startCar(String carType) x
	//public String startCar(String carType) x
	
	//parameter type이 달라지면 return type과 상관없이 overloading이 가능하다.
	
	//Access Modifier(접근 제한자)
	//클래스 내부의 field나 method의 접근을 제한하는 명령어
	//4개
	//public > protected > default > private 순으로
	//외부에 접근권한이 많아진다.
	
	//public -> 어디서든 접근 가능
	//protected -> 패키지 내부 + 상속 받은 class만 접근 가능
	//default -> 내부 패키지에서만 접근 가능(access modifier를 적지 않는 경우의 기본 값)
	//private -> 선언된 class에서 '만' 사용 가능
	
	//데이터 은닉화 -> 캡슐화
	//데이터 은닉화란?
	//외부 클래스에서 해당 클래스를 변수로 선언한 후에 field에 마음대로 접근하지 못하도록 하는 것
	//현재 어떤 프로그래밍 언어던 간에 데이터 은닉화를 우선시한다.
	//데이터 은닉화 방법:field나 외부에서 쓰지 않는 method를 전부 private으로 접근제한한다.
	
	//캡슐화란?
	//private으로 접근 제한이 된 field의 값을 받아오거나 넣기 위해 사용하는 방법
	//setter와 getter란 종류의 메소드로 field의 값을 제어한다.
	//setter:field에 값을 저장하는 용도
	//		public void setFieldName(fieldDataType fieldName) {
	//			this.fieldName =fieldName;
	//		}
	//this란? 해당 field의 위치를 지정해주는 것
	//parameter의 이름도 fieldName이고, field의 이름도 fieldName이기 때문에
	//parameter의 값을 field에 넣기 위해서는 this.을 통해서 field를 지정해준다.
	
	//getter : field의 값을 불러오는 용도
	//  public fieldType getGoeldName() {
	//		return fieldName;
	// }
	// 사실 getter의 return fieldName에는 this.이 붙을 필요는 없지만
	// 좀 더 명확하게 해당 fieldName이 객체에서 나온 것을 명시하기 위해
	// this.을 붙이는 경우가 있다.
	
	//생성자란?
	//class 객체가 new Class()로 메모리에 확보될 때
	//field의 값 설정이나 특정 행동을 해야할 때 만들어준다.
	
	//생성자 선언하기
	//생성자는 ()가 붙어서 method 처럼 취급되지만
	//다른 method들과는 다르게 returnType이 붙지 않는다.
	public Car() {
		this.carColor = "red";
		this.carPlateNum = "01가 0000";
		this.carType = "티코";
	}
	
	//기본 생성자 vs parameter가 있는 생성자
	//만약 아무런 생성자를 선언을 하지 않는다면
	//field를 기본값(숫자는 0, 참조형은 null)로 생성하는
	//기본 생성자가 만들어진다.
	
	//parameter가 있는 생성자의 경우
	//만들게 되면 자바가 만들어주는 기본 생성자를 사용할 수 없게 된다.
	//ex) Scanner scan = new Scanner() -> x
	//	  Scanner scan = new Scanner(System.in) ->ok(System.in이라는 parameter를 이용한 생성자)
	
	// 만약 기본 생성자와 parameter가 있는 생성자가 모두 필요하면
	// 2종류 다 정의해야한다.
	//parameter가 있는 생성자는 일반 method의 overloading 규칙을 따라간다(parameter의 내용은 달라야한다.)
	public Car(String carType) {
		this.carType = carType;
		
	}
	//public Car(String carColor) -> 안됨 왜내면 위에 있는 String carType과
	//이 생성자의 String carColor의 내용이 겹치기 때문
	
	//아래는 parameter의 내용이 달라지기 때문에 가능하다.
	public Car(String carType, String carColor) {
		this.carType = carType;
		this.carColor = carColor;
	}
	
	
	
	public static void main(String[] args) {
		//클래스 변수 선언하기
		//className variableName = new className();
		Car myCar = new Car();
		
		
		//class 변수가 선언이 되면
		//variableName. ~~으로 class의 method나 field에 접근할 수 있다.
		
		myCar.startCar("엔초 페라리");
		//method, field구분법 :
		//()가 맨 뒤에 붙으면: method
		//그냥 아무것도 안붙으면: field
		
		//myCar.setCarType() = "티코"; --> 안돼 -> 왜? method는 기능이지, data를 저장하는 공간이 아니기 때문이다.
		//--> 즉 myCar.setCarType("티코");가 되어야 한다.
		
		
		//static이란?
		//클래스 변수 선언 없이(new 명령어를 통한 heap 메모리에 넣지 않고)
		//method 메모리 영역에 자리를 확보하는 것
		//ex)Car.main(args) 호출 가능
		
		//자바에는 3가지 대표적인 메모리 영역이 있다.
		//stack, heap, method
		//stack: 기본 데이터 타입들(byte short int long double float boolean char)변수
		//heap : new가 들어가는 참조형 데이터 타입들(class,배열,interface)
		//method : static이 들어가는 method or field
		
		//예시:Calendar 클래스 중 getInstance()는 스태틱이기 때문에
		//Calendar 객체를 만들지 않아도 getInstance()메소드는 호출이 가능하다.
		System.out.println(Calendar.getInstance());
	}
}
