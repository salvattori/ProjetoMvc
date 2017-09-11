package controller;

import model.Model;
import model.Subject;
import view.View;

public class AdicionaFornecedor implements Adiciona {
    private View view;
    private Model model;

    public AdicionaFornecedor(View o, Subject s){
        view = o;
        model = (Model) s;
    }
    public void adicionar() {
        view.displayAddFornecedor();
    }
}
