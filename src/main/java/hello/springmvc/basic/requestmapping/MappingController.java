package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MappingController {
	@RequestMapping(value = {"/hello-basic", "/hello-go"}, method = RequestMethod.GET)
	public String helloBasic() {
		log.info("helloBasic");
		return "ok";
	}
}
