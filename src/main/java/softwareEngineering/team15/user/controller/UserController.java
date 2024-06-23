package softwareEngineering.team15.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import softwareEngineering.team15.user.model.Statusform;
import softwareEngineering.team15.user.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("inputinfo")
    public String toInputInfo(Model model, Statusform statusform){
        model.addAttribute("statusform", statusform);
        return "inputinfo";
    }
    @PostMapping("submit")
    public String submitForm(@ModelAttribute("statusform") Statusform statusform){
        System.out.println(statusform.getGender());
        userService.createOrUpdateStatus(statusform, Long.valueOf(1));
        return "submit_success";
    }
    @GetMapping("viewinfo")
    public String toViewInfo(Model model){
        Statusform statusform = userService.getStatusById(Long.valueOf(1));
        model.addAttribute("statusform", statusform);
        return "viewinfo";
    }
}
