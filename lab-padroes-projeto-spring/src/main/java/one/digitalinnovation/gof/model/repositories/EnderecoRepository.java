package one.digitalinnovation.gof.model.repositories;

import one.digitalinnovation.gof.model.entities.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
