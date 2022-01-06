package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping("/log-test")
	public String logTet() {
		String name = "Spring";
		log.info(" info log={}", name);

		return "ok";
	}
}
