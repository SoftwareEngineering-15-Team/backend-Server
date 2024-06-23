package softwareEngineering.team15.prediction.AImodel;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import softwareEngineering.team15.user.model.Users;

import java.util.Random;

@Component
public class PredictionModel {

    public int getResult(Users user){
        Random random = new Random();
        int randomNumber = random.nextInt(101- user.getId().intValue());
        return randomNumber;
    }
}
