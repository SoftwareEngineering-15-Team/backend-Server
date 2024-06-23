package softwareEngineering.team15.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softwareEngineering.team15.user.model.Statusform;
import softwareEngineering.team15.user.model.UserStatuses;
import softwareEngineering.team15.user.model.Users;
import softwareEngineering.team15.user.repository.UserRepository;
import softwareEngineering.team15.user.repository.UserStatusRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserStatusRepository userStatusRepository;
    private final UserRepository userRepository;
    public void createOrUpdateStatus(Statusform statusform, Long id){
        Users user = userRepository.findById(id).orElseThrow();
        UserStatuses userStatuses;
        if(user.getUserStatus()==null){
            userStatuses = new UserStatuses();
            userStatuses.setUserStatuses(statusform, user);
            userStatusRepository.save(userStatuses);
        }else{
            userStatuses = user.getUserStatus();
            userStatuses.setUserStatuses(statusform, user);
            userStatusRepository.save(userStatuses);
        }
    }
    public Statusform getStatusById(Long id){
        Users user = userRepository.findById(id).orElseThrow();
        return new Statusform().setStatus(user.getUserStatus());
    }

}
