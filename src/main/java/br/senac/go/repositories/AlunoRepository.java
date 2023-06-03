package br.senac.go.repositories;

import br.senac.go.domain.Aluno;
import br.senac.go.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    //List<Pessoa> findPessoaByNomeAndAndDataInicioOrDataFimAndContatos();
    List<Aluno> findPessoasByNomeLikeIgnoreCase(String nome);
}
