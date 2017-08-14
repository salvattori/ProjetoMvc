package controller;
import view.*;
import model.*;


public class BuscaCliente implements Busca {
    private View view;
    private Model model;

    public BuscaCliente(View o, Subject s){
        view = o;
        model = (Model) s;
    }


    public void buscar() {
        view.displayCliente();
    }
}
