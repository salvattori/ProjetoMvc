package model;

/**
 * Created by rosalina on 14/08/2017.
 */
public class Fornecedor {
    private String name;
    private int age;
    private String email;
    private FornecedorDetail FornecedorDetail;

    public Fornecedor(String name, int age, String email, FornecedorDetail FornecedorDetail) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.FornecedorDetail = FornecedorDetail;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public FornecedorDetail getFornecedordetail() {
        return FornecedorDetail;
    }


}
