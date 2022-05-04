
package zadanie3;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args)
    {
        System.out.println("Program obliczający: sumę dochodów, dochód średni, minimalny i maksymalny w ciągu roku.\n");
        
        Scanner sc = new Scanner(System.in);
        
        double[] dochody;
        dochody = new double[12];
        int wybor;
        
        do
        {
            menu();
            wybor = sc.nextInt();
            switch(wybor)
            {
                case 1 : wczytaj_dochody( dochody );
                    break;
                case 2 : wyswietl_dochody( dochody );
                     break;
                case 3 : srednia_suma_dochodow( dochody );
                    break;
                case 4 : maksymalny_minimalny_dochod( dochody );
                    break;
                case 5 : sortuj( dochody );
                    break;
                case 6 : pod_nad_srednim_dochodem( dochody );
                    break;
                case 7 : System.out.println("Koniec programu");
                    break;
                default: System.out.println("Nie wybrano żadnej opcji!");
            }
        }    
        while(wybor!=7);   
    }
    
    public static void menu()
    {
        System.out.println("1) Wczytaj dochody");
        System.out.println("2) Wyświetl dochody");
        System.out.println("3) Średnia suma dochodów");
        System.out.println("4) Maksymalny i minimalny dochód");
        System.out.println("5) Posortowanie dochodów");
        System.out.println("6) Wyświetl dochody większe i mniejsze od średnich dochodów ");
        System.out.println("7) Zakończ program");  
    }
    
    public static void wczytaj_dochody(double[] dochody)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 12; i++)
        {
            System.out.println("Podaj dochody za miesiąc nr." + (i+1));
            dochody[i] = sc.nextInt();
        }
    }
    
    public static void wyswietl_dochody(double[] dochody)
    {
        for(int i = 0; i < 12; i++)
        {
            System.out.println("Dochody za miesiąc nr." + (i+1));
            System.out.println(dochody[i] + "zł.");
        }
    }
    
    public static void srednia_suma_dochodow(double[] dochody)
    {
        double suma = 0;
        for(int i = 0; i < 12; i++)
        {
            suma = suma + dochody[i];
        }
        System.out.println("Suma dochodów przez 12 miesięcy wynosi: " + (suma/12) + "zł.");
        
    }
    
    public static void maksymalny_minimalny_dochod(double[] dochody)
    {
        double max = dochody[0];
        double min = dochody[0];
        
        for(int i = 0; i < 12; i++)
        {
            if(max > dochody[i]){ max = dochody[i];}
            if(min < dochody[i]){ min = dochody[i];}
        }
        System.out.println("Największe dochody w ciągu 12 miesięcy to: " + max + "zł.");
        System.out.println("Najmniejsze dochody w ciągu 12 miesięcy to: " + min + "zł.");
    }
    
    public static void sortuj(double[] dochody)
    {
        double tymczasowa;
        for(int i = 0; i < 11; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                if(dochody[j]<dochody[j+1])
                {
                    tymczasowa = dochody[j];
                    dochody[j] = dochody[j+1];
                    dochody[j+1] = tymczasowa;
                }
            }
        }
        wyswietl_dochody( dochody );
    }
    
    public static void pod_nad_srednim_dochodem(double[] dochody)
    {
       double suma = 0;
       double srednia = 0;
        for(int i = 0; i < 12; i++)
        {
            suma = suma + dochody[i];
            srednia = (suma/12);
        }
         System.out.println("Wyświetlam dochody większe od średnich dochodów.");
         for(int i=1; i<12; i++)
         {
             if(dochody[i]>srednia){System.out.println(dochody[i]);}
         }
         System.out.println("Wyświetlam dochody mniejsze od średnich dochodów.");
         for(int i=1; i<12; i++)
         {
             if(dochody[i]<srednia){System.out.println(dochody[i]);}
         }
    }
    

}
