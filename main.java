 import java.util.Scanner;
class main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter numbers: ");
        String adding = scan.nextLine();
        String[] printNum = adding.split(" ");
        int[] numbers = new int[ printNum.length ];
        for ( int i = 0; i < printNum.length; i++ )
        {
            numbers[i] = Integer.parseInt( printNum[i] );
            System.out.print( numbers[i] + ", " );
        }
        System.out.println(sumAndAvg(numbers));
    }
    public static double[] sumAndAvg(int[]arr)
    {
        double sum = 0;
        double[] newarr = new double[2];
        for(int i = 0; i < arr.length-1; i++)
        {
            sum+= arr[i];
        }
        double average = (sum)/(arr.length);
        newarr[0] = sum;
        newarr[1] = average;
        return newarr;
    }
}
