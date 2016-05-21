package microservice.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class RootController {

  @RequestMapping(Array("/"))
  //def handleRootRequest(): String = "redirect:/hotels"
  def handleRootRequest(): String = "redirect:/index.html"
}
