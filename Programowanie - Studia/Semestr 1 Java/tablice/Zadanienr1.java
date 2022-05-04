package zadanienr1;

import java.util.Random;
import java.util.Scanner;

public class Zadanienr1
{
    public static void main(String[] args)
    {
        int wybor;
        Scanner kk = new Scanner(System.in);
        
        do
        {
            menu();
            wybor = kk.nextInt();
            switch(wybor)
            {
                case 1: macierz_2x2(); // opisowo
                    break;
                case 2: macierz_3x3();
                    break;
                case 3: System.out.println("Koniec programu");
                    break;
                default: System.out.println("Nie wybrano żadnej opcji");
            }
        }
        while(wybor > 3);
    }
    
    public static void menu()
    {
        System.out.println("Witaj w menu, wybierz jedną z opcji:");
        System.out.println("1) macierz 2x2 ");
        System.out.println("2) macierz 3x3 ");
        System.out.println("3) Koniec programu ");
    }
    
    public static void macierz_2x2() // opisowo
    {
        double W, Wx, Wy, x, y;
        Scanner sc = new Scanner(System.in);
        int[][] rownanie1;
        rownanie1 = new int[3][3];
        
        System.out.println("Program rozwiązujacy układ równań metodą wyznacznikową dla macierzy dwuwymiarowej.");
        System.out.println("{A1x + B1y = C1");
        System.out.println("{A2x + B2y = C2\n");
        
        System.out.print("Podaj A1 ");
        rownanie1[0][0] = sc.nextInt();
        
        System.out.print("Podaj B1 ");
        rownanie1[0][1] = sc.nextInt();
        
        System.out.print("Podaj C1 ");
        rownanie1[0][2] = sc.nextInt();
        
        System.out.print("Podaj A2 ");
        rownanie1[1][0] = sc.nextInt();
        
        System.out.print("Podaj B2 ");
        rownanie1[1][1] = sc.nextInt();
        
        System.out.print("Podaj C2 ");
        rownanie1[1][2] = sc.nextInt();
        
        System.out.println("Nasze wyznaczniki budujemy z odpowiednich kolumn w taki sposób:");
        //------------------------------------------------------------
        System.out.println("W: ");
        
                    System.out.print("|"); System.out.print(rownanie1[0][0]); System.out.print(" ");
                    System.out.print(rownanie1[0][1]); System.out.print("|\n");
                                        
                    System.out.print("|"); System.out.print(rownanie1[1][0]); System.out.print(" ");
                    System.out.print(rownanie1[1][1]); System.out.print("|\n");
                    
        System.out.println("Wx: ");

                    System.out.print("|"); System.out.print(rownanie1[0][2]); System.out.print(" ");
                    System.out.print(rownanie1[0][1]); System.out.print("|\n");
                                        
                    System.out.print("|"); System.out.print(rownanie1[1][2]); System.out.print(" ");
                    System.out.print(rownanie1[1][1]); System.out.print("|\n");

             System.out.println("Wy: ");

                    System.out.print("|"); System.out.print(rownanie1[0][0]); System.out.print(" ");
                    System.out.print(rownanie1[0][2]); System.out.print("|\n");
                                        
                    System.out.print("|"); System.out.print(rownanie1[1][0]); System.out.print(" ");
                    System.out.print(rownanie1[1][2]); System.out.print("|\n");
                            
        System.out.print("Wykonuję obliczenia W= ");
        W = (rownanie1[0][0] * rownanie1[1][1]) - (rownanie1[1][0] * rownanie1[0][1]) ; 
        System.out.println(W);
        
        System.out.print("Wykonuję obliczenia Wx= ");
        Wx = (rownanie1[0][2] * rownanie1[1][1]) - (rownanie1[0][1] * rownanie1[1][2]) ; 
        System.out.println(Wx);
        
        System.out.print("Wykonuję obliczenia Wy= ");
        Wy = (rownanie1[0][0] * rownanie1[1][2]) - (rownanie1[1][0] * rownanie1[0][2]) ; 
        System.out.print(Wy + "\n");
        
        System.out.println("Teraz obliczam rozwiązanie układu równań korzystając ze wzorow Cramera:");
        System.out.println("x=Wx/W");
        System.out.println("y=Wy/W");
        
        System.out.println("Rozwiązaniem układu równań jest para liczb:");
        System.out.print("x = "); x = Wx/W;  System.out.println(x);
        System.out.print("y = "); y = Wy/W;  System.out.println(y);
    }
    
    public static void macierz_3x3()
    {
        double W, x;
        Scanner sc = new Scanner(System.in);
        int[][] tablica;
        tablica = new int[3][3];
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        
        Scanner gg = new Scanner(System.in);
        System.out.println("Podaj liczby dla macierzy 3x3:");
        for(int i=0; i < tablica.length; i++)
        {
            int [] tab = tablica[i];
            for (int j = 0; j<tab.length;j++)
            {
                tablica[i][j]= gg.nextInt();
            }
        }
        W = (tablica[0][0]*tablica[1][1]*tablica[2][2])+
            (tablica[0][1]*tablica[1][2]*tablica[2][0])+
            (tablica[0][2]*tablica[1][0]*tablica[2][1])-
            (tablica[2][0]*tablica[1][1]*tablica[0][2])-
            (tablica[2][1]*tablica[1][2]*tablica[0][0])-
            (tablica[2][2]*tablica[1][0]*tablica[0][1]);
        System.out.println(W);
    }
   
}

