package Day0618;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student();
		
		//method 자동완성의 parameter 이름은 선언 한 이름을 그대로 쓴다.
		String name = "김지수";
		stu.setName(name);
		Calendar cal = Calendar.getInstance();
		stu.setBirthDate(cal);
		stu.setSsn("787878");
		
		
		
		//System.out.println(stu);//객체의 패키지, 클래스, 메모리 주소가 나옴
		//String 글자 하나하나 비교.
		
		ArrayList<Student> studentList =new ArrayList<>();
		studentList.add(stu);
		
		Student stu2 = new Student();
		stu2.setName("김지수");
		stu2.setBirthDate(cal);
		stu2.setSsn("5896");
		studentList.add(stu2);
		
		Student stu3 = new Student();
		stu3.setName("김지수");
		stu3.setBirthDate(cal);
		stu3.setSsn("252525");
		studentList.add(stu3);
		
		Student stu4 = new Student();
		stu4.setName("김지수");
		stu4.setBirthDate(cal);
		stu4.setSsn("101010");
		studentList.add(stu4);
		
		
		
		
		stu.sortByName(studentList);//이름 정렬
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		
		for(Student s : studentList) {
			System.out.println(s.showInfo());
		}
		
		
//call by value : 
//call by reference :				
	
	}

}
