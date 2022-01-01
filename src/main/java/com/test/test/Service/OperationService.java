package com.test.test.Service;

import com.test.test.Model.CompteModel;
import com.test.test.Model.OperationModel;
import com.test.test.Model.RetraitModel;
import com.test.test.Model.VersementModel;
import com.test.test.Repository.CompteRepository;
import com.test.test.Repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;


@Service @Transactional
public class OperationService implements BanqueService{
    @Autowired
    OperationRepository operationRepository ;
    @Autowired
    CompteRepository compteRepository ;


    @Override
    public CompteModel check(Long codeCompte) {
        CompteModel compte= compteRepository.findById(codeCompte).orElse(null);
        if(compte == null)
            throw new  RuntimeException("Compte introuvable");
        return compte;
    }

    @Override
    public void versement(Long codeCompte, double montant) {
        CompteModel compte = compteRepository.getOne(codeCompte);
        VersementModel v= new VersementModel(new Date(), montant, compte);
        operationRepository.save(v);
        compte.setSolde(compte.getSolde() + montant);
        compteRepository.save(compte);
    }

    @Override
    public void retrait(Long codeCompte, double montant) {
        CompteModel compte = compteRepository.getOne(codeCompte);
        if((compte.getSolde() ) < montant)
            throw new RuntimeException("Solde insuffisant");
        RetraitModel r= new RetraitModel (new Date(), montant, compte);
        operationRepository.save(r);
        compte.setSolde(compte.getSolde() - montant);
        compteRepository.save(compte);
    }

    @Override
    public void virement(Long  codeCompteFrom, Long codeCompteTo, double montant) {
        if(codeCompteFrom.equals(codeCompteTo))
            throw new RuntimeException("Opération impossible");
        retrait(codeCompteFrom,montant);
        versement(codeCompteTo,montant);
    }
    //
    public List<OperationModel> findAll() {
        return operationRepository.findAll();
    }
    //
   @Override
    public Page<OperationModel> list(Long codeCompte, int page, int size) {
       return operationRepository.list(codeCompte, new PageRequest(page, size));
    }
}
