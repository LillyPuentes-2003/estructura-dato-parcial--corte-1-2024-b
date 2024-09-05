import javax.swing.*;
import java.util.Scanner;

public class ParcialEstructura {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String nomCliente;
        String nomProducto;
        double valorUnitario;
        int cantidad;
        double valorBruto;
        double descuento;
        double valorDescuento;
        double valorNeto;
        System.out.print("Digite el nombre del cliente: ");
        nomCliente = scanner.next();

        System.out.print("Digite el nombre del Producto: ");
         nomProducto = scanner.next();

         System.out.print("Digite el valor unitario: ");
        valorUnitario = scanner.nextDouble();
           if (valorUnitario<=0){ System.out.println("Error en la entrada de datos");

           System.out.print("Ingrese la cantidad a comprar: ");
               cantidad = scanner.nextInt();

          if (cantidad <= 0) {
            System.out.println("Error en la entrada de datos");
            return;
          }


              if (cantidad < 10) {
                  descuento = 0;
              } else if (cantidad < 20) {
                  descuento = 0.05;
              } else {
                  descuento = 0.07;
              }


          }

    }

    }

