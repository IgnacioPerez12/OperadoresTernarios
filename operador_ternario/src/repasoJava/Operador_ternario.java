package repasoJava;

import java.util.Scanner;

public class Operador_ternario {
    
    public static void main(String[] args) {
        
        /* Operador Ternario */
        //int edad = 20;   
        //System.out.println(edad>18?"Eres mayor de edad":"Eres menor de edad");
        
        
        /* Switch - continue */
        
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 1; i < 10; i++) {
            int numero = sc.nextInt();
            i = numero;
            
            switch(i){
                
                case 1:
                    System.out.println("ES EL NUMERO 1");
                    continue;
                
                case 10:
                    System.out.println("NUMERO 10");
                    break;   

                default:
                    if(i % 2 == 0){
                        System.out.println("Es par");
                    } else {
                        System.out.println("Es impar");
                    }
                    
            }
            
        }
        

    }
    
}