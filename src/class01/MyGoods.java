package class01;

import java.util.Date;

class Goods {
	
	String name;
	String import_date;
	void info_goods()
	{
		System.out.println(name +" 입고일자:" + import_date);
	}
}


public class MyGoods {

	public static void main(String[] args) {
		
		Date today = new Date();
		//Date 클래스
		//Date형/ string 날짜를 문자열로 바꿔줌
		Goods my_goods1=new Goods();
	my_goods1.name="가방";
	my_goods1.import_date=today.toString();
		//today 객체
	my_goods1.info_goods();
			
	Goods my_goods2=new Goods();
	my_goods2=my_goods1;
	my_goods2.info_goods();

	}

}
