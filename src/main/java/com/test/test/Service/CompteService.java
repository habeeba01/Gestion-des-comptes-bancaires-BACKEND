package com.test.test.Service;
import com.test.test.Model.CompteModel;
import com.test.test.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository  ;
    //add
    public CompteModel save(CompteModel compteModel){
        return compteRepository.save(compteModel);
    }
}
