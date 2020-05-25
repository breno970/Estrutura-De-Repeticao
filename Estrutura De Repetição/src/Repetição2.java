import java.util.Scanner;

public class Repetição2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int n,x=1;
		System.out.print("Digite um número: ");
		n=leitor.nextInt();
		
		do {System.out.println(x);
		x++;
		}while(x<n);
		System.out.print(x);
		
		
		
	}
	

}
