package softwareEngineering.team15.prediction.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import softwareEngineering.team15.prediction.AImodel.PredictionModel;
import softwareEngineering.team15.user.model.Users;
import softwareEngineering.team15.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class PredictionService {
    private final PredictionModel predictionModel;
    private final UserRepository userRepository;
    public int getResult(Long userId){
        Users user = userRepository.findById(userId).orElseThrow();
        return predictionModel.getResult(user);
    }
}
