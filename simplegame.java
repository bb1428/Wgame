//creator aku
package parts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import parts.sortingwordsbyCharandLength;
import parts.Score;



public class simplegame {

	
	
	public static void main(String[] args) {

		
		int gameover=0;
		double score=0.0;
		String compare=null;
		String input2=null;
		Scanner inputReader =new Scanner(System.in);
		System.out.println("This a simple game of word chain. Each cycle the two participant should write in the console in turn. If the last character matches, the game goes on.");
		System.out.println("the game starts");
		input2=inputReader.nextLine(); //writing in console
		compare=input2;
		Score hajdu=new Score();
		score=score+hajdu.getScoro(input2.length());
		//System.out.println(hajdu.getList(input2));
		while(gameover!=1){
			input2=inputReader.nextLine(); //writing in console
			if(compare.charAt(compare.length()-1)==input2.charAt(0)){
				System.out.println(compare);
				System.out.println(input2);
				score=score+hajdu.getScoro(input2.length());
				System.out.println("Your score "+ score);
				System.out.println("The game goes on.");
				gameover=0;
				compare=input2;
				
			}
			else{
				System.out.println("Game over.");
				gameover=1;
			}
			
	}
		
		
		
	}

}
