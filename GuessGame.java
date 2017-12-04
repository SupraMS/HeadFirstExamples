import java.util.Scanner;
import java.io.IOException;

public class GuessGame{
Player p1;
Player p2;
Player p3;
public void startGame (){
	p1 = new Player ();
	p2 = new Player ();
	p3 = new Player ();
	
	int guessP1 = 0;
	int guessP2 = 0;
	int guessP3 = 0;
	
	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;
	
	int targetNumber = (int)(Math.random()*10);
	System.out.println("I'm thinking of a number between 0 and 9");
	
	Scanner name = new Scanner(System.in);
	System.out.print("Player 1, Enter Name : ");
	String p1Name = name.next();
	System.out.print("Player 2, Enter Name : ");
	String p2Name = name.next();
	System.out.print("Player 3, Enter Name : ");
	String p3Name = name.next();
	while(true){
		System.out.println("My guessing number is ");
		p1.guess(p1Name);
		p2.guess(p2Name);
		p3.guess(p3Name);
		
		guessP1 = p1.number;
		guessP2 = p2.number;
		guessP3 = p3.number;
		
		if(guessP1 == targetNumber){
			p1isRight = true;
		}
		if(guessP2 == targetNumber){
			p2isRight = true;
		}
		if(guessP3 == targetNumber){
			p3isRight = true;
		}
		
		if(p1isRight || p2isRight || p3isRight){
		System.out.println("We have Winner!!");
		System.out.println("Player 1 is Right? "+p1isRight+" where guess of "+p1Name+" is "+guessP1+" & Target Number is "+targetNumber);
		System.out.println("Player 2 is Right? "+p2isRight+" where guess of "+p2Name+" is "+guessP2+" & Target Number is "+targetNumber);
		System.out.println("Player 3 is Right? "+p3isRight+" where guess of "+p3Name+" is "+guessP3+" & Target Number is "+targetNumber);
		System.out.println("Game Over");
		break;
		}else{
			System.out.println("Better Luck next time Players!! Try Again "+"Target Number is "+targetNumber);
		}
		
	}
}
}