package example.repositories;

import java.util.List;
import java.util.Optional;

import example.domain.Owner;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

// navigate to autowired candidates: can't distinguish between variants (show class?)
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    @Override
    List<Owner> findAll();

    Optional<Owner> findByName(String name);
}