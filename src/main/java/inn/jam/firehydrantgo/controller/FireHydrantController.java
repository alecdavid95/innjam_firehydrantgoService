package inn.jam.firehydrantgo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireHydrantController {

	@GetMapping(value = "/ping/")
	@ResponseBody
	public String getMongoWipByExcelNAme() {
		return "Service is Up";
	}

}
