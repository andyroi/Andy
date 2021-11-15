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
public class CardList {
    private char[] cards;
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
    public void flip()
    {
        for(int i = cards.length-1; i >= 0; i--)
        {
            int start = 0;
            int end = cards.length-1;

        }
        type = ":Flip";
    }
    public void shift()
    {

    }
    public void shuffle()
    {

    }
    public void change(int size)
    {

    }
    //private int[] shuffleIndex()
    //{
        
    //}
    public String getHistory()
    {
        for(int i = 0; i < cards.length; i++)
        {
            history += cards[i] + " , ";
        }
        return history;
    }
}