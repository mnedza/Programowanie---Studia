package zadanie2;

public class Zadanie2 {

    public static void main(String[] args) {
        
        double metry, jardy, cale, stopy, mile;
        
        System.out.println("Tabela przeliczników odległości:");
        System.out.println("metry   jardy   cale    stopy   mile");
        
     
        for(int i=5; i<=100; i+=5 )
        {
            metry = i;
           
                jardy = metry * 1.0936133;
                jardy *= 100;
                jardy = Math.round(jardy);
                jardy /= 100; 
       
                cale = metry * 39.3700787;
                cale *= 100;
                cale = Math.round(cale);
                cale /= 100;

            
                stopy = metry * 3.2808399;
                stopy *= 100;
                stopy = Math.round(stopy);
                stopy /= 100;

            
                mile = metry * 0.0006213699;
                mile *= 100;
                mile = Math.round(mile);
                mile /= 100;

            
            System.out.println(metry + "    " + jardy + "    " + cale + "   " + stopy + "    " + mile + "    " ); 
            
        }
        
    }
    
}
