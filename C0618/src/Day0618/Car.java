package Day0618;

import java.util.Calendar;

public class Car {
	//Ŭ������ �ʿ��� ������ ��� ������ field��� �Ѵ�.
	//car Ŭ������ ��� ������ ����,����,������ȣ�� field�� �����Ѵ�.
	
	
	//field�� ����ó�� �����ϰ� �ȴ�.
	//dataType fieldName
	
	//������?
	//������ '����' �� �ִ� ����
	String carType;
	String carColor;
	String carPlateNum;
	
	//Ŭ������ �ؾ��� �ൿ(���)�� method�� ����Ѵ�.
	//method �����ϱ�
	//returnType methodName(parameterType parameterName)
	
	//parameter�� ���� �޼ҵ�� �����ϴ�.
	//������ return type�� ���� �޼ҵ�� �Ұ����ϴ�.(������ ����)
	void startCar() {
		System.out.println("���� ���!");
	}
	
	void parkCar(){
		System.out.println("����");
	}
	
	public void setCarType(String myCarType) {
		this.carType = myCarType;
	}
	
	//method�� ���� �̸����� ����� �� �� �ִ�.(overload)
	//!!!��!!!!parameter type�� "�޶����߸�" �Ѵ�.
	public void startCar(String owner) {
		System.out.println(owner+"���� ������ ����մϴ�!");
	}
	
	//public void startCar(String carType) x
	//public String startCar(String carType) x
	
	//parameter type�� �޶����� return type�� ������� overloading�� �����ϴ�.
	
	//Access Modifier(���� ������)
	//Ŭ���� ������ field�� method�� ������ �����ϴ� ��ɾ�
	//4��
	//public > protected > default > private ������
	//�ܺο� ���ٱ����� ��������.
	
	//public -> ��𼭵� ���� ����
	//protected -> ��Ű�� ���� + ��� ���� class�� ���� ����
	//default -> ���� ��Ű�������� ���� ����(access modifier�� ���� �ʴ� ����� �⺻ ��)
	//private -> ����� class���� '��' ��� ����
	
	//������ ����ȭ -> ĸ��ȭ
	//������ ����ȭ��?
	//�ܺ� Ŭ�������� �ش� Ŭ������ ������ ������ �Ŀ� field�� ������� �������� ���ϵ��� �ϴ� ��
	//���� � ���α׷��� ���� ���� ������ ����ȭ�� �켱���Ѵ�.
	//������ ����ȭ ���:field�� �ܺο��� ���� �ʴ� method�� ���� private���� ���������Ѵ�.
	
	//ĸ��ȭ��?
	//private���� ���� ������ �� field�� ���� �޾ƿ��ų� �ֱ� ���� ����ϴ� ���
	//setter�� getter�� ������ �޼ҵ�� field�� ���� �����Ѵ�.
	//setter:field�� ���� �����ϴ� �뵵
	//		public void setFieldName(fieldDataType fieldName) {
	//			this.fieldName =fieldName;
	//		}
	//this��? �ش� field�� ��ġ�� �������ִ� ��
	//parameter�� �̸��� fieldName�̰�, field�� �̸��� fieldName�̱� ������
	//parameter�� ���� field�� �ֱ� ���ؼ��� this.�� ���ؼ� field�� �������ش�.
	
	//getter : field�� ���� �ҷ����� �뵵
	//  public fieldType getGoeldName() {
	//		return fieldName;
	// }
	// ��� getter�� return fieldName���� this.�� ���� �ʿ�� ������
	// �� �� ��Ȯ�ϰ� �ش� fieldName�� ��ü���� ���� ���� ����ϱ� ����
	// this.�� ���̴� ��찡 �ִ�.
	
	//�����ڶ�?
	//class ��ü�� new Class()�� �޸𸮿� Ȯ���� ��
	//field�� �� �����̳� Ư�� �ൿ�� �ؾ��� �� ������ش�.
	
	//������ �����ϱ�
	//�����ڴ� ()�� �پ method ó�� ��޵�����
	//�ٸ� method����� �ٸ��� returnType�� ���� �ʴ´�.
	public Car() {
		this.carColor = "red";
		this.carPlateNum = "01�� 0000";
		this.carType = "Ƽ��";
	}
	
	//�⺻ ������ vs parameter�� �ִ� ������
	//���� �ƹ��� �����ڸ� ������ ���� �ʴ´ٸ�
	//field�� �⺻��(���ڴ� 0, �������� null)�� �����ϴ�
	//�⺻ �����ڰ� ���������.
	
	//parameter�� �ִ� �������� ���
	//����� �Ǹ� �ڹٰ� ������ִ� �⺻ �����ڸ� ����� �� ���� �ȴ�.
	//ex) Scanner scan = new Scanner() -> x
	//	  Scanner scan = new Scanner(System.in) ->ok(System.in�̶�� parameter�� �̿��� ������)
	
	// ���� �⺻ �����ڿ� parameter�� �ִ� �����ڰ� ��� �ʿ��ϸ�
	// 2���� �� �����ؾ��Ѵ�.
	//parameter�� �ִ� �����ڴ� �Ϲ� method�� overloading ��Ģ�� ���󰣴�(parameter�� ������ �޶���Ѵ�.)
	public Car(String carType) {
		this.carType = carType;
		
	}
	//public Car(String carColor) -> �ȵ� �ֳ��� ���� �ִ� String carType��
	//�� �������� String carColor�� ������ ��ġ�� ����
	
	//�Ʒ��� parameter�� ������ �޶����� ������ �����ϴ�.
	public Car(String carType, String carColor) {
		this.carType = carType;
		this.carColor = carColor;
	}
	
	
	
	public static void main(String[] args) {
		//Ŭ���� ���� �����ϱ�
		//className variableName = new className();
		Car myCar = new Car();
		
		
		//class ������ ������ �Ǹ�
		//variableName. ~~���� class�� method�� field�� ������ �� �ִ�.
		
		myCar.startCar("���� ���");
		//method, field���й� :
		//()�� �� �ڿ� ������: method
		//�׳� �ƹ��͵� �Ⱥ�����: field
		
		//myCar.setCarType() = "Ƽ��"; --> �ȵ� -> ��? method�� �������, data�� �����ϴ� ������ �ƴϱ� �����̴�.
		//--> �� myCar.setCarType("Ƽ��");�� �Ǿ�� �Ѵ�.
		
		
		//static�̶�?
		//Ŭ���� ���� ���� ����(new ��ɾ ���� heap �޸𸮿� ���� �ʰ�)
		//method �޸� ������ �ڸ��� Ȯ���ϴ� ��
		//ex)Car.main(args) ȣ�� ����
		
		//�ڹٿ��� 3���� ��ǥ���� �޸� ������ �ִ�.
		//stack, heap, method
		//stack: �⺻ ������ Ÿ�Ե�(byte short int long double float boolean char)����
		//heap : new�� ���� ������ ������ Ÿ�Ե�(class,�迭,interface)
		//method : static�� ���� method or field
		
		//����:Calendar Ŭ���� �� getInstance()�� ����ƽ�̱� ������
		//Calendar ��ü�� ������ �ʾƵ� getInstance()�޼ҵ�� ȣ���� �����ϴ�.
		System.out.println(Calendar.getInstance());
	}
}
