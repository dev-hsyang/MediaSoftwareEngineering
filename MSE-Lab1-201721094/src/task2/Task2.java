package task2;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give an int: ");
		int integer = scan.nextInt();
		int num=1;
		
		System.out.println();
		
		for(int i=0; i<integer; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Give a character:");
		char alpha = scan.next().charAt(0);
		int num2=65;
		int num3=97;
		
		System.out.println();
		
		if((int)alpha > 64 && (int)alpha < 91) {
			for(int i=0; i<(int)alpha-64; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print((char)num2+" ");
				}	
				num2++;
				System.out.println();
			}
		}
		if((int)alpha > 96 && (int)alpha < 123) {
			for(int i=0; i<(int)alpha-96; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print((char)num3+" ");
				}	
				num3++;
				System.out.println();
			}
		}
	}
}
