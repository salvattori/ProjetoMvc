package view;
import java.util.List;
/**
 * Created by rosalina on 14/08/2017.
 */
public interface Observer {
    public void update(List l);
    public void update(String msg);
}
