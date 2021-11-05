import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Player{
  public char token;

  public Player(char token){
    this.token=token;
  }

  
  
  abstract int getMove();
    
  //getting the char that is the indicative of which player is
	public char getToken(){
    return token;
  }


}