package one.digitalinnovation.gof.model.repositories;

import one.digitalinnovation.gof.model.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>  {
}
