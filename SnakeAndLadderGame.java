import java.util.*;

public class SnakeAndLadderGame{

	public static void main(String[] args){

		int startPoint = 0;

		int player1 = startPoint;
		int player2 = startPoint;

		int player1Count = 0;
		int player2Count = 0;

		int previousPos1 = 0;
		int previousPos2 = 0;

		while((player1 <= 100)&&(player2 <= 100)){
			Random roll1 = new Random();
			int dice1 = roll1.nextInt(6) + 1;
			player1Count++;


			Random roll2 = new Random();
			int dice2 = roll2.nextInt(6) + 1;
			player2Count++;
			Random options = new Random();
			int opt = options.nextInt(3);
			Random options2 = new Random();
			int opt2 = options2.nextInt(3);

			previousPos1 = player1;

			switch(opt){
				case 0:
						player1 = player1;
						break;
				case 1:
						player1 = player1 + dice1;
						Random rollAgain = new Random();
						int dice = rollAgain.nextInt(6)+1;
						player1 = player1 + dice;
						player1Count++;
						break;
				case 2:
						player1 = player1 - dice1;
						break;
				default:
						System.out.println("invaild");
						break;
			}
			previousPos2 = player2;


                 	switch(opt2){
				case 0:
                	                        player2 = player2;
						break;
        		case 1:
                 	                        player2 = player2 + dice2;
						Random rollAgain = new Random();
                 	                        int dice = rollAgain.nextInt(6)+1;
                 	                        player2 = player2 + dice;
						player2Count++;
                                                break;
        		case 2:
                                                player2 = player2 - dice2;
                                                break;
           	         default:
                	                        System.out.println("invaild");
        		}

			if(player1 > 100){
				player1 = previousPos1;
			}

			else if(player1 < 0){
				player1 = startPoint;
			}

			else if(player1 == 100){
				break;
			}

        	if(player2 > 100){
            	player2 = previousPos2;
         	}

        	if(player2 < 0){
            	player2 = startPoint;
         	}

         	if(player2 == 100){
        		break;
         	}


		}
		if(player1 == 100){
			System.out.println("Player 1 wins." );
		}else if(player2 == 100){
			System.out.println("Player 2 wins." );
		}
	}
}
