import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elkin Yamith Almonacid López
        //El siguiente codigo simula el funcionamiento de una alcancia con opciones que permiten añadir monedas, contarlas, calcular el total del dinero y romperla.
        //20-08-2024
        Scanner teclado = new Scanner(System.in);
        int num=0;
        int mon, total20, total50, total100, total200, total500, total;
        int cont20=0, cont50=0, cont100=0, cont200=0, cont500=0;

        while(num<5){
            System.out.println("1. AGREGAR UNA MONEDA");
            System.out.println("2. CONTAR MONEDAS");
            System.out.println("3. CALCULAR EL TOTAL DEL DINERO");
            System.out.println("4. ROMPER LA ALCANCIA");
            System.out.println("ELIJA UNA OPCION:");
            num=teclado.nextInt();

            switch (num){
                case 1:
                    System.out.println("Moneda a añadir:");
                    System.out.println("1. $20");
                    System.out.println("2. $50");
                    System.out.println("3. $100");
                    System.out.println("4. $200");
                    System.out.println("5. $500");
                    mon=teclado.nextInt();
                    if(mon==1){
                        cont20++;
                    }if(mon==2){
                    cont50++;
                    }if(mon==3){
                    cont100++;
                    }if(mon==4){
                    cont200++;
                    }if (mon==5){
                    cont500++;
                    }
                    break;
                case 2:
                    System.out.println("Monedas de $20: "+cont20);
                    System.out.println("Monedas de $50: "+cont50);
                    System.out.println("Monedas de $100: "+cont100);
                    System.out.println("Monedas de $200: "+cont200);
                    System.out.println("Monedas de $500: "+cont500);
                    break;
                case 3:
                    total20=cont20*20;
                    total50=cont50*50;
                    total100=cont100*100;
                    total200=cont200*200;
                    total500=cont500*500;
                    total=total20+total50+total100+total200+total500;
                    System.out.println("El total de dinero ahorrado es $"+total);
                    break;
                case 4:
                    cont20=0;
                    cont50=0;
                    cont100=0;
                    cont200=0;
                    cont500=0;
                    total20=0;
                    total50=0;
                    total100=0;
                    total200=0;
                    total500=0;
                    break;
                default:
                    System.out.println("LA OPCION NO EXISTE");
            }
        }
    }
}