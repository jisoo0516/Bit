package Day0618;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student();
		
		//method �ڵ��ϼ��� parameter �̸��� ���� �� �̸��� �״�� ����.
		String name = "������";
		stu.setName(name);
		Calendar cal = Calendar.getInstance();
		stu.setBirthDate(cal);
		stu.setSsn("787878");
		
		
		
		//System.out.println(stu);//��ü�� ��Ű��, Ŭ����, �޸� �ּҰ� ����
		//String ���� �ϳ��ϳ� ��.
		
		ArrayList<Student> studentList =new ArrayList<>();
		studentList.add(stu);
		
		Student stu2 = new Student();
		stu2.setName("������");
		stu2.setBirthDate(cal);
		stu2.setSsn("5896");
		studentList.add(stu2);
		
		Student stu3 = new Student();
		stu3.setName("������");
		stu3.setBirthDate(cal);
		stu3.setSsn("252525");
		studentList.add(stu3);
		
		Student stu4 = new Student();
		stu4.setName("������");
		stu4.setBirthDate(cal);
		stu4.setSsn("101010");
		studentList.add(stu4);
		
		
		
		
		stu.sortByName(studentList);//�̸� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		
		for(Student s : studentList) {
			System.out.println(s.showInfo());
		}
		
		
//call by value : 
//call by reference :				
	
	}

}
