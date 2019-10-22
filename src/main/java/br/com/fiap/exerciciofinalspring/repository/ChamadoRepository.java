package br.com.fiap.exerciciofinalspring.repository;

import br.com.fiap.exerciciofinalspring.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
