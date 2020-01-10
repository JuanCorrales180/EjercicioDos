package ejerciciodos;

import java.util.Scanner;
public class EjercicioDos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double peso = 0;
        String continuar = "si";
        Avion boing;
//        int op=0;
//        
//        System.out.println("1 total bultos OP");
//        op = leer.nextInt();
//        
//        do{
//             System.out.println("1 total bultos CONTINUAR");
//             continuar = leer.next();
//            switch(op){
//            
//            case 1:  
//                 boing = new Avion(300);
//                System.out.println("los bultos engresados son " + boing.getNumTotalBultos());
//                
//                break;
//            case 2:
//                 boing = new Avion(300);
//                boing.getValorKiloBulto();
//                System.out.println("Valor del bulto: " + boing.getAcumudorPrecioBulto());
//                break;
//            default: 
//                break;
//        }
//        }while(continuar.equals("si"));
        
        
        
        
        
        
//        
//        switch(op){
//            
//            case 1:  
//                 boing = new Avion(300);
//                System.out.println("los bultos engresados son " + boing.getNumTotalBultos());
//                
//                break;
//            case 2:
//                 boing = new Avion(300);
//                boing.getValorKiloBulto();
//                System.out.println("Valor del bulto: " + boing.getAcumudorPrecioBulto());
//                break;
//            default: 
//                break;
//        }
        
        

        
        do{
            System.out.println("Ingrese peso equipaje");
            peso = leer.nextInt();
            boing = new Avion(peso);
            boing.getValorKiloBulto();
        
            
            System.out.println("Desea continuar");
            continuar = leer.next();
            
        }while(continuar.equals("si"));
        
        System.out.println("Valor del bulto: " + boing.getAcumudorPrecioBulto());
        System.out.println("bultos ingresados : " + boing.getNumTotalBultos());
        System.out.println("bulto de menor peso : " + boing.getMenor());
        System.out.println("bulto de mayor peso : " + boing.getMayor());
        System.out.println("Promedio de bultos : " + boing.getPromedioBultos());
        

        
        
    }
    
}
