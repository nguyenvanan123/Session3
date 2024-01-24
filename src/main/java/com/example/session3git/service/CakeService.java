package com.example.session3git.service;

import com.example.session3git.model.Cake;
import com.example.session3git.repository.CakeRepository;
import com.example.session3git.model.Cake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    public CakeRepository cakeRepository;

    public List<Cake> getCakeList () {
        return cakeRepository.getCakeList ( );
    }

    public void createCake ( Cake cake ) {
        cakeRepository.createCake ( cake );
    }
}
