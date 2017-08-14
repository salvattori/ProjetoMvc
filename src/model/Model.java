package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import view.Observer;

/**
 * Created by rosalina on 14/08/2017.
 */
public class Model implements Subject {
    private List<Observer> observers;
    private List<Cliente> clietes;
    private List<Fornecedor> fornecedores;


    public Model(){
        observers = new LinkedList<>();
        clietes = new LinkedList();
        fornecedores = new LinkedList();
    }

    public void registerObserver(view.Observer o) {
        observers.add(o);
    }

    public void removeObserver(view.Observer o) {
        observers.remove(o);

    }

    public void notifyObserversAddCliente() {
        for(Object i:observers){
            Observer ob =(Observer)i;
            ob.update("Cliente Cadastrado");
        }

    }
    public void notifyObserversAddFornecedor() {
        for(Object i:observers){
            Observer ob =(Observer)i;
            ob.update("Fornecedor Cadastrado");
        }

    }

    public void notifyObserversSearch(List result) {
        for(Object i:observers){
            Observer obs = (Observer)i;
            obs.update(result);
        }
    }

    public void addCliente(String name, int age, String email, ClienteDetail clienteDetail){
        Cliente cliente = new Cliente(name, age, email, clienteDetail);
        clietes.add(cliente);
        notifyObserversAddCliente();
    }
    public void addFornecedor(String name, int age, String email, FornecedorDetail FornecedorDetail){
        Fornecedor fornecedor = new Fornecedor(name, age, email, FornecedorDetail);
        fornecedores.add(fornecedor);
        notifyObserversAddFornecedor();
    }
    public void searchCliente(ClienteDetail searchClienteDetail){
        List matchingClientes = new LinkedList();
        for(Iterator i = clietes.iterator(); i.hasNext(); ){
            Cliente cliente = (Cliente)i.next();
            if(cliente.getClienteDetail().matches(searchClienteDetail))
                matchingClientes.add(cliente);
        }
        notifyObserversSearch(matchingClientes);
    }
    public void searchFornecedor(FornecedorDetail searchFornecedorDetail){
        List matchingFornecedores = new LinkedList();
        for(Iterator i = fornecedores.iterator(); i.hasNext(); ){
            Fornecedor fornecedor = (Fornecedor) i.next();
            if(fornecedor.getFornecedordetail().matches(searchFornecedorDetail))
                matchingFornecedores.add(fornecedor);
        }
        notifyObserversSearch(matchingFornecedores);
    }
}
