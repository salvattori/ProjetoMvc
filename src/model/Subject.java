package model;
import java.util.List;
import view.Observer;

public interface Subject {
    public void registerObserver(view.Observer o);
    public void removeObserver(view.Observer o);
    public void notifyObserversAddCliente();
    public void notifyObserversAddFornecedor();
    public void notifyObserversSearch(List result);
}
