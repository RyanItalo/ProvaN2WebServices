package br.senac.go.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "escola")
public class Escola extends BaseModel{
    private String nome;
    private String endereco;

}
