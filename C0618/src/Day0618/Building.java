package Day0618;

import java.util.Random;

public class Building {
	private int floor;
	private String color;
	private int price;
	private String owner;
	
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	public String toString() {
		return "�ǹ�����: "+ floor+"��, �ǹ���: "+color+", �ǹ�����: "+price+"��"+", ������:"+owner;
	}
	public static String showWinner(Building myBuilding, Building yourBuilding) {
		int myNum = runDice();
		int yourNum = runDice();
		
		while(myNum == yourNum) {//����� �� �ٽ� ������
			myNum = runDice();
			yourNum = runDice();
		}
		
		System.out.println("�� �ֻ���: "+myNum);
		System.out.println("�� �ֻ���: "+yourNum);
		if(myNum > yourNum) {
			return myBuilding.owner;
		}else {
			return yourBuilding.owner;
		}
	}
	private static int runDice() {
		Random rand = new Random();
		return rand.nextInt(6)+1;
	}
	public static void main(String[] args) {
		Building myBuilding = new Building();
		myBuilding.setColor("�Ķ���");
		myBuilding.setFloor(20);
		myBuilding.setPrice(1000000);
		myBuilding.setOwner("��");
		
		Building yourBuilding = new Building();
		yourBuilding.setColor("�Ͼ��");
		yourBuilding.setFloor(15);
		yourBuilding.setPrice(500000);
		yourBuilding.setOwner("��");
		
		String winner = showWinner(myBuilding, yourBuilding);
		System.out.println("�¸���:" +winner);
		if(myBuilding.owner.equals(winner)) {//==�� ��� ������ �ּ� ������ �Բ� ����.
			yourBuilding.owner = winner;
		}else {
			myBuilding.owner = winner;
		}
		System.out.println("�ǹ��� "+winner+"���� �տ� �Ѿ���ϴ�.");
	}
	
}
