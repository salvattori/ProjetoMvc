package model;


public class ClienteDetail {
    private Number tel;
    private String end;
    private Number cpf;
    private String sexo;

    public ClienteDetail(Number tel, String end, Number cpf, String sexo){
        this.tel = tel;
        this.end = end;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Number getTel(){
        return tel;
    }
    public String getEnd(){
        return end;
    }
    public Number getCpf(){
        return cpf;
    }
    public String getSexo(){
        return sexo;
    }
    public boolean matches(ClienteDetail otherClienteDetail){
        if ((tel != null) && (!tel.equals("") &&
                (!tel.equals(otherClienteDetail.tel))))
            return false;
        if ((end != null) && (!end.equals("") &&
                (!end.toLowerCase().equals(otherClienteDetail.end.toLowerCase()))))
            return false;
        if ((cpf != null) && (!cpf.equals("") &&
                (!cpf.equals(otherClienteDetail.cpf))))
            return false;
        if ((sexo != null) && (!sexo.equals("") &&
                (!sexo.toLowerCase().equals(otherClienteDetail.sexo.toLowerCase()))))
            return false;
        return true;
    }
}
