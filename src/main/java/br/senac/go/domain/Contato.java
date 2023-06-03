package br.senac.go.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "contato")
public class Contato extends BaseModel {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    //Relacionamento Bi-direcional

    @ManyToOne(fetch = FetchType.LAZY)
    private Aluno aluno;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Escola> escolas;

}
