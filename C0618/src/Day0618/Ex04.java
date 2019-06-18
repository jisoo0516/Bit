package Day0618;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int i = sc.nextInt();
		sc.nextLine();//버퍼메모리에 저장된 엔터를 없애줘야 함. 그래야 다음에 String 사용 가능.
		
		System.out.println("스트링을 입력하세요:");
		String str = sc.nextLine();
		
		System.out.print("\n");
		sc.close();
		System.out.println("프로그램 끝!");
		
		
		
		// 
		
		
		
		
		
		
		
	}
}
