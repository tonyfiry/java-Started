import java.util.Scanner; 

public class num{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num1 =scanner.nextInt();
		if(num1>=100)
		{
			System.out.println("win");
		}
		else if(num1>=80)
		{
			System.out.println("your win");
		}
		else
		{
			System.out.println("lose");
		}
	}
}