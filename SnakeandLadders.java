package com.company;
import java.util.*;
public class SnakeandLadders {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many players in the game ?");
        int n;
        n = sc.nextInt();
        if (n>3)
        {
            System.out.println("Maximum Players can be three only !!");
            main(null);
        }
        alone(n);
    }
    public static void alone(int n)
    {
        Random rand = new Random();
        int [] arr = new int[n];
        int a;
        while (1>0)
        {
           for (int i =0;i<n;i++)
           {

               System.out.println("Rolling the dice ....");
               delayed();
               a = rand.nextInt(6)+1;
               System.out.println("Player " + (i+1) + " got "+a+ " on your dice");
               arr[i] = arr[i]+a ;
               if (arr[i]==2)
               {
                   System.out.println("Orray ! you climbed up through the ladder ");
                   arr[i] = arr[i]+13;
               }
               else if (arr[i]==12)
               {
                   System.out.println("Orray ! you climbed up through the ladder ");
                   arr[i] = arr[i] + 10;
               }
               else if (arr[i]==18)
               {
                   System.out.println("Oh Oh saap ne kaatdiya !! ");
                   arr[i] = arr[i]-16;
               }
               else if (arr[i]==23)
               {
                   System.out.println("Oh Oh saap ne kaatdiya !! ");
                   arr[i] = arr[i] - 8;
               }
               if (arr[i]>25)
               {
                   arr[i] = arr[i]-a;
               }
               System.out.println("Player  "+ (i+1) +" moved to  " + arr[i]);
                    delayed();
               if (arr[i]==25)
               {
                   System.out.println("player: " + (i+1) + " Wins !" );
                   System.exit(0);
               }
           }
        }
    }
public static void delayed()
{
    try
    {
        Thread.sleep(2000);
    }
    catch (Exception e)
    {
        System.out.println(" Error Occured Start the game again");
        main(null);
    }
}
}
