package controller;
import view.*;
import model.*;


public class BuscaCliente implements Busca {
    private View view;
    private Model model;

    public BuscaCliente(View o, Subject s){
        this.view = o;
        this.model = (Model) s;
    }


    public void buscar() {
        model.searchCliente(Cliente cliente);
    }


}
