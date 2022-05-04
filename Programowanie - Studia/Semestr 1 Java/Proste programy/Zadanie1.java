package zadanie.pkg1;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args)
    {
        double metry, cale, stopy, jardy ,mile_ladowe;
        System.out.println("Przeliczę dla ciebie metry na cale, stopy, jardy oraz mile lądowe");
        int kontynuacja;
    do
    {
        
            System.out.println("Podaj ile metrów mam przeliczyć");
            Scanner sc = new Scanner(System.in);
            metry = sc.nextDouble(); sc.nextLine();
            if(metry<0)
            {
                System.out.println("Metry nie mogą być ujemne");
               break;
            }
            System.out.println("Metry = " + metry);
            
            jardy = metry * 1.0936133;
            jardy *= 10000;
            jardy = Math.round(jardy);
            jardy /= 10000;
            System.out.println("Jardy = " + jardy);
        
            cale = metry * 39.3700787;
            cale *= 10000;
            cale = Math.round(cale);
            cale /= 10000;
            System.out.println("Cale = " + cale);
        
            stopy = metry * 3.2808399;
            stopy *= 10000;
            stopy = Math.round(stopy);
            stopy /= 10000;
            System.out.println("Stopy = " + stopy);
        
            mile_ladowe = metry * 0.0006213699;
            mile_ladowe *= 10000;
            mile_ladowe = Math.round(mile_ladowe);
            mile_ladowe /= 10000;
            System.out.println("Mile_lądowe = " + mile_ladowe);
        
            System.out.println("Czy uruchomić program raz jeszcze?");
            System.out.println("Wpisz 1 aby kontynuować");
            kontynuacja = sc.nextInt(); sc.nextLine();
       
    }
        
    while(kontynuacja==1);
        
    }
    
    
}
