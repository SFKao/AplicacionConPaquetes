package com.iesvirgendelcarmen.oscar.app.views;

import com.iesvirgendelcarmen.oscar.app.models.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteViews implements ClienteView{

    private ArrayList<Cliente> clientes;
    private static Scanner teclado = new Scanner(System.in);

    public ClienteViews() {
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void addCliente() {
        System.out.println("Introduce el nombre del cliente");
        Cliente c = new Cliente(teclado.nextLine());
        if(clientes.contains(c)){
            System.out.println("El cliente ya esta");
            return;
        }
        clientes.add(c);
    }

    @Override
    public void delCliente() {
        Cliente b = buscarCliente();
        clientes.remove(b);
    }

    @Override
    public Cliente buscarCliente() {
        System.out.println(mostrarListaClientes());
        System.out.println("Introduce el nombre.");
        String buscar = teclado.nextLine();
        for (Cliente e: clientes) {
            if(e.getNombre().equals(buscar)){
                return e;
            }
        }
        return null;
    }

    @Override
    public void modificarCliente() {
        Cliente c = buscarCliente();
        if(c==null){
            System.out.println("No se ha encontrado el cliente");
            return;
        }
        System.out.println("Introduce el nuevo nombre");
        c.setNombre(teclado.nextLine());
    }

    @Override
    public String mostrarListaClientes() {
        String aux = "";
        for (Cliente e: clientes) {
            aux= aux + e.toString() + "\n";
        }
        return aux;
    }
}
