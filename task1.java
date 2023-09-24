import java.util.Scanner;
class Task1
{
    public static void main(String args[])
    {
        
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("NUMBER GAME");
        System.out.println("ENTER MINIMUM VALUE : ");
        int minValue=sc.nextInt();
        System.out.println("ENTER MAXIMUM VALUE : ");
        int maxValue=sc.nextInt();
      
        int generatedNumber=(maxValue-minValue+5)+minValue;
        for(int attempts=1;attempts<=10;attempts++)
        {
            System.out.println("GUESS THE NUMBER : ");
            int guess=sc.nextInt();
            if(guess==generatedNumber)
            {
                System.out.println("YOU GUESSED THE CORRECT NUMBER");
                score++;
                break;
            }
            else if(guess<=generatedNumber)
            {
                System.out.println("GUESS NUMBER IS LESSER THAN GENERATED NUMBER");
            }
            else if(guess>=generatedNumber)
            {
                System.out.println("GUESS NUMBER IS HIGHER THAN GENERATED NUMBER");
            }
            System.out.println("NUMBER OF ATTEMPTS LEFT ARE : "+(10-attempts));
        }
            System.out.println("SCORE IS : "+score);
            
         
         System.out.println("THANKS FOR PLAYING");
        sc.close();
    }
}