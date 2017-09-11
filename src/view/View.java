package view;

import controller.*;
import model.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rosalina on 14/08/2017.
 */
public class View implements Observer {
    private Busca busca;
    private Adiciona adiciona;
    private List<Cliente> clienteList;
    private List<Fornecedor> fornecedorList;
    private Model model;

    public View(Model model){
        clienteList = new LinkedList<Cliente>();
        fornecedorList = new LinkedList<Fornecedor>();
        this.model = model;
    }

    public void setBusca(Busca b){
        busca = b;
    }
    public void setAdiciona(Adiciona a){adiciona = a;}

    public void updateSearchCliente(List<Cliente> l) {
        clienteList = l;
        busca.buscar();
    }

    public void updateSearchFornecedor(List<Fornecedor> l) {
        fornecedorList = l;
        busca.buscar();
    }

    public void updateAddCliente(List<Cliente> l) {
        clienteList = l;
        adiciona.adicionar();
    }

    public void updateAddFornecedor(List<Fornecedor> l) {
        fornecedorList = l;
        adiciona.adicionar();
    }

    public void updateDelete(List<Cliente> l) {}

    public void displayCliente(){
        if(!clienteList.isEmpty()){
            for(Object i:clienteList){
                Cliente cliente = (Cliente) i;
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
        if (!fornecedorList.isEmpty()){
            for (Object i: fornecedorList){
                Fornecedor fornecedor = (Fornecedor) i;
                System.out.println("------------------------");
                System.out.println("Buscar o Fornecedor: " + fornecedor.getName());
                System.out.println("Nome: "+ fornecedor.getName());
                System.out.println("Idade: "+ fornecedor.getAge());
                System.out.println("Email: "+ fornecedor.getEmail());
                //System.out.println("Tel: "+ fornecedor.getFornecedordetail().getTel());
                //System.out.println("CPF: "+ fornecedor.getFornecedordetail().getCpf());
                System.out.println("------------------------");
            }
        }else {
            System.out.println("Não foi encontrado nenhum Fornecedor com esse nome");
        }
    }


    //"interface" para adicionar usuarios
    public void displayAddCliente(){
        Scanner s = new Scanner(System.in);
        String name, email;
        int age;
        System.out.println("Digite o nome do cliente:");
        name = s.nextLine();
        System.out.println("Digite o email do cliente:");
        email = s.nextLine();
        System.out.println("Digite a idade do cliente:");
        age = s.nextInt();
        Cliente cliente = new Cliente(name, age, email);
        clienteList.add(cliente);

    }
    public void displayAddFornecedor(){
        Scanner s = new Scanner(System.in);
        String name, email;
        int age;
        System.out.println("Digite o nome do fornecedor:");
        name = s.nextLine();
        System.out.println("Digite o email do fornecedor:");
        email = s.nextLine();
        System.out.println("Digite a idade do fornecedor:");
        age = s.nextInt();
        Fornecedor fornecedor = new Fornecedor(name, age, email);
        fornecedorList.add(fornecedor);

    }

    Integer opcao = 9;
    Scanner leitor = new Scanner(System.in);

    while (opcao != 0) {
        System.out.println("=============Sistema de Cadastro=============");
        System.out.println("Escolha a sua opção");
        System.out.println("1 - Buscar");
        System.out.println("2 - Adicionar");
        System.out.println("0 - Sair");
        opcao = leitor.nextInt();
        if(opcao.equals(1)){
            System.out.println("O que gostaria de pesquisar?");
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("0 - Sair");
            opcao = leitor.nextInt();
            if(opcao.equals(1)){
                BuscaCliente cliente = new BuscaCliente(v, i);
                v.setBusca(new BuscaCliente(v,i));
                i.registerObserver(v);
                cliente.buscar();
            }
            if(opcao.equals(2)){
                BuscaFornecedor fornecedor = new BuscaFornecedor(v, i);
                v.setBusca(fornecedor);
                i.registerObserver(v);
                fornecedor.buscar();
            }

        }
        else if(opcao.equals(2)){
            System.out.println("O que gostaria de adicionar?");
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("0 - Sair");
            opcao = leitor.nextInt();
            if(opcao.equals(1)){
                AdicionaCliente cliente = new AdicionaCliente(v, i);
                v.setAdiciona(cliente);
                i.registerObserver(v);
                cliente.adicionar();
            }
            if(opcao.equals(2)){
                AdicionaFornecedor fornecedor = new AdicionaFornecedor(v, i);
                v.setAdiciona(fornecedor);
                i.registerObserver(v);
                fornecedor.adicionar();
            }
        }

    }


}




}
