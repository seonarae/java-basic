package array;

public class Array_output {

	public static void main(String[] args) {
	
		
		int[] score = new int[10];
		
		//score(0번~9번) 안에 10~100 넣기 
		
	/*	score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 30;
		score[4] = 30;
		score[5] = 30;
		score[6] = 30;
		score[7] = 30;
		score[8] = 30;
		score[9] = 100;
		*/
		
		for(int i=0; i<score.length; i++  )
		{
			score[i] = (i+1)*10;
		}
			
		System.out.println(score[0]);//0번방 값 확인
		System.out.println(score[5]);//5번방 값 확인
		System.out.println(score[9]);//9번방 값 확인
			
		//전체값 확인 
		for (int i = 0; i < score.length; i++) {
			int j = score[i];
			System.out.println(j);
			
			
		}
}
}

