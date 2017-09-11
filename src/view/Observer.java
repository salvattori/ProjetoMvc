package view;
import model.Cliente;
import model.Fornecedor;

import java.util.List;
/**
 * Created by rosalina on 14/08/2017.
 */
public interface Observer {
    public void updateSearchCliente(List<Cliente> l);
    public void updateSearchFornecedor(List<Fornecedor> l);
    public void updateAddCliente(List<Cliente> l);
    public void updateAddFornecedor(List<Fornecedor> l);
    public void updateDelete(List<Cliente> l);
}
