package com.example.telephonedirectory.service;

import com.example.telephonedirectory.entity.Enrolle;
import com.example.telephonedirectory.model.EnrolleCreateModel;
import com.example.telephonedirectory.model.EnrolleUpdateModel;
import com.example.telephonedirectory.repository.EnrolleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Transactional
public class EnrolleServiceImpl implements EnrolleService {

    @Autowired
    EnrolleService enrolleService;

    @Autowired
    EnrolleRepository enrolleRepository;

    @Override
    public void createEnrolle(EnrolleCreateModel enrolleCreateModel) {
        Enrolle enrolle = new Enrolle();
        enrolle.setId(enrolleCreateModel.getId());
        enrolle.setName(enrolleCreateModel.getName());
        enrolle.setSurname(enrolleCreateModel.getSurname());
        enrolle.setPhoneNumber(enrolleCreateModel.getPhoneNumber());
        enrolle.setDescription(enrolleCreateModel.getDescription());
        this.enrolleRepository.save(enrolle);
    }

    @Override
    public void updateEnrolle(EnrolleUpdateModel enrolleUpdateModel) {
        Enrolle enrolle = this.enrolleRepository.findById(enrolleUpdateModel.getId()).orElseThrow(EntityNotFoundException::new);
        enrolle.setName(enrolleUpdateModel.getName());
        enrolle.setSurname(enrolleUpdateModel.getSurname());
        enrolle.setPhoneNumber(enrolleUpdateModel.getPhoneNumber());
        enrolle.setDescription(enrolleUpdateModel.getDescription());
        this.enrolleRepository.save(enrolle);
    }

    @Override
    public void deleteEnrolle(String id) {
        if (!this.enrolleRepository.findById(id).isPresent()) {
            throw new EntityNotFoundException();
        }
        this.enrolleRepository.deleteById(id);
    }

    public Optional<Enrolle> findByEnrolleId(String enrolleID) {

        if (!this.enrolleRepository.findById(enrolleID).isPresent()) {
            throw new EntityNotFoundException();
        }
        return enrolleRepository.findById(enrolleID);

    }
}

