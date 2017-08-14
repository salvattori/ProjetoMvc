package model;


public class FornecedorDetail {
    private Number tel;
    private String end;
    private Number cpf;
    private String sexo;

    public FornecedorDetail(Number tel, String end, Number cpf, String sexo){
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
    public boolean matches(FornecedorDetail otherFornecedorDetail){
        if ((tel != null) && (!tel.equals("") &&
                (!tel.equals(otherFornecedorDetail.tel))))
            return false;
        if ((end != null) && (!end.equals("") &&
                (!end.toLowerCase().equals(otherFornecedorDetail.end.toLowerCase()))))
            return false;
        if ((cpf != null) && (!cpf.equals("") &&
                (!cpf.equals(otherFornecedorDetail.cpf))))
            return false;
        if ((sexo != null) && (!sexo.equals("") &&
                (!sexo.toLowerCase().equals(otherFornecedorDetail.sexo.toLowerCase()))))
            return false;
        return true;
    }
}
