import java.util.concurrent.ThreadLocalRandom;

public class Q3Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAdd();
	}
	public static void RandomAdd() {
	
		int a = 0;
		int b = 0;
		
		for (int i=0;i<10;++i) {		
			a = ThreadLocalRandom.current().nextInt(1, (10));
			b = b+a;
			System.out.println(a +","+ b);
		}
	}

}
