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
		return "건물층수: "+ floor+"층, 건물색: "+color+", 건물가격: "+price+"원"+", 소유주:"+owner;
	}
	public static String showWinner(Building myBuilding, Building yourBuilding) {
		int myNum = runDice();
		int yourNum = runDice();
		
		while(myNum == yourNum) {//비겼을 시 다시 돌리기
			myNum = runDice();
			yourNum = runDice();
		}
		
		System.out.println("내 주사위: "+myNum);
		System.out.println("너 주사위: "+yourNum);
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
		myBuilding.setColor("파란색");
		myBuilding.setFloor(20);
		myBuilding.setPrice(1000000);
		myBuilding.setOwner("나");
		
		Building yourBuilding = new Building();
		yourBuilding.setColor("하얀색");
		yourBuilding.setFloor(15);
		yourBuilding.setPrice(500000);
		yourBuilding.setOwner("너");
		
		String winner = showWinner(myBuilding, yourBuilding);
		System.out.println("승리자:" +winner);
		if(myBuilding.owner.equals(winner)) {//==의 경우 데이터 주소 값까지 함께 비교함.
			yourBuilding.owner = winner;
		}else {
			myBuilding.owner = winner;
		}
		System.out.println("건물이 "+winner+"님의 손에 넘어갔습니다.");
	}
	
}
