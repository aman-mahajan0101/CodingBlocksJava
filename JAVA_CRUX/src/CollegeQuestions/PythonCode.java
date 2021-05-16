package CollegeQuestions;

public class PythonCode {
	
	public static void main(String[] args) {
	
//		int sum=0;
		for(int i=10;i<=99;i++) {
			int sum=0;
			int j=i%10;
			int y=i/10;
			sum=y*j+(y+j);
			if(sum==i)
				System.out.println(sum + " ");
			
		}
	}

}

