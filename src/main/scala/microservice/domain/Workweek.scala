package microservice.domain

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity
import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

@Entity
class Workweek {

  @Id
  @BeanProperty
  var id: String = _

  @BeanProperty
  @NotEmpty
  var year: String = _

  @BeanProperty
  @NotEmpty
  var week: String = _

  @BeanProperty
  @NotEmpty
  var day: String = _
}
