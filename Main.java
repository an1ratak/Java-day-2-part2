import java.util.Scanner;
public class Main {
int position=0;
int depth=0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Move move = new Move();
		String comando;
		do {
			comando = in.next();
			processCommands(comando, in, move);
		}while (comando.equals("S") == false);
	}
	private static void processCommands(String comando, Scanner in, Move move) {
		switch(comando) {
		case("forward"):
			MoveFoward(in, move);	
			break;
		case("up"):
			ChangeDepthUp(in, move);
			break;
		case("down"):
			ChangeDepthDown(in,move);
			break;
		case("S"):
			System.out.println(move.returnDepth()*move.returnPosition());
			break;
		default:
			break;
		}
	}
	private static void MoveFoward(Scanner in, Move move) {
		int i = in.nextInt();
		in.nextLine();
		move.MoveFoward(i);
//		System.out.println(move.returnPosition());
//		System.out.println(move.returnDepth());
	}
	private static void ChangeDepthUp(Scanner in, Move move) {
		int i = in.nextInt();
		in.nextLine();
		move.ChangeDepth(-i);
//		System.out.println(move.returnAim());
	}
	private static void ChangeDepthDown(Scanner in, Move move) {
		int i = in.nextInt();
		in.nextLine();
		move.ChangeDepth(i);
//		System.out.println(move.returnAim());
	}
}
