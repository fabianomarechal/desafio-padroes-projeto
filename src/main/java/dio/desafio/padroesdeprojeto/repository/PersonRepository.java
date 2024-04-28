package dio.desafio.padroesdeprojeto.repository;

import dio.desafio.padroesdeprojeto.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
