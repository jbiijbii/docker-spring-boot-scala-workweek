package microservice.domain

//import javax.persistence.Id
//import javax.persistence.GeneratedValue
//import java.lang.Long
//import javax.persistence.Entity
import scala.beans.BeanProperty
//import org.hibernate.validator.constraints.NotEmpty


//@BeanProperty is required in order to have Java Bean Style getter/setter that can be inspected by Spring
case class Response(@BeanProperty id: Int,
                    @BeanProperty status: String,
                    @BeanProperty message: String,
                    @BeanProperty workweek: String)

