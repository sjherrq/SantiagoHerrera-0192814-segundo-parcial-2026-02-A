import java.util.Scanner;
public class CentroReciclaje {

   
    public static int PesoPermitido(int PesoIngresado){
       int PesoPermitido=0;

    while (PesoIngresado>=3 && PesoIngresado<=60) {
        PesoIngresado=PesoPermitido;

       if (PesoIngresado<3 || PesoIngresado>60){
        System.out.println("valor fuera del rango");
       }
    }
       return PesoPermitido;
    }

    public static int Cantidad(int PesoPermitido){
        int hayotro=1;
        int cantidad=0;
        while (hayotro==1){
            cantidad++;
            while (cantidad>=3 && cantidad<=20){

            }
        } 
        return cantidad;
    }





    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese peso");
        int ingresado = teclado.nextInt();
        int permitidos=PesoPermitido(ingresado);
        for (int index = 0; index < Cantidad(permitidos); index++) {
            
        }
        System.out.println("Estaba mejor el de las entregas");

        teclado.close();
    }
}
