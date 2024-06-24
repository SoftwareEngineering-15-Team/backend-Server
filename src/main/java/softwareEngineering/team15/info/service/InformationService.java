package softwareEngineering.team15.info.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softwareEngineering.team15.info.model.Infoform;
import softwareEngineering.team15.info.model.Information;
import softwareEngineering.team15.info.repository.InformationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InformationService {
    private final InformationRepository informationRepository;

    public List<Infoform> getAllInformation(){

        List<Information> infomations = informationRepository.findAll();
        List<Infoform> infoforms = new ArrayList<>();

        for(Information i : infomations){
            infoforms.add(new Infoform(i));
        }

        return infoforms;
    }

    public Infoform getInformatino(Long id){
        Information information = informationRepository.findById(id).orElseThrow();
        return new Infoform(information);
    }
}
