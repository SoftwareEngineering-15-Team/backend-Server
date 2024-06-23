package softwareEngineering.team15.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("clicktoinput")
    public String toChecktoInput(){
        return "clicktoinput";
    }
    @GetMapping("main")
    public String toMain(){
        return "main";
    }

}
