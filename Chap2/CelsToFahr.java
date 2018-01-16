import java.util.Scanner;
public class CelsToFahr {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double c, f;
		System.out.println("Enter a temperature in Celsius: ");
		c = sc.nextDouble();
		f =  (9 / 5) * c + 32; 
		System.out.println(c +" celsius ");
		System.out.println(f + " fahrenheit");
		}
	}
		
		
		