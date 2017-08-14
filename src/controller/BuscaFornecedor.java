package controller;
import view.*;
import model.*;


public class BuscaFornecedor implements Busca {
    private View view;
    private Model model;

    public BuscaFornecedor(View o, Subject s){
        view = o;
        model = (Model) s;
    }


    public void buscar() {
        view.displayFornecedor();
    }
}
