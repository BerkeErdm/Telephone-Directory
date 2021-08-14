package com.example.telephonedirectory.service;

import com.example.telephonedirectory.entity.Enrolle;
import com.example.telephonedirectory.model.EnrolleCreateModel;
import com.example.telephonedirectory.model.EnrolleUpdateModel;

import java.util.Optional;

public interface EnrolleService {

    void createEnrolle(EnrolleCreateModel enrolleCreateModel);

    void updateEnrolle(EnrolleUpdateModel enrolleUpdateModel);

    void deleteEnrolle(String id);

    Optional<Enrolle> findByEnrolleId (String enrolleID);


}
