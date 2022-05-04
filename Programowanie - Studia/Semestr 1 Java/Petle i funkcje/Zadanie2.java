package zadanie2;

import java.util.Scanner;

public class Zadanie2 
{

    public static void main(String[] args)
    {
        
        System.out.println("Program rysujący figury.\n");
            
        int wybor;
        int wielkosc = 0;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            menu();
            wybor = sc.nextInt();
            switch(wybor)
            {
                case 1: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Kwadrat(wielkosc);
                    break;
                case 2: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Trojkat1(wielkosc);
                    break;
                case 3: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Trojkat2(wielkosc);
                    break;
                case 4: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Ramka(wielkosc);
                    break;
                case 5: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Ramka_z_przekatnymi(wielkosc);
                    break;
                case 6: System.out.println("Wpisz wielkość figury: ");
                        wielkosc = sc.nextInt();
                        Piramidka(wielkosc);
                   break;
                case 7: System.out.println("Koniec programu :)");
                    break;
                default: System.out.println("Nie wybrano żadnej opcji !");
            }
        }while(wybor != 7);
        
    }
    
    public static void menu()
    {
        System.out.println("Wybierz opcję:\n1)Kwadrat\n2)Trójkąt 1\n3)Trójkąt 2\n4)Ramka\n5)Ramka z przekątnymi");
        System.out.println("6)Piramidka\n7)Wyjdź z programu");
    }
    
    public static void Kwadrat(int wielkosc)
    {
            for(int i = 1; i <= wielkosc; i++)
            {
                for(int j = 1; j <= wielkosc; j++)
                {
                    System.out.print('*');
                }
                    System.out.println();
            }
            System.out.print("\n\n"); 
    }
    
    public static void Trojkat1(int wielkosc)
    {
        for(int i = wielkosc; i > 0; i--)
        {
            for(int j = i; j <= wielkosc; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     
    public static void Trojkat2(int wielkosc)
    {
            for(int i = 1; i <= wielkosc; i++)
            {
                System.out.print(' ');
                for(int j = i; j <= wielkosc; j++)
                {
                    System.out.print(' ');
                }
                for(int k = i-1; k >= 0; k--)
                    System.out.print("*");
                    System.out.println();
            }
            System.out.print("\n\n"); 
    }
     
    public static void Ramka(int wielkosc)
    {
        for (int i = 1; i <= wielkosc; i++) {
		for (int j = 1; j <= wielkosc; j++) {
			if (i==1 || i==wielkosc || j==1 || j==wielkosc) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.print("\n");
	}
    }
     
    public static void Ramka_z_przekatnymi(int wielkosc)
    {
        for (int i = 1; i <= wielkosc; i++) {
		for (int j = 1; j <= wielkosc; j++) {
			if (i==1 || i==wielkosc || j==1 || j==wielkosc || i==j || j==(wielkosc-i+1)) {System.out.print("*");}
			else {System.out.print(" ");}
		}
            System.out.print("\n");
	}
    }
    
    public static void Piramidka(int wielkosc)
    {
       for(int i = wielkosc; i > 0 ; i--)
       {
           for(int j = i; j > 0; j-- )
           {
               System.out.print(" ");
           }
           for(int k = 2*(wielkosc - i) + 1; k > 0; k--)
               System.out.print("*");
           System.out.println("");
       }
       
        
    }
    
}
