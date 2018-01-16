
import java.util.Scanner;
public class UserPass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user, pass;
		
		System.out.print("Enter your username: ");
		user = input.nextLine();
		
		System.out.print("Enter your passward: ");
		pass = input.nextLine();
		
		if(user.equals("Nil") && pass.equals("Chicken")){
		System.out.println("Welcome Nil.");
		}
		else
		{
		System.out.println("Invalid Username or Password.");
		}
		}
		}