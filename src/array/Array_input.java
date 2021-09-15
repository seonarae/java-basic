package array;

public class Array_input {

	public static void main(String[] args) {
	
		
		//숫자가 10개 들어가는 배열 cup 만들기
		
				int [] cup = new int[10];
				System.out.println(cup.length);
				
				cup[0] = 10;
				cup[1] = 20;
				cup[2] = 30;
				//3번부터 9번까지 100씩 넣기
				/*
				cup[3] = 100;
				cup[4] = 100;
				cup[5] = 100;
				cup[6] = 100;
				cup[7] = 100;
				cup[8] = 100;
				cup[9] = 100;
				cup[10] = 100;
				*/
				for(int i=3; i<cup.length; i++) {
					cup[i] = 100;
				}

	}

}
