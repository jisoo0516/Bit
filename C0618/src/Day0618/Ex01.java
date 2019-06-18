package Day0618;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();//SimpleDateFormat때문에 사용
		System.out.println(cal);
		String myDate = "20001130";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//년월일
		System.out.println(myDate);
		cal.setTime(sdf.parse(myDate));
		cal.setTime(sdf.parse(myDate));
		cal.add(Calendar.YEAR,18);//2000+18
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal.after(cal2));//?
		
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));
		
		
		
	}

}
