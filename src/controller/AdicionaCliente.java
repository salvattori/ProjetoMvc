package controller;

import model.Model;
import model.Subject;
import view.View;

public class AdicionaCliente implements Adiciona {
    private View view;
    private Model model;

    public AdicionaCliente(View o, Subject s){
        view = o;
        model = (Model) s;
    }
    public void adicionar() {
        view.displayAddCliente();
    }
}
