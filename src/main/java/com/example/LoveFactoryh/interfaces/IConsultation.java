package com.example.LoveFactoryh.interfaces;

import com.example.LoveFactoryh.Model.CConsultation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IConsultation extends CrudRepository <CConsultation, Integer> {
}
