package model;
import java.util.List;

public interface Subject {
    public void registerObserver(view.Observer o);
    public void removeObserver(view.Observer o);
    public void notifyObservers(List matchingClientes);
}
