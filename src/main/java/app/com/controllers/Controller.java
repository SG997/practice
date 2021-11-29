package app.com.controllers;

import app.com.dao.DataModel;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/index")
@RestController
public class Controller {

    @GetMapping("/firstGet")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @PostMapping("/firstPost")
    public DataModel post(@RequestBody DataModel dataModel) {
        dataModel.setAge(dataModel.getAge() + 1);
        return dataModel;
    }
}
