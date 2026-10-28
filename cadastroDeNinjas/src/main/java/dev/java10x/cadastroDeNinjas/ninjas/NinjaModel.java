package dev.java10x.cadastroDeNinjas.ninjas;

import dev.java10x.cadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity serve para transformar uma classe em uma entidade do DB
@Entity
@Table (name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //serve para gerar o ID automaticamente
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //muitos ninjas para uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //foreing key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
