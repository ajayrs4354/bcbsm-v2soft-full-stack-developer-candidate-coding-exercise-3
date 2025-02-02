package com.ajay.springjwt.service;


import com.ajay.springjwt.models.FormDocument;
import com.ajay.springjwt.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FormService {

    @Autowired
    private FormRepository formRepo;

    public FormDocument save(FormDocument form) throws Exception{

        return formRepo.save(form);
    }


    public List<FormDocument> findAllById(Integer id) {
        return formRepo.findByUserId(id);
    }

    public List<FormDocument> findAll() {
        return formRepo.findAll();
    }
}
