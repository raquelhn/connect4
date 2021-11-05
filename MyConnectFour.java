import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyConnectFour {
	public void MyConnectFour(){
		playGame();
    
	}
	
	private void playGame(){
		System.out.println("Welcome to Connect 4");
		System.out.println("There are 2 players red and yellow");
		System.out.println("Player 1 is Red, Player 2 is Yellow");
		System.out.println("To play the game type in the number of the column you want to drop you counter in"); 
		System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
		System.out.println("");
    
    Board board = new Board(6,7);
    View view = new CLIView();
		view.display(board.toString());
    
    //players
    ArrayList<Player> players = new ArrayList<>();
    players.add(new ComputerPlayer('r'));
    players.add(new HumanPlayer('y'));
    int currentPlayer = 0;

    boolean win=false;
    while(!win){
    int position = players.get(currentPlayer).getMove();
      //in case a number that is outside the range 1 to 7 is type in the terminal the game breaks, else the game continues
        if(position==0||position>7){
          System.out.println("not a valid number start again");
          break;
        }else{
          board.placeCounter(players.get(currentPlayer).getToken(),position);
          view.display(board.toString());
          board.checkCount(players.get(currentPlayer).getToken());
          if(board.checkCount(players.get(currentPlayer).getToken())==true){
            win=true;
            System.out.println(players.get(currentPlayer).getToken()+" has won");
          }else{
            currentPlayer = (currentPlayer+1)%players.size();
        }  
        }
        }
        
      }
  
}
