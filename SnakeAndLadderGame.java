import java.util.*;

public class SnakeAndLadderGame{

	public static void main(String[] args){

		int startPoint = 0;
		int player1 = startPoint;

		while(player1 <= 100){
			Random roll = new Random();
			int dice = roll.nextInt(6) + 1;
			Random options = new Random();
			int opt = options.nextInt(3);

			int previousPosition = player1;

			switch(opt){
				case 0:
						player1 = player1;
						break;
				case 1:
						player1 = player1 + dice;
						break;
				case 2:
						player1 = player1 - dice;
						break;
				default:
						System.out.println("invaild");
						break;
			}
			if(player1 > 100){
				player1 = previousPosition;
			}
			if(player1 < 0){
				player1 = startPoint;
			}
			if(player1 == 100){
				break;
			}
		}
		System.out.println("Hurrah! You have reached 100." );
	}
}
