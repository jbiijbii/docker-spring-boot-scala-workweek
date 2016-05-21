package microservice.web

import javax.validation.Valid
import microservice.domain.{Response, Workweek}
import microservice.service.WorkweekRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation._
import java.util.concurrent.atomic.AtomicInteger

@RestController
class WorkweekController @Autowired()(private val workweekRepository: WorkweekRepository)
{

    private val template = "Invalid date %s"
    private val workweekTemplate = "%sWW%s"
    private var counter: AtomicInteger = new AtomicInteger


    @RequestMapping(value  = Array("/workweek/{ww_date}"),
                    method = Array(RequestMethod.GET)
                    )
    def greeting(@PathVariable("ww_date") ww_date: String) = {

        val wwInstance = workweekRepository.findOne(ww_date)
        if (wwInstance != null) {
            var year = wwInstance.getYear()
            var week = wwInstance.getWeek()
            Response(counter.incrementAndGet(),
                      "success",
                      "",
                      String.format(workweekTemplate, year, week));
        } else {
            Response(counter.incrementAndGet(),
                      "error",
                      String.format(template, ww_date),
                      "");
        }
    }

}

