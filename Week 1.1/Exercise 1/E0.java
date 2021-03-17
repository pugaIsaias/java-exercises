public class E0
{
    public static void main(String[] args)
    {
        int[] numbers = new int[]{0,1,2,3,4,5};
        for(int i = 0; i < numbers.length ; i++)
        {
            System.out.print(""+numbers[i]+'\n');
        }
        printMessage("You fix the errors!");
    }

    public static void printMessage(String msg)
    {
        System.out.println(msg);
    }
}