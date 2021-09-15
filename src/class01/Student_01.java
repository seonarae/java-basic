package class01;

public class Student_01 {

	public static void main(String[] args) {
		
		//1.  Student라는 클래스를 담을 변수 선언
		Student std1;
		//2. 실제로 Student를 복사해서 담는다.
		std1 = new Student();
		
		Student std2 = new Student(); //Student 객체화시켜서 가져오기 
		//std1과 std2는 다름
		System.out.println(std1);
		System.out.println(std2);
//원본 안주고 유인물 복사본(일련번호 다름)으로 a학생 필기, b학생 필기 원본 망가짐.   
	}

}
//빈박스 28
