package zadanienapisy;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieNapisy
{
    static int ile;
    public static void main(String[] args)
    {   
        String napis;
        String napis2;
        int klucz = 0;
        String znak;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz słowo: ");
        napis = sc.nextLine();
        
        int wybor;
        
        do
        {
            menu();
            wybor = sc.nextInt();
            switch(wybor)
            {
                case 1 : System.out.println(odwrocony(napis));
                    break;
                case 2 : System.out.println(przestawioneSlowa( napis ));
                     break;
                case 3 :     System.out.println("Podaj klucz: ");
                                klucz = sc.nextInt();
                                System.out.println(szyfruj(napis, klucz ));
                    break;
                case 4 :    System.out.println("Podaj klucz: ");
                            klucz = sc.nextInt();
                            System.out.println(odszyfruj(napis, klucz ));
                    break;
                case 5 : System.out.println(uporzadkuj(napis));
                    break;
                case 6 :    System.out.println("Podaj znak: ");
                            znak = sc.next();
                                    System.out.println("znak '" + znak + "' wystąpił " + liczbaWystapien(napis, znak.charAt(0)) + " razy.");
                    break;
                case 7 :    int [] his = histogram(napis);
                            char[] alfabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                            System.out.println("Obliczenie liczby powtórzeń danej litery dla napisu:");
                            System.out.println(napis);
                            for (int i = 0; i < alfabet.length; i++)
                            {
                                System.out.println(alfabet[i] + " = " + his[i]);
                            }
                    break;
                case 8 :     if ((palindrom(napis)==true)) System.out.println("Słowo nie jest palindromem");
                                else System.out.println("Słowo jest palindromem");
                    break;
                case 9 :    System.out.println("Wpisz drugie słowo ");
                                napis2 = sc.next();
                                if ((anagram(napis, napis2))== true) System.out.println("Słowa są anagrami");
                                else System.out.println("Słowa nie są anagrami");
                    break;
                default: System.out.println("Nie wybrano żadnej opcji!");
            }
        }    
        while(wybor>9);   
    }
    
    public static void menu()
    {
        System.out.println("Wybierz funkcję do wykonania: ");
        System.out.println("1) odwrocony");
        System.out.println("2) przestawioneSlowa");
        System.out.println("3) szyfruj");
        System.out.println("4) odszyfruj");
        System.out.println("5) uporzadkuj");
        System.out.println("6) liczbaWystapien");
        System.out.println("7) histogram");
        System.out.println("8) palindrom");
        System.out.println("9) anagram");  
    }
    
    public static String odwrocony(String napis)
    {
        String napis2 = "";
        for(int i = 0 ; i < napis.length(); i++)
        {
              napis2 += (napis.charAt((napis.length() - (i+1)))); 
        }
        return napis2;
    }
    
    public static String przestawioneSlowa(String napis)
    {
        String[] tabzdanie = napis.split(" ");
        String napis2 = "";
        for(int i=0; i<tabzdanie.length; i++)
        {
            napis2 += (tabzdanie[tabzdanie.length - (i+1)] + " ");
        }
        return napis2;
    }
    
    public static String szyfruj(String napis, int klucz)
    {
        napis = napis.toLowerCase();
        String zaszyfrowanyNapis = "";
        for(int i=0; i<napis.length(); i++)
        {
            char litera = napis.charAt(i);
            if( litera >= 'a' && litera <= 'z')
            {
                litera = (char) ((litera - 'a' + klucz)% ('z' - 'a' + 1)+ 'a');
            }
            zaszyfrowanyNapis+=litera;
        }
        return zaszyfrowanyNapis;
    }
    
    public static String odszyfruj(String napis, int klucz)
    {
        napis = napis.toLowerCase();
        String zaszyfrowanyNapis = "";
        for(int i=0; i<napis.length(); i++)
        {
            char litera = napis.charAt(i);
            if( litera >= 'a' && litera <= 'z')
            {
                litera = (char) ((litera - 'a' - klucz)% ('z' - 'a' + 1)+ 'a');
            }
            zaszyfrowanyNapis+=litera;
        }
        return zaszyfrowanyNapis;
    }  
    
    public static String uporzadkuj(String napis)
    {
        while(napis.contains("  "))
        {
            napis = napis.replaceAll("  ", " ");
        }
        napis = napis.replaceAll(" ,", ",");
        napis = napis.replaceAll(",", ", "); 
        return napis;
    }
    
    public static int liczbaWystapien(String napis,char znak)
    {
        for(int i = 0; i < napis.length(); i++)
        {
            if(napis.charAt(i)== znak)
            {
                ile += 1;
            }
        }
        return ile;
    }
    
    public static int[] histogram(String napis)
    {
        int [] histogram = new int [26];
        char[] alfabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //26
        char[] tablicaNapisu = new char[napis.length()]; 
        int powtorzenia = 0;
        
            for (int i = 0; i < napis.length(); i++) //napis na tablicę
            { 
                tablicaNapisu[i] = napis.toLowerCase().charAt(i);  
            } 
        
            for (int i = 0; i < alfabet.length; i++) //sprawdza litery alfabetu
            {
                for (int j = 0; j < tablicaNapisu.length; j++) //sprawdza napis
                {
                    if (alfabet[i]==tablicaNapisu[j])
                    {
                        powtorzenia++;
                    }
                } 
                histogram[i]=powtorzenia;
                powtorzenia = 0;
            }
        return histogram;
    }
    
   public static boolean palindrom(String napis)
    {
        boolean bool;
        int h = napis.length();

        int xx =0;
        int x =(h -1);
        for(int i =0; i < h; i++){

            if(napis.charAt(i)!= napis.charAt(x)){
                xx = 1;
                break;
            }
            x--;
        }
        if(xx ==1)bool = true;
        else bool = false;
        
        return bool;
    }
    
    public static boolean anagram(String napis1, String napis2)
    {
        String string1 = napis1.replaceAll("\\s", "");  
        String string2 = napis2.replaceAll("\\s", "");  
        boolean bool;
        boolean status = true;  
        if (string1.length() != string2.length()) {  
            status = false;  
        } else {  
            char[] tablica_string1 = string1.toLowerCase().toCharArray();  
            char[] tablica_string2 = string2.toLowerCase().toCharArray();  
            Arrays.sort(tablica_string1);  
            Arrays.sort(tablica_string2);  
            status = Arrays.equals(tablica_string1, tablica_string2);  
        }  
        if (status)
            bool = true;  
        else
            bool = false;
           
        return bool;
    }
}

