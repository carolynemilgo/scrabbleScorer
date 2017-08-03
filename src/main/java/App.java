import java.io.Console;


public class App{

public static void main(String[]args){
  Console myConsole=System.console();


  boolean programRunning=true;
  while(programRunning){
  System.out.println("Enter a word to play or type Exit");
  String userInput=myConsole.readLine();

  Scrabble wordInputted=new Scrabble();
  Integer result=wordInputted.calculateScore(userInput);
  if(result>0){
  System.out.println("Score:"+result);
  }
  else if(userInput.equals("Exit")){
    programRunning=false;
  }
  else {
    System.out.println("That is not a word!!");

    }

  }
  }

}
