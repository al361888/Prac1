package Inicio;

import cliente.Cliente;

import java.util.Scanner;

public class Inicio {

    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);
        int eleccion;
        while (true){
            System.out.println("--FACTURAPPS--");
            System.out.println("¿Qué quieres hacer? (Pulsa el número correspondiente a la elección deseada)");
            System.out.println("(1) Nuevo cliente ");
            System.out.println("(2) Borrar cliente");
            System.out.println("(3) Cambiar tarifa");
            System.out.println("(4) Recuperar datos asociados a NIF");
            System.out.println("(5) Lista de clientes");
            System.out.println("(6) Dar de alta una llamada");
            System.out.println("(7) Listar llamadas del cliente");
            System.out.println("(8) Emitir factura del cliente");
            System.out.println("(9) Recuperar datos de factura");
            System.out.println("(10) Recuperar facturas del cliente");
            System.out.println("Elige: ");

            while (true){
                try {
                    eleccion = scan.nextInt();
                    break;
                }catch (Exception e){
                    System.exit(0);
                }

            }

            switch (eleccion){
                case 1:
                    altaCliente();
                    break;
                case 2:
                    borradoCliente();
                    break;
                case 3:
                    cambioTarifa();
                    break;
                case 4:
                    recuperarDatosNIF();
                    break;
                case 5:
                    recuperarListaClientes();
                    break;
                case 6:
                    altaLlamada();
                    break;
                case 7:
                    listaLlamadas();
                    break;
                case 8:
                    importeFactura();
                    break;
                case 9:
                    mostrarFacura();
                    break;
                case 10:
                    listaFacturas();
                    break;
                default:
                    System.out.println("Elección no válida.");
                    break;
            }
        }

    }

    /*private static String inputInfo(String dato){
        String eleccion = null;
        Scanner scan = new Scanner(System.in);
        try {
            eleccion = scan.next();
        }catch (Exception e){
            System.exit(0);
        }
        return eleccion;
    }*/

    private static int tipoCliente(){
        return 0;
    }
        

    private static void altaCliente() {
        System.out.println("¿Qué tipo de cliente eres?");
        System.out.println("(1) Particular");
        System.out.println("(2) Empresa");
        int eleccion = 0;
        Scanner scan = new Scanner(System.in);
        try {
            eleccion = scan.nextInt();
        }catch (Exception e){
            System.exit(0);
        }
        if (eleccion == 1){

        }else if (eleccion == 2){

        }else{
            System.out.println("Por favor, elige una opción válida.");
        }


    }

    private static void borradoCliente() {

    }

    private static void cambioTarifa() {

    }

    private static void recuperarDatosNIF(){

    }

    private static void recuperarListaClientes() {

    }

    private static void altaLlamada() {

    }

    private static void listaLlamadas() {

    }

    private static void importeFactura() {

    }

    private static void mostrarFacura() {

    }

    private static void listaFacturas() {

    }

}
