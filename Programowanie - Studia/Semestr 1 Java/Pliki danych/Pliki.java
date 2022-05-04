package pliki;

import java.io.*;
import java.util.Scanner;

public class Pliki
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println(przetwarzajPlik("plikdanych.bin", "Towar"));
    }
    
    public static int przetwarzajPlik (String nazwaPliku, String nazwaTowaru) throws FileNotFoundException, IOException
    {
        String nazwa;
        double cena;
        int liczba_sztuk;
        int liczba = 0;
        FileInputStream fis = new FileInputStream(nazwaPliku);
        DataInputStream dis = new DataInputStream(fis);
        String [] tab_nazwa = new String[3];
        double [] tab_cena = new double [3];
        int [] tab_liczba = new int [3];
        for (int i = 0; i<3; i++)
        {
            nazwa = dis.readUTF();
            tab_nazwa[i] = nazwa;
            cena = dis.readDouble();
            tab_cena[i] = cena;
            liczba_sztuk = dis.readInt();
            tab_liczba[i] = liczba_sztuk;
        }
        dis.close();
        
        for (int i = 0; i<tab_nazwa.length; i++)
        {
            if (tab_nazwa[i].equals(nazwaTowaru)){
                liczba = tab_liczba[i];
            }
        }
        FileOutputStream fos = new FileOutputStream(nazwaPliku);
        DataOutputStream dos = new DataOutputStream(fos);
        
        for (int i = 0; i<tab_liczba.length; i++)
        {
            dos.writeUTF(tab_nazwa[i]);
           if (tab_liczba[i] >= 100){
                tab_cena[i] = tab_cena[i] * 0.90;
            }
           dos.writeDouble(tab_cena[i]);
           dos.writeInt(tab_liczba[i]);
        }
        dos.close();
        return liczba;
    }
}