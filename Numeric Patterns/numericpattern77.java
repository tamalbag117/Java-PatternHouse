public class Main
{
	public static void main(String[] args) {
		
    int c = 1;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= (5 - i); j++)
        {
            System.out.print("    ");
        }

        for (int k = 1; k <= i; k++)
        {
            System.out.print(c+" ");
            c += 2;
        }
        System.out.println();
    }
		
	}
}