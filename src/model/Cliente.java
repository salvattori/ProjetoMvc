package model;

/**
 * Created by rosalina on 14/08/2017.
 */
public class Cliente {
    private String name, email;
    private int age;
    //private ClienteDetail ClienteDetail;

    public Cliente(String name, int age, String email/*, ClienteDetail ClienteDetail*/) {
        this.name = name;
        this.age = age;
        this.email = email;
        //this.ClienteDetail = ClienteDetail;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){this.name = name;}

    public int getAge(){
        return age;
    }
    public void setAge(){this.age = age;}

    public String getEmail(){
        return email;
    }
    public String setEmail(){return email;}

    //public ClienteDetail getClienteDetail() {
        //return ClienteDetail;
    //}


}
