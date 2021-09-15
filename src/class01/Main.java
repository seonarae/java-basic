package class01;

public class Main {

	public static void main(String[] args) {
	
		MyApiClass myapi = new MyApiClass();
		//API:복잡한 기능(두개의 수를 넣으면 더해서 반환해 주는 기능)을 plus라는 메서드로 간단하게 해결 
		int result = myapi.plus(3, 4); //만든 메서드 3,4 내던질 변수(result) 필요함
		System.out.println(result);
		
	}

}
