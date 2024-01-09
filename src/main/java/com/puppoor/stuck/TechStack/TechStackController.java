package com.puppoor.stuck.TechStack;

import javax.validation.Valid;
import org.apache.logging.log4j.Level;
import org.aspectj.bridge.Message;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/techstack")
public class TechStackController {
    private final TechStackService techStackService;
    Logger logger = LogManager.getLogger(TechStackController.class);

    @Autowired
    public TechStackController(TechStackService techStackService) {
        this.techStackService = techStackService;
    }

    @GetMapping
    public List<TechStack> getTechStack(){
        return techStackService.getTechStack();
    }
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void registerNewTechstack(@Valid @RequestBody  TechStackRequestDTO requestDTO){
        try {
                 techStackService.addNewTechStack(requestDTO);
        }
        catch (Exception e){
            logger.log(Level.ERROR, Marker.ANY_MARKER, Message.ERROR,e);
        }
    }
    @DeleteMapping(path="{techstackid}")
    public void deleteTechStack(@Valid @PathVariable("techstackid") Long techstackid){
        techStackService.deleteTechStack(techstackid);
    }
}
