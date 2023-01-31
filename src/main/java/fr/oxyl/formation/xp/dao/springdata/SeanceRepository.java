package fr.oxyl.formation.xp.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @link https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.core-concepts
 */
@Repository
public interface SeanceRepository extends CrudRepository<SeanceEntity, Long> {
}
