package zadanie1;

import java.util.Scanner;

public class Zadanie1
{
    public static void main(String[] args)
    {
        System.out.println("Program liczący pola i obwody wybranych figur.\n");
        
        int wybor;
        double bok;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            menu();
            wybor = sc.nextInt();
            switch(wybor)
            {
                case 1: obliczenia_dla_kwadrata();
                    break;
                case 2: obliczenia_dla_prostokata();
                    break;
                case 3: obliczenia_dla_kola();
                    break;
                case 4: System.out.println("Koniec programu!");
                    break;
                default : System.out.println("Nie ma takiej figury");           
            }    
        }
        while(wybor != 4);
    }
    
    public static void menu()
    {
        System.out.println("Witaj w menu, wybierz jedną z opcji:");
        System.out.println("1) Kwadrat");
        System.out.println("2) Prostokąt");
        System.out.println("3) Koło");
        System.out.println("4) Wyjdź z programu");
    }
   
     public static void podmenu()
    {
        System.out.println("Wybierz opcję");
        System.out.println("1) Obwód");
        System.out.println("2) Pole");
        System.out.println("3) Wejdź do menu głównego");
        
    }
     
     public static int kontrola(double liczba)
     {
        int dobra;
        if(liczba<0) {System.out.println("Liczba jest ujemna!"); dobra = 0;}
        else{dobra = 1;}
        return dobra;
     }
//----------------------KWADRAT-------------------------------------------------
     public static double obwod_kwadrata(double bok)
    {
        return bok * 4;
    }
    
    public static double pole_kwadrata(double bok)
    {
        return bok * bok;
    }
    
    public static void obliczenia_dla_kwadrata()
    {
        int rola, dobra;
        double bok;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            podmenu();
            rola = sc.nextInt();
            switch(rola)
            {
                case 1: do
                        {
                            System.out.println("Podaj bok kwadrata");
                            bok = sc.nextDouble();
                            dobra = kontrola(bok);
                        }
                        while(dobra==0);
                        System.out.println("Obwód kwadrata wynosi: " + obwod_kwadrata(bok));
                                break;
                case 2: do
                        {   
                            System.out.println("Podaj bok kwadrata");
                            bok = sc.nextDouble();
                            dobra = kontrola(bok);
                        }
                        while(dobra==0);
                        System.out.println("Pole kwadrata wynosi: " + pole_kwadrata(bok));
                            break;
                case 3: System.out.println("Powrót do menu głównego");
                            break;
                default: System.out.println("Zły wybór!");
            }
        }
        while(rola != 3);
    }
    
//----------------------PROSTOKĄT-----------------------------------------------
    public static double obwod_prostokata(double bok1, double bok2)
    {
        return ((2 * bok1) + (2 * bok2));
    }
    
    public static double pole_prostokata(double bok1, double bok2)
    {
        return (bok1 * bok2);
    }
    
    public static void obliczenia_dla_prostokata()
    {
        int rola, dobra;
        double bok1, bok2;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            podmenu();
            rola = sc.nextInt();
            switch(rola)
            {
                case 1: do
                        {   
                            System.out.println("Podaj pierwszy bok prostokąta");
                            bok1 = sc.nextDouble();
                            dobra = kontrola(bok1);
                        }
                        while(dobra==0);
                        do
                        {
                            System.out.println("Podaj drugi bok prostokąta");
                            bok2 = sc.nextDouble();
                            dobra = kontrola(bok2);
                        }
                        while(dobra==0);
                        System.out.println("Obwód kwadrata wynosi: " + obwod_prostokata(bok1, bok2));
                            break;
                case 2: do
                        {
                            System.out.println("Podaj pierwszy bok prostokąta");
                            bok1 = sc.nextDouble();
                            dobra = kontrola(bok1);
                        }
                        while(dobra==0);
                        do
                        {
                            System.out.println("Podaj drugi bok prostokąta");
                            bok2 = sc.nextDouble();
                            dobra = kontrola(bok2);
                        }
                        while(dobra==0);
                        System.out.println("Pole kwadrata wynosi: " + pole_prostokata(bok1, bok2));
                            break;
                case 3: System.out.println("Powrót do menu głównego");
                            break;
                default: System.out.println("Zły wybór!");
            }
        }
        while(rola != 3);

    }
//----------------------KOŁO----------------------------------------------------
    public static double obwod_kola(double r)
    {
        return 2*r;
    }
    
    public static double pole_kola(double r)
    {
        return r*r;
    }
    
    public static void obliczenia_dla_kola()
    {
        int rola, dobra;
        double r;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            podmenu();
            rola = sc.nextInt();
            switch(rola)
            {
                case 1: do
                        {   
                            System.out.println("Podaj promień koła");
                            r = sc.nextDouble();
                            dobra = kontrola(r);
                        }
                        while(dobra==0);
                            System.out.println("Obwód koła wynosi: " + obwod_kola(r) + "π"); // π = pi
                            break;
                case 2: do
                        {
                            System.out.println("Podaj promień koła");
                            r = sc.nextDouble();
                            dobra = kontrola(r);
                        }
                        while(dobra==0);
                        System.out.println("Pole koła wynosi: " + pole_kola(r) + "π"); // π = pi
                            break;
                case 3: System.out.println("Powrót do menu głównego");
                            break;
                default: System.out.println("Zły wybór!");
            }
        }
        while(rola != 3);

    }
}
