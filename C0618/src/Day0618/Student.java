package Day0618;

import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
	private Calendar birthDate;//null�� ������.
	private String name;
	private int grade;
	private String ssn;
	
	
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate =Calendar.getInstance();
		this.birthDate.setTime(birthDate.getTime());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public class SortByName implements Comparator<Student> {
		public int compare(Student s1, Student s2) {//�� ���ڰ� ������ 0�� ���� ù��° ���ڰ� �켱���� ������ -1, �ݴ�� 1 �׷��Ƿ� int�� ��.
			return  s1.showInfo().compareTo(s2.showInfo());
			
			
		}
	} 

	public String showInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return this.getName()+sdf.format(this.getBirthDate().getTime())+this.getSsn();
	}
	 
	public void sortByName(ArrayList<Student> studentList) {
		studentList.sort(new SortByName());
		
	}
}

