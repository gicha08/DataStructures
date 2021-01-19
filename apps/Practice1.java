package apps;

public class Practice1 {

	public static void main(String[] args) {
//		for(int i=0;i<10;i++)
//			System.out.println("Hello World");
		
//		for(int i=1;i<=100;i++)
//			System.out.println(i);
		
//		for(int i=0;i<100;i++)
//			System.out.print(i+1 + " ");
		
		// sum 1 through 100. 1 + 2 + 3 + ... + 100
//		int sum = 0;
//		for(int i=1;i<=100;i++)
//			sum += i; //sum = sum + i;
//		System.out.println("the sum is " + sum); // 100 * 101 / 2 = 5050
		
//		System.out.println(1 + 6 /(3*2));
//		System.out.println(7/2.0);
//		System.out.println(11/3);
//		System.out.println(11%3);
		
		for(int i=0;i<100;i++) {
			if(i % 10 == 0)
				System.out.println();
			System.out.print(i+1 + "\t");
		}
	}
}
