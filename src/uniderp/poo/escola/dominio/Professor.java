package uniderp.poo.escola.dominio;

import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Professor extends Pessoa
{
    private String registro;
    private Data dataContratacao;
    
    public String SetRegistro()
    {
        return registro;
    }
    public Data serdataContratacao ()
    {
        return dataContratacao;
    }


    public Professor(){}
    
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
    String cpf, LocalDate dataInsercao, String registro, Data dataContratacao)
    {
        
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
}
