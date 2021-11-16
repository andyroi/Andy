//************************************************************
// Name : Andrew Rodriguez
// Title : Assignment7.java & CardList.java
// Description: The program will ask the user the amount of cards, and the the user will be given random cards, with the inputted amount, then they'll have options, to create new cards, flip, shift, shuffle, change, display, and quit the program. This HW practices private classes and mainly arrays.
// Time:
// Date: 11/10/21
//*************************************************************
/*** 
    a)public int[] swapEnds(int[] nums) {
        int temp = nums[0];
         nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    } 
    b)public boolean commonEnd(int[] a, int[] b) {
    return (a[0] == b[0] || a[a.length -1] == b[b.length-1]);
    }
    c)public int countEvens(int[] nums) {
        int count = 0;
        for (int i  = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
            count++;
            }
        }
        return count;
    }
    d)public int sum13(int[] nums) {
        int sum = 0;
        for (int i= 0; i < nums.length; i++)
        {
            if(nums[i] == 13)
            {
            nums[i] = 0;
                if(i == nums.length-1)
                {
                    if(nums[nums.length-1] == 13)
                    {
                    nums[i] = 0;
                    }
                }
                else
                {
                    nums[i + 1] = 0;
                }
            }
            sum += nums[i];
        }
    return sum;
    }
    e)public int[] fix34(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j ++)
            {
                if (nums[i] == 4 && nums[j] == 3)
                {
                    int temp = nums[j +1];
                    nums[j+1] = nums[i];
                    nums[i] = temp;
                 }
            }
        }
    return nums;
    }
*/

import java.util.Arrays;
public class CardList {
    private char[] cards = new char[0];
    private String history = "";
    private String type = "";
    public CardList(int numberOfCard)  //This asks the user the amount of cards, and starts randomly generating THAT AMOUNT and choosing out of "randomcards"
    {    
        cards = new char[numberOfCard];
		String randomcards = "A234567890JQK";
		for (int i = 0; i < numberOfCard; i++)
		{
			cards[i] = randomcards.charAt((int)(Math.random()*13)); 
		}
    }
    public void flip()//flip the array pos
    {
        for (int i = 0; i < cards.length/2; i++)
        {
            char temp = cards[i];
            cards[i] = cards[cards.length-i-1];
            cards[cards.length-i-1] = temp;
        }
        type = ": Flip";
    }
    public void shift()//shift it toward the left
    {
        char temp = cards[0];
        for(int i = 0; i < cards.length-1;i++)
        {
            cards[i] = cards[i+1];
        }
        type = ": Shift";
        cards[cards.length-1] = temp;
    }
    public void shuffle()//randomize the array pos
    {
        for(int i = cards.length-1; i > 0 ;i--)
        {
            int numba = (int)(Math.random()*(i+1));
            char temp = cards[i];
            cards[i] = cards[numba];
            cards[numba] = temp;
        }
        type = ": Shuffle";
    }
    public void change(int size)//change user asked amount of cards
    {
        String randomcards = "A234567890JQK";
		for (int i = 0; i < size; i++)
		{
			cards[i] = randomcards.charAt((int)(Math.random()*13)); 
		}
        type = ": Change";
    }
    //private int[] shuffleIndex()
    //{
        
    //}
    public String getHistory()
    {
        history += Arrays.toString(cards) + type + "\n";
        return history;
    }
}