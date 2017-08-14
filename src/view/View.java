package view;

import controller.*;
import model.Cliente;
import model.Fornecedor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rosalina on 14/08/2017.
 */
public class View implements Observer {
    private Busca busca;
    private List list;

    public View(){
        list = new LinkedList();
    }

    public void setBusca(Busca b){
        busca = b;
    }

    public void update(List l) {
        list = l;
        busca.buscar();
    }

    public void update(String msg) {

    }

    public void displayCliente(){
        if(!list.isEmpty()){
            for(Object i:list){
                Cliente cliente = (Cliente)i;
                System.out.println("------------------------");
                System.out.println("Buscar o Cliente: " + cliente.getName());
                System.out.println("Nome: "+ cliente.getName());
                System.out.println("Idade: "+ cliente.getAge());
                System.out.println("Email: "+ cliente.getEmail());
                System.out.println("------------------------");
            }
        }else {
            System.out.println("Não foi encontrado nenhum Cliente com esse nome");
        }
    }

    public void displayFornecedor(){
        if (!list.isEmpty()){
            for (Object i: list){
                Fornecedor fornecedor = (Fornecedor) i;
                System.out.println("------------------------");
                System.out.println("Buscar o Fornecedor: " + fornecedor.getName());
                System.out.println("Nome: "+ fornecedor.getName());
                System.out.println("Idade: "+ fornecedor.getAge());
                System.out.println("Email: "+ fornecedor.getEmail());
                System.out.println("Tel: "+ fornecedor.getFornecedordetail().getTel());
                System.out.println("CPF: "+ fornecedor.getFornecedordetail().getCpf());
                System.out.println("------------------------");
            }
        }else {
            System.out.println("Não foi encontrado nenhum Fornecedor com esse nome");
        }
    }
}
