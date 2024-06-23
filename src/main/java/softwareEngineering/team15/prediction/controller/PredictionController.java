package softwareEngineering.team15.prediction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import softwareEngineering.team15.prediction.AImodel.PredictionModel;
import softwareEngineering.team15.prediction.service.PredictionService;

@Controller
@RequiredArgsConstructor
public class PredictionController {

    private final PredictionService predictionService;
    @GetMapping("result")
    public String toResult(Model model){
        model.addAttribute("result", predictionService.getResult(Long.valueOf(1)));
        return "result";
    }

}
