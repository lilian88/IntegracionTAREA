/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nivel1c12;
import java.util.Scanner;

/**
 * programa:Nivel1c12
 * descripcion:mostrar un menu al usuario mostrado la operacion que desee ahcer
 * fecha:18 de junio del 2014
 * @author IRvInG
 */
public class Nivel1c12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mientrada = new Scanner (System.in);
        String clave="ilzo",usuario="irving";
        String miclave="",miusuario="";
        int contador=0,bandera=0;
        while (bandera==0){
            System.out.println("ingrese su nombre de usuario ==> ");
            miusuario=mientrada.nextLine();
            System.out.println("ingrese su clave ==> ");
            miclave=mientrada.nextLine();
            contador=contador+1;
            if ((usuario.equals(miusuario))&&(clave.equals(miclave))){
                bandera=1;
            }
            if (contador==3)  {
                bandera=1;
            }
        }
        if ((usuario.equals(miusuario))&&(clave.equals(miclave))) {
            System.out.println("bienvenido al sistema");
            System.out.println("****** calculadora basica*******");
            System.out.println("****** sumar *******");
            System.out.println("****** restar ******");
            System.out.println("****** multiplicar ******");
            System.out.println("****** dividir ******");
        }
            
        else{
            System.out.println("sistema bloqueado");
        }
    }
}
    
    

