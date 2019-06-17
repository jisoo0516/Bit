package Star;

public class Problem1 {

	public static void main(String[] args) {

//문제1]

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//문제2]
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//문제3]		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

//문제4] 

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int a = 1; a <= 6 - i; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("=========String이용해서 4번 출력=========");

		for (int i = 1; i <= 5; i++) {
			String singleLine = "";
			for (int j = 1; j <= i - 1; j++) {
				singleLine += " ";
			}
			for (int j = i; j <= 5; j++) {
				singleLine += "*";
			}
			System.out.println(singleLine);
		}

//문제5]	

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

//문제6] 

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int a = 1; a <= (2 * i) - 1; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

//문제7]

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("==========문제 7 강사님 풀이=========");

		for (int i = 1; i <= 5 * 2 - 1; i++) {
			if (i <= 5) {
				// 윗부분 출력
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				// 아랫부분 출력
				int lowerNum = i - 5;
				for (int j = 1; j <= 5 - lowerNum; j++) {
					System.out.print("*");
				}

			}
			System.out.println();
		}

//문제8]	

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int a = 1; a <= 6 - i; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("==========문제 8 강사님 풀이=========");

		for (int i = 1; i <= 5 * 2 - 1; i++) {
			if (i <= 5) {
				// 윗부분 출력
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				// 아랫부분 출력
				int lowerNum = i - 5;
				for (int j = 1; j <= lowerNum; j++) {
					System.out.print(" ");
				}
				for (int j = lowerNum; j < 5; j++) {
					System.out.print("*");
				}

			}
			System.out.println();
		}

//문제9]

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int a = 1; a <= (2 * i) - 1; a++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("==========문제 9 강사님 풀이=========");

		for (int i = 1; i <= 5 * 2 - 1; i++) {
			if (i <= 5) {
				for (int j = i; j < 5; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {
				int lowerNum = i - 5;
				for (int j = 1; j <= lowerNum; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * (5 - lowerNum) - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

//문제10]

		for(int i=1; i<=5*2-1; i++) {
			if(i==1 || i== 5*2-1) {
				for(int j=1; j <=5*2-1; j++) {
					System.out.print("*");
				}
			}else if(i <=5) {
				//j=1; j<=5-i+1; j++
				//upperI =i-1;
				int upperI=i-1;
				for(int j=1; j<=5-upperI; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=2*upperI-1; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=5-upperI; j++) {
					System.out.print("*");
				}
				}else {
					int lowerI = i-5+1;
					for(int j=1; j<=lowerI; j++) {
						System.out.print("*");
					}
					for(int j=1; j<=2*(5-lowerI)-1; j++) {
						System.out.print(" ");
					}
					for(int j=1; j<=lowerI; j++) {
						System.out.print("*");
					}
				}
			
			
			
			System.out.println();
		}
		
		
		
		
//문제11]
		System.out.println();
		for(int i=1; i<=5*2-1; i++) {
			if(i<=4) {
				int upperI = i;
				for(int j=1; j<=upperI; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=2*(5-upperI)-1; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=upperI; j++) {
					System.out.print("*");
				}
				
				
			}else if(i==5) {
				for(int j=1; j<=5*2-1; j++) {
					System.out.print("*");
				}
			}else {
				int lowerI=i-5;
				for(int j=1; j<=5-lowerI; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=2*lowerI-1; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=5-lowerI; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
//문제12]
		System.out.println();
		
		for(int i=1; i<=12; i++) {
			if(i<=6) {
				for(int j=1; j<=i-1; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=6-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=6-i; j++) {
					System.out.print("*");
				}
						
					
			}else {
				for(int j=1; j<=12-i; j++) {
					System.out.print(" ");
				}for(int j=1; j<i-6; j++) {
					System.out.print("*");
				}for(int j=1; j<=i-6; j++) {
					System.out.print(" ");
				}for(int j=1; j<=12-i; j++) {
					System.out.print("*");
				}
			}
					
					
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
