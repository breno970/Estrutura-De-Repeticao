import java.util.Scanner;

public class Repetição1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		int x,y=1;
		do {
			System.out.printf("Digite um número: ",y);
			x=leitor.nextInt();
			y++;
		if(x<0){
			System.out.println("Valor negativo");
			System.out.println();}
		else if(x>0) {
			System.out.println("Valor positivo");
			System.out.println();}
		else {
			System.out.println("Valor neutro");
			System.out.println();}
		}while(y<11);
	}

}