import java.util.Scanner;

public class Assignment7 {
  public static void main(String[] args ){

	System.out.println(" ****** Start of Program ******");
	printMenu();
	Scanner scan = new Scanner (System.in);
	char command;  		// command letter
    CardList myCards = new CardList (1); //constructor


	do{
        System.out.print("Please input a commad or type ?: ");
		command = scan.nextLine().toLowerCase().charAt(0);

		switch(command)
		{
			case 'a': //add the cards and the amount of cards
				System.out.println("a [Create new cards]" );
                System.out.print("[Input the size of cards]" );
				int sizecards = scan.nextInt();
				scan.nextLine();
				myCards = new CardList(sizecards);
				System.out.println(myCards.getHistory());
				break;
			case 'b': //flip the order
				System.out.println("b [Flip the cards]" );
				myCards.flip();
				System.out.println(myCards.getHistory());
				break;
			case 'c': //shift to the left
				System.out.println("c [Shift the cards]" );
				myCards.shift();
				System.out.println(myCards.getHistory());
				break;
			case 'd'://randomize array position aka shuffle
				System.out.println("d [Shuffle the cards]" );
				myCards.shuffle();
				System.out.println(myCards.getHistory());
			break;
			case 'e'://change the current cards and give new ones 
				System.out.println("e [Change the cards]" );
				System.out.println("[Input the number of cards to change]: " );
				int sizechange = scan.nextInt();
				scan.nextLine();
				myCards.change(sizechange);
				System.out.println(myCards.getHistory());
				break;
			case '?': 
				printMenu(); 
				break;
			case 'q': 
				System.out.println("");
				break;
			default: System.out.print("\n\t Invalid: *** Type '?' to get the commands***"); break;
		}
		System.out.println("\n");
	}while(command != 'q');
	 System.out.println(" ****** End of Program ******");
} // end of main ()

   // Answer the
   // Display the command menu
   public static void printMenu(){
		System.out.println();
		System.out.println("Command Options");
        System.out.println("--------------------------------");
        System.out.println("a. Create new cards");
        System.out.println("b. Flip the cards");
        System.out.println("c. Shift to end");
        System.out.println("d. Shuffle cards ");
        System.out.println("e. Change the cards");
        System.out.println("?. Display the menu again");
        System.out.println("q. Quit the program");
	}
}