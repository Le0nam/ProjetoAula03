package uniderp.poo.escola.dominio;

import java.time.LocalDate;



public class Professor extends Pessoa
{
    private String registro;
    private String dataContratacao;

    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }


    public Professor(){}
    
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
    String cpf, LocalDate dataInsercao, String registro, String dataContratacao)
    {
        
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
}
