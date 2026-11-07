import java.util.Scanner;
public class CentroReciclaje {
    Scanner teclado = new Scanner(System.in);
    public static int PesoPermitido(int PesoIngresado){
        int PesoPer;
        PesoIngresado= 
        if (PesoIngresado>=3 && PesoIngresado<=60){
            PesoPer=PesoIngresado;
        }
        return PesoPer;
    }



    public static void main(String[] args) throws Exception {
        System.out.println("ingrese peso");

    }
}
