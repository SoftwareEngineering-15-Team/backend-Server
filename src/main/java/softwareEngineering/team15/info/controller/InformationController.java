package softwareEngineering.team15.info.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import softwareEngineering.team15.info.service.InformationService;

@Controller
@RequiredArgsConstructor
public class InformationController {
    private final InformationService informationService;
    @GetMapping("informations")
    public String toInformation(Model model){
        model.addAttribute("infoList", informationService.getAllInformation());
        return "information";
    }

    @GetMapping("informations/{infoId}")
    public String toInfoDetail(@PathVariable("infoId")Long id, Model model){
        model.addAttribute("infoDetail", informationService.getInformatino(id));
        return "informationdetail";
    }

}

