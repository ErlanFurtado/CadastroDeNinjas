package dev.java10x.cadastroDeNinjas.ninjas;

import dev.java10x.cadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

//Entity serve para transformar uma classe em uma entidade do DB
@Entity
@Table (name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
