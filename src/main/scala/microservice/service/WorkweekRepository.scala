package microservice.service

import org.springframework.data.repository.CrudRepository
import microservice.domain.Workweek
import java.lang.Long

//trait WorkweekRepository extends CrudRepository[Workweek, Long]
trait WorkweekRepository extends CrudRepository[Workweek, String]