import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HumanPlayer extends Player{
	
	private BufferedReader input;
	
	public HumanPlayer(char token) {
		super(token);
		input=new BufferedReader(new InputStreamReader(System.in));
	}
	
//a method to get an integer from the command line
  public int getMove(){
		try{			
      return Integer.parseInt(input.readLine());
		}
		catch(Exception e){
			return -1;
		}
		
	}

  

}
