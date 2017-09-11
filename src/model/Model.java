package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import view.Observer;

/**
 * Created by rosalina on 14/08/2017.
 */
public class Model implements Subject {
    private List<Observer> observerList;
    private List<Cliente> clienteList;
    private List<Fornecedor> fornecedorList;
    private static Model uniqueInstance;

    public static Model getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Model();
        }
    }
    private Model(){
        observerList = new LinkedList<>();
        clienteList = new LinkedList();
        fornecedorList = new LinkedList();
    }

    public void registerObserver(view.Observer o) {
        observerList.add(o);
    }
    public void removeObserver(view.Observer o) { observerList.remove(o); }
    public void notifyObservers(List matchingClientes) {
        for(Object i: observerList){
            Observer ob =(Observer)i;
            ob.updateSearchCliente(matchingClientes);
        }

    }

    public void addCliente(Cliente cliente){this.clienteList.add(cliente);}
    public void addFornecedor(Fornecedor fornecedor){this.fornecedorList.add(fornecedor);}

    public void searchCliente(Cliente cliente){
        List<Cliente> matchingClientes = new LinkedList<>();
        for(Cliente i : clienteList){
            Cliente clientesCadastrados = i;
            if(cliente.getName().equals(cliente)){
                matchingClientes.add(cliente);
            }

        }
        notifyObservers(matchingClientes);
    }
    public void searchFornecedor(Fornecedor fornecedor){
        List<Fornecedor> matchingFornecedores = new LinkedList<>();
        for(Fornecedor i : fornecedorList){
            Fornecedor fornecedoresCadastrados = i;
            if(fornecedoresCadastrados.equals(fornecedor)){
                matchingFornecedores.add(fornecedor);
            }

        }
        notifyObservers(matchingFornecedores);
    }
}
