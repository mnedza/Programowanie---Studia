package zadanienr2;

import java.util.Random;
import java.util.Scanner;

public class Zadanienr2
{
    public static void main(String[] args)
    {
        int[][] tablica; tablica = new int[10][10];
        int[][] tablicaA; tablicaA = new int[3][3];
        int[][] tablicaB; tablicaB = new int[3][3];
        
        int min = 0;
        int max = 0;
        int wybor;
        Scanner op = new Scanner(System.in);
        
        do
        {
            menu();
            wybor = op.nextInt();
            switch(wybor)
            {
                case 1: wypelnijTablice(tablica, min, max);
                    break;
                case 2: wypelnijTabliceZJedynkami(tablica);
                    break;
                case 3: transportujTablice1(tablica);
                    break;
                case 4: transportujTablice2(tablica);
                    break;
                case 5: mnozenieMacierzy(tablicaA, tablicaB);
                    break;
                case 6: System.out.println("Koniec programu");
                    break;
                default: System.out.println("Nie wybrano żadnej opcji");
            }
        }
        while(wybor > 6 || wybor < 1);     
    }
    
    public static void menu()
    {
        System.out.println("Witaj w menu, wybierz jedną z opcji:");
        System.out.println("1) wypelnijTablice ");
        System.out.println("2) wypelnijTabliceZJedynkami ");
        System.out.println("3) transportujTablice1 ");
        System.out.println("4) transportujTablice2 "); 
        System.out.println("5) mnozenieMacierzy ");
        System.out.println("6) Koniec programu "); 
    }
    
    public static void wypelnijTablice(int[][] t, int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj minimalną wartość tablicy:");
        min = sc.nextInt();
        System.out.print("Podaj Maksymalną wartość tablicy:");
        max = sc.nextInt();
        
        Random los = new Random();
        System.out.println("\nWypełniam tablicę wartościami losowymi z podanego przedziału:");
        for(int i=0; i<t.length; i++)
        {
            for(int j=0; j<t.length; j++)
            {
                t[i][j] = (los.nextInt((max + 1) - min))+ min;
                System.out.print(t[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
    public static void wypelnijTabliceZJedynkami(int[][] t)
    {

        for(int i=0; i<t.length; i++)
        {
            for(int j=0; j<t.length; j++)
            {
                if(i==j)
                {
                    t[i][j]=1;                    
                } 
                t[i][9-i]=1;
            System.out.print(t[i][j] + " ");
            }
        System.out.print("\n");
        }  
    }
    
    public static void transportujTablice1(int[][] t)
    {
        System.out.println("Tabela przed transpozycją");
        Random r = new Random();
        for (int i = 0; i < t.length; i++) 
        {
           for (int j=0; j< t.length; j++)
           {
                t[i][j] = r.nextInt(10);
                System.out.print(t[i][j] + " ");
           }
        System.out.println();
        }
        
        System.out.println("\n\nTabela po transpozycji");
        int [][] tt = new int[10][10];
        for(int i=0; i<t.length; i++)
        {
            int[] tab = t[i];
            for (int j = 0; j<tab.length;j++)
            {
                tt[j][i] = t[i][j];
            }
        }
        for(int i=0; i<t.length; i++)
        {
            for(int j=0; j<t.length; j++)
            {
                System.out.print(tt[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] transportujTablice2(int[][] t)
    {   
        System.out.println("Tabela przed transpozycją");
        Random r = new Random();
        for (int i = 0; i < t.length; i++) 
        {
           for (int j=0; j< t.length; j++)
           {
                t[i][j] = r.nextInt(10);
                System.out.print(t[i][j] + " ");
           }
        System.out.println();
        }
        
        System.out.println("\n\nTabela po transpozycji"); 
        int tmp;
        if (t.length == t[1].length)
        {
            for(int i=0; i<t.length; i++)
            {
                for (int j = i; j<t[i].length;j++)
                {
                    tmp = t[i][j];
                    t[i][j] = t[j][i];
                    t[j][i] = tmp;
                }
            }
                for (int i = 0; i < t.length; i++) 
                {
                    for (int j=0; j< t.length; j++)
                        {
                            System.out.print(t[i][j] + " ");
                        }
                System.out.println();
                }
        return t;
        }
        else
        {
            return new int[0][0];
        }
    }
   
    public static void mnozenieMacierzy(int[][] A, int[][] B)
    {
        int [][] t = new int [3][3];
        int s;
        
        System.out.println("Macierz A");
        Random r = new Random();
         for (int i = 0; i < A.length; i++) 
        {
           for (int j=0; j< A.length; j++)
           {
                A[i][j] = r.nextInt(10);
                System.out.print(A[i][j] + " ");
           }
        System.out.println();
        } 
        System.out.println("Macierz B");
        for (int i = 0; i < B.length; i++) 
        {
           for (int j=0; j < B.length; j++)
           {
                B[i][j] = r.nextInt(10);
                System.out.print(B[i][j] + " ");
           }
        System.out.println();
        } 
        
        for(int i=0; i<t.length; i++)
        {
            for (int j = 0; j<t[i].length;j++)
            {
                s = 0;
                for (int k = 0; k<t[i].length;k++)
                {
                    s+= A [i][k] * B [k][j];
                    t[i][j]=s;
                }
            }
        }
        System.out.println("Macierz po wymnożeniu:");
        for (int i = 0; i < B.length; i++) 
        {
           for (int j=0; j < B.length; j++)
           {
                System.out.print(t[i][j] + " ");
           }
        System.out.println();
        }
    } 
}
