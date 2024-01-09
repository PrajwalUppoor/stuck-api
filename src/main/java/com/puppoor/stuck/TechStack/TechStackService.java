package com.puppoor.stuck.TechStack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TechStackService {
private final TechStackRepository techStackRepository;

    @Autowired
    public TechStackService(TechStackRepository techStackRepository) {
        this.techStackRepository = techStackRepository;
    }
    public List<TechStack> getTechStack(){
        return techStackRepository.findAll();
    }

    public synchronized void  addNewTechStack(@org.jetbrains.annotations.NotNull TechStackRequestDTO requestDTO) {

        TechStack techStack=new TechStack(requestDTO.getTechName(),requestDTO.getServiceType(),requestDTO.getCreationDate(),requestDTO.getCreatedBy(),requestDTO.getLastUpdatedDate(),requestDTO.getLastUpdatedBy());
        techStackRepository.save(techStack);
    }

    public void deleteTechStack(Long techstackid) {
        boolean exists =techStackRepository.existsById(techstackid);
        if(!exists){
            throw new IllegalStateException("Techstack with id"+techstackid+" does not exist");
        }
        techStackRepository.deleteById(techstackid);
    }
    public void getTechBySType(TechStack techStack){
       List<TechStack> techStackbyService= techStackRepository.findByServiceType(techStack.getServiceType());
                System.out.println(techStackbyService);
    }
}
