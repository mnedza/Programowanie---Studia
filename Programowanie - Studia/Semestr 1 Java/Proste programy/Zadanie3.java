package zadanie3;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args)
    {
        
        double a,b;
        int wybor,kontynuacja;

            System.out.println("Kalkulator dwuargumentowy robiący proste obliczenia.");
            
        do
        {
            kontynuacja = 1;
            if(kontynuacja==1)
            {
                
                System.out.println("Podaj pierwszą liczbę:");
                Scanner sc = new Scanner(System.in);
                a = sc.nextDouble();
        
                System.out.println("Wybierz działanie wpisując od 1 do 4 a następnie wciśnij Enter.");
                System.out.println("1) Dodawanie");
                System.out.println("2) Odejmowanie");
                System.out.println("3) Mnożenie");
                System.out.println("4) Dzielenie");
                wybor = sc.nextInt();
        
                System.out.println("Podaj drugą liczbę:");
                b = sc.nextDouble();
        
            
                if(wybor==1){   System.out.println("Wynik dodawania to = " + (a+b));    }
                else if(wybor==2){   System.out.println("Wynik odejmowania to = " + (a-b)); }
                else if(wybor==3){  System.out.println("Wynik mnożenia to = " + (a*b)); }
                else if(wybor==4)
                {
                    if(b!=0){   System.out.println("Wynik dzielenia to = " + (a/b));    }
                    else {  System.out.println("Nie można dzielić przez 0!");    }
                }
                
            }
            else{   break;  }
            System.out.println("");
            System.out.println("Czy powtórnie uruchomić program?");
            System.out.println("Proszę wybrać opcję Tak lub Nie wpisując cyfre 1-2?");
            System.out.println("1) Tak");
            System.out.println("2) Nie");
            
            Scanner sc = new Scanner(System.in);
            kontynuacja = sc.nextInt();
        }
        while(kontynuacja==1);
    }
    
}
