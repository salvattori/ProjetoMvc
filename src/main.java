import model.*;
import controller.*;
import view.*;

public class main {
    public static void main(String[] args) {
        Model i = new Model();
        initializeModel(i);
        View v = new View();

        BuscaCliente b = new BuscaCliente(v, i);
        v.setBusca(b);
        i.registerObserver(v);
        i.searchCliente(new ClienteDetail(981092712,
                "rua esta", 404169869, "feminino"));


        BuscaFornecedor z = new BuscaFornecedor(v,i);
        v.setBusca(b);
        i.registerObserver(v);
        i.searchFornecedor(new FornecedorDetail(982990024,
                "rua nenhuma", 470161986, "masculino"));


    }
    private static void initializeModel(Model model) {
        model.addCliente("Victor", 20, "salvatas97@gmail.com", new ClienteDetail(981340842,
                "rua joao", 123456789, "masculino"));
        model.addCliente("Manuela", 18, "manuela@gmail.com", new ClienteDetail(981780842,
                "rua maria", 470416199, "feminino"));
        model.addCliente("Wilson", 53, "wilson@gmail.com", new ClienteDetail(981911342,
                "rua fulano", 470419869, "masculino"));
        model.addCliente("Nileny", 41, "nileny@gmail.com", new ClienteDetail(988923842,
                "rua aquela", 471619869, "feminino"));
        model.addFornecedor("Pricila", 33, "pricila@gmail.com", new FornecedorDetail(981092712,
                "rua esta", 404169869, "feminino"));
        model.addFornecedor("Felipe", 47, "falipe@gmail.com", new FornecedorDetail(982990024,
                "rua nenhuma", 470161986, "masculino"));

    }
}


