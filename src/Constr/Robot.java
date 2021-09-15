package Constr;

public class Robot {

	//name과 id 밖으로 내보냄 
	//필드 만들기 
	String name;
	String id;
	//초기화는 0을 만드는 것이 아니고 최초의 값을 주는것, 인자값을 필드에 넣음 
	
	public Robot(String name, String id) { //생성자(객체화 될때 제일 먼저 실행)
		
		System.out.println("로봇이 객체화되면 실행");
	/* 받아온 값 넣어주기, 생성자가 끝나면 
		받은값이 사라져버려서 다른곳에서 쓸수없음 클래스에서 쓸 수있게 변수 만들어줌*/
		this.name = name;
		this.id = id; 
	}

	//빈박스 32

}
