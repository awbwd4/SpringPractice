package reference_type;

public class AdvFor {

	
	public static void main(String[] args) {
		
		
		int[] scores = new int[10];
		
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (i+1)*10;
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		
		
		System.out.println("sum : "+sum);
		
		
		
		
		
		
		
	}
	
	
	
	
}
