package com.iesvirgendelcarmen.oscar.app.views;

import com.iesvirgendelcarmen.oscar.app.models.Cliente;

public interface ClienteView {
    void addCliente();
    void delCliente();
    Cliente buscarCliente();
    void modificarCliente();
    String mostrarListaClientes();
}
