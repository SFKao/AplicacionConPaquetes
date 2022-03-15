package com.iesvirgendelcarmen.oscar.app.views;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrincipalView {
    private boolean salir;
    private boolean error;
    private static Scanner teclado = new Scanner(System.in);
    private ClienteViews clienteViews;

    public PrincipalView() {
        clienteViews = new ClienteViews();
        salir = false;
        error = false;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        PrincipalView.teclado = teclado;
    }

    public ClienteViews getClienteViews() {
        return clienteViews;
    }

    public void setClienteViews(ClienteViews clienteViews) {
        this.clienteViews = clienteViews;
    }

    public void inicioViews() {
        do{
            int opcion = dameOpcion();
            switch (opcion){
                case 1:
                    clienteViews.addCliente();
                    break;
                case 2:
                    System.out.println(clienteViews.mostrarListaClientes());
                    break;
                case 3:
                    clienteViews.modificarCliente();
                    break;
                case 4:
                    clienteViews.delCliente();
                    break;
                case 5:
                    if (clienteViews.buscarCliente() != null) {
                        System.out.println("El cliente existe");
                    } else {
                        System.out.println("El cliente NO existe");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }while (!salir);
    }

    public void mostrarMenu(){
        System.out.println("--------MENU--------");
        System.out.println("(1) añadir cliente");
        System.out.println("(2) listar clientes");
        System.out.println("(3) modificar cliente");
        System.out.println("(4) borrar cliente");
        System.out.println("(5) mirar si existe cliente");
        System.out.println("(6) salir");
    }

    public int dameOpcion()  {
        int n = 0;
        do{
            mostrarMenu();
            System.out.println("Introduce opcion");
            try{
                n = Integer.parseInt(teclado.nextLine());
            }catch (NumberFormatException e){
                n = 0;
                System.out.println("Eso no es un numero");
            }
        }while (!(n>0 && n<=6));
        return n;
    }
}
