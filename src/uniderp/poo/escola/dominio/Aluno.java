package uniderp.poo.escola.dominio;

import java.time.LocalDate;


public class Aluno extends Pessoa{

    private String matricula;
    private String dataMatricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(String dataMatricila) {
        this.dataMatricula = dataMatricila;
    }

    public Aluno(){}
    
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
    String cpf, LocalDate dataInsercao, String matricula, String dataMatricila){super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    this.matricula = matricula;
    this.dataMatricula = dataMatricila;

    }
    
}

