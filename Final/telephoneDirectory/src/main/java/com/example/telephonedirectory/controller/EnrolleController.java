package com.example.telephonedirectory.controller;

import com.example.telephonedirectory.entity.Enrolle;
import com.example.telephonedirectory.model.EnrolleCreateModel;
import com.example.telephonedirectory.model.EnrolleUpdateModel;
import com.example.telephonedirectory.repository.EnrolleRepository;
import com.example.telephonedirectory.service.EnrolleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/enrolle")
public class EnrolleController {

    @Autowired
    EnrolleService enrolleService;

    @Autowired
    EnrolleRepository enrolleRepository;

    @PostMapping(value = "/create",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public String createEnrolle(@RequestBody EnrolleCreateModel enrolleCreateModel) {
        enrolleService.createEnrolle(enrolleCreateModel);
        return "";
    }

    @PutMapping(value = "/update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateEnrolle(@RequestBody EnrolleUpdateModel enrolleUpdateModel) {
        enrolleService.updateEnrolle(enrolleUpdateModel);
        return "";
    }

    @DeleteMapping(value = "/delete",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String delete(@RequestBody String id) {
        enrolleService.deleteEnrolle(id);
        return "";
    }

    @PostMapping(value = "/find",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Enrolle> findByEnrolleId(@RequestBody String id) {
        enrolleService.findByEnrolleId(id);
        return this.enrolleRepository.findById(id);
    }


    @GetMapping("/docker")
    public String docker(){
        return "Welcome-Docker";
    }
}
