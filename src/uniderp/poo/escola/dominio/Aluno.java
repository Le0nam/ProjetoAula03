package uniderp.poo.escola.dominio;

import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Aluno extends Pessoa{

    private String matricula;
    private Data dataMatricula;

    public String SetMatricula()
    {
        return matricula;
    }
    public Data SetdataMatricula()
    {
        return dataMatricula;
    }

    public Aluno(){}
    
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
    String cpf, LocalDate dataInsercao, String matricula, Data dataMatricila){super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    this.matricula = matricula;
    this.dataMatricula = dataMatricila;

    }
    
}

