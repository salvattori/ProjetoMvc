import model.*;
import controller.*;
import view.*;

import java.util.Scanner;

public class main {
    private static Model model;
    public static void main(String[] args) {
        model = Model.getInstance();
        initializeModel(model);
        View view = new View(model);
    }

    private static void initializeModel(Model model) {
        model.addCliente(new Cliente("Victor", 20, "salvatas97@gmail.com"));

    }
}


