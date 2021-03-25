import java.util.*;

public class SnakeAndLadderGame{

	public static void main(String[] args){

		int startPoint = 0;
		int player1 = startPoint;
		Random roll = new Random();
		int dice = roll.nextInt(6) + 1;
		System.out.println(dice);
	}
}
