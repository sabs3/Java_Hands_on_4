package java_Hands_on_4;
import java.util.Scanner;

public class condition{

	public static void main(String[] args){
		int n = 10;
		
		System.out.print("Enter the choice from 1 to 10, 0 to terminate: ");
		Scanner user_input = new Scanner(System.in);
		
		while((n = user_input.nextInt()) !=0){
		
			switch(n)
			{
			case 1: System.out.println("This");
			break;
			case 2: System.out.println("is");
			break;
			case 3: System.out.println("very"); 
			break;
			case 4: System.out.println("very");
			break;
			case 5: System.out.println("interesting");
			break;
			case 6: System.out.println("game");
			break;
			case 7: System.out.println("Let's");
			break;
			case 8: System.out.println("play");
			break;
			case 9: System.out.println("and have");
			break;
			case 10: System.out.println("fun");
			break;
			default: System.out.println("Choose the number between 1 to 10");
			break;
		}
	}
	}

}
