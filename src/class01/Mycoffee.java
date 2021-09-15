package class01;

class Coffee {
	
	String name;
	int price;
	void coffe_info(String name, int price)
	{
		System.out.println("커피 이름=" + name);
		System.out.println("가격=" + price);
		
	}
}


public class Mycoffee {

	public static void main(String[] args) {
		Coffee my1 = new Coffee();
		my1.coffe_info("아메리카노", 4000);

		Coffee my2 = new Coffee();
		my2.name="카페라떼";
				my2.price =4500;
				// coffe_info(); 직접 접근은 안됨
				my2.coffe_info(my2.name,my2.price); //객체로 접근
				
				//my1, my2 클래스는 같지만 참조하는 주소는 다르다.
	}

}
