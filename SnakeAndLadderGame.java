import java.util.*;

public class SnakeAndLadderGame{

	public static void main(String[] args){

		int startPoint = 0;
		int player1 = startPoint;
		Random roll = new Random();
		int dice = roll.nextInt(6) + 1;

		Random options = new Random();
		int opt = options.nextInt(3);

		switch(opt){
			case 0:
					player1 = player1;
					System.out.println("Sorry! You can't play and remains at same point");
					break;
			case 1:
					player1 = player1 + dice;
					System.out.println(" You got a ladder and you have moved " + player1 + " steps forward");
					break;
			case 2:
					player1 = player1 - dice;
					System.out.println("You are bitten by the snake and moved " + player1 + " steps backward");
					break;
			default:
					System.out.println("invaild");
					break;
		}
	System.out.println(player1);
	}
}
